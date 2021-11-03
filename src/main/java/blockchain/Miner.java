package blockchain;

import java.util.Random;
import java.util.concurrent.Callable;

import static java.lang.Thread.currentThread;

public class Miner implements Callable<Block> {
	BlockChain blockchain;
	int id;
	String BlockData;

	Miner(BlockChain blockchain){
		this.blockchain = blockchain;
	}

	public void setId(int id){
		this.id = id;
	}

	public Block call(){
		return generateNewBlock();
	}

	Block generateNewBlock(){
		int currChainSize = blockchain.size();
		String prevHash;
		if (currChainSize == 0) {
			prevHash = "0";
		}else{
			Block prevBlock = blockchain.getLastBlock();
			prevHash = prevBlock.generateHash();
		}
		int blockId = currChainSize + 1;
		Block newBlock = new Block(prevHash, blockId, BlockData);
		newBlock.minerId = id;
		newBlock.magicNumber = findMagicNumber(newBlock);
		return newBlock;
	}

	int findMagicNumber(Block block){
		Random random = new Random(Integer.MAX_VALUE);
		String validHashRegex = String.format("0{%d}\\w*", blockchain.getZeros());
		int magicNumber;
		String hash;
		do{
			magicNumber = random.nextInt();
			hash = block.generateHashWithMagicNumber(magicNumber);
		}while(!hash.matches(validHashRegex) & !currentThread().isInterrupted());
		return magicNumber;
	}
}
