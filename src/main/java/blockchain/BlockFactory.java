package blockchain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockFactory {
	private static final BlockFactory instance = new BlockFactory();
	int threads = Runtime.getRuntime().availableProcessors();

	BlockFactory() {}

	public static BlockFactory getInstance() {
		return instance;
	}

	void setThreadsAmt(int threads){
		int numThreads = Runtime.getRuntime().availableProcessors();
		this.threads = Math.min(threads, numThreads);
	}

	BlockChain generateBlockChainSize(int zeros, int blocksNum) throws ExecutionException, InterruptedException {
		BlockChain blockchain = new BlockChain(zeros);

		extend(blockchain, blocksNum);
		return blockchain;
	}

	void extend(BlockChain blockchain, int blocksNum) throws ExecutionException, InterruptedException {
		for (int i = 0; i < blocksNum; i++){
			extendByOneBlock(blockchain);
		}
	}

	void extendByOneBlock(BlockChain blockChain) throws ExecutionException, InterruptedException{
		Timer.reset();
		Set<Callable<Block>> miners = new HashSet<>();
		ExecutorService minerService = Executors.newFixedThreadPool(threads);
		ArrayList<String> messages = new ArrayList<>(blockChain.messages);
		blockChain.messages.removeAll(messages);
		String BlockData = String.join("\n", messages);

		for (int i = 1; i<= threads; i++){
			Miner miner = new Miner(blockChain);
			miner.setId(i);
			miner.BlockData = BlockData;
			miners.add(miner);
		}

		Block result = minerService.invokeAny(miners);
		result.printInfo();
		blockChain.add(result);
		minerService.shutdownNow();
	}
}
