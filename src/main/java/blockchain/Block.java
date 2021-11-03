package blockchain;

import java.io.Serializable;
import java.util.Date;

class Block implements Serializable {
	private static final long serialVersionUID = 2L;
	String prevHash;
	long timestamp = new Date().getTime();
	int id;
	int magicNumber;
	int minerId;
	String blockData;
	int cycles = 0;

	Block(String prevHash, int id, String blockData) {
		this.prevHash = prevHash;
		this.id = id;
		this.blockData = blockData;
	}

	String generateHashWithMagicNumber(int magicNumber) {
		cycles++;
		return Sha256.applySha256(prevHash + id + minerId + timestamp + magicNumber + blockData);
	}

	boolean hashValidZeros(int zeros) {
		String validRegex = "0{" + zeros + "}\\w*";
		String hash = generateHash();
		return hash.matches(validRegex);
	}

	String generateHash() {
		return Sha256.applySha256(prevHash + id + minerId + timestamp + magicNumber + blockData);
	}

	void printInfo() {
		StringBuilder blockPrint = new StringBuilder();
		blockPrint.append("Block:");
		blockPrint.append("\nCreated by miner # ").append(minerId);
		blockPrint.append("\nId: ").append(id);
		blockPrint.append("\nTimestamp: ").append(timestamp);
		blockPrint.append("\nMagic number: ").append(magicNumber);
		blockPrint.append("\nHash of the previous block:\n").append(prevHash);
		blockPrint.append("\nHash of the block:\n").append(generateHash());
		blockPrint.append("\nBlock took ").append(cycles).append(" cycles to generate");
		blockPrint.append("\nBlock data: ");

		if (blockData.isEmpty()) {
			blockPrint.append("no messages");
		} else {
			blockPrint.append("\n").append(blockData);
		}
		System.out.println(blockPrint);
	}
}