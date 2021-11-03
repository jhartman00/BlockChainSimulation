package blockchain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BlockChain implements Serializable {
	private static final long serialVersionUID = 1L;
	ArrayList<Block> blockchain = new ArrayList<>();
	List<String> messages = Collections.synchronizedList(new ArrayList<>());
	private int zeros;

	BlockChain(int zeros) {
		this.zeros = zeros;
	}

	public int getZeros() {
		return this.zeros;
	}

	synchronized void addMessage(String name, String message) {
		messages.add(name + ": " + message);
	}

	void add(Block block) {
		if (canAdd(block)) {
			blockchain.add(block);
			adjustZeros();
		}
	}

	boolean canAdd(Block block) {
		return block.hashValidZeros(zeros) & canHaveValid(block);
	}

	void adjustZeros() {
		long genTime = Timer.getElapsedTimeInSeconds();
		printGenTime(genTime);
		if (genTime > 60) {
			zeros -= 1;
			System.out.printf("N was decreased to %d\n\n", zeros);
		} else if (genTime < 10) {
			zeros += 1;
			System.out.printf("N was increased to %d\n\n", zeros);
		} else {
			System.out.printf("N stays the same (%d)\n\n", zeros);
		}
	}

	boolean canHaveValid(Block block) {
		int id = block.id;
		boolean valid = true;
		if (id > 1) {
			String prevHash = block.prevHash;
			Block prevBlock = getBlockAt(id - 1);
			String hash = prevBlock.generateHash();
			if (!hash.equals(prevHash)) {
				valid = false;
			}
		}
		return valid;
	}

	Block getLastBlock() {
		return (this.blockchain.size() > 0) ? blockchain.get(size() - 1) : null;
	}

	public static void printGenTime(long genTime) {
		System.out.printf("Block was generating for %d seconds\n", genTime);
	}

	Block getBlockAt(int id) {
		return blockchain.get(id - 1);
	}

	public int size() {
		return this.blockchain.size();
	}

}

