package blockchain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatSimulator {
	private static final ChatSimulator instance = new ChatSimulator();
	List<String> names = List.of("Steve", "Frank", "Ed", "Tracy", "Pop", "Kate", "Riley", "Ant", "Reese", "Tristan");
	int threads = 4;
	Set<ChatBot> bots;
	ExecutorService chatService;

	public static ChatSimulator getInstance() {
		return instance;
	}

	void putChatInChain(BlockChain blockchain){
		bots = new HashSet<>();
		chatService = Executors.newFixedThreadPool(threads);
		names.forEach(bot -> bots.add(new ChatBot(bot, blockchain)));
		bots.forEach(chatService::submit);
	}

	private ChatSimulator(){}

	void stop() {
		bots.forEach(ChatBot::stop);
		chatService.shutdown();
	}


}
