package blockchain;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Scanner in = new Scanner(System.in);
		System.out.println("Pick starting zero amount: ");
		int zeros = in.nextInt();;
		System.out.println("Pick number of blocks to create");
		int blocksNum = in.nextInt();
		System.out.println("Chat on or off? 1 = on, 2 = off: ");
		int chat = in.nextInt();

		BlockFactory blockFactory = BlockFactory.getInstance();
		BlockChain blockchain = blockFactory.generateBlockChainSize(zeros, 0);
		ChatSimulator chatSimulator = ChatSimulator.getInstance();
		if(chat==1){
			chatSimulator.putChatInChain(blockchain);
		}
		blockFactory.extend(blockchain, blocksNum);
		Thread.sleep(10000);
		if(chat==1){
			chatSimulator.stop();
		}
		System.out.println("BlockChain Created and All Threads Terminated");
	}
}
