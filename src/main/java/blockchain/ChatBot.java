package blockchain;

import java.util.Date;
import java.util.Random;

public class ChatBot implements Runnable{
	String name;
	BlockChain blockchain;
	int maxSleep = 150;
	boolean stopped = false;

	public ChatBot(String name, BlockChain blockchain){
		this.name = name;
		this.blockchain = blockchain;
	}

	String generateMessage(){
		String[] messages = {"Hello, how are you?", "Im good! How are you?", "How's it hanging?",
				"How bout' them Saints?", "What about them?", "I'm tired!", "Maybe you should get some sleep.",
				"What's the weather like today?", "Sunny, with a small chance of rain.", "This chat is kind of boring!",
				"Well what do you expect, we're bots!", "I have to let my dogs out, brb.", "Who let the dogs out!",
				"That's sad, its 2021!", "ROFL!!!", "I'm getting way too old for this."};

		Random random = new Random();
		int messageNum = random.nextInt(16) - 1;
		return messages[messageNum] + " " + new Date().getTime();
	}

	void sendMessage(){
		blockchain.addMessage(name, generateMessage());
	}

	void stop() {
		stopped = true;
	}

	@Override
	public void run() {
		long sleepTimer = new Random().nextInt(maxSleep);

		while(!stopped){
			sendMessage();
			try{
				Thread.sleep(sleepTimer);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
