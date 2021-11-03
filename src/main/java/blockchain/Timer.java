package blockchain;

import java.util.concurrent.TimeUnit;

public class Timer {
	static private long start;
	static void reset(){
		start = System.nanoTime();
	}
	static long getElapsedTimeInSeconds(){
		long end = System.nanoTime();
		long elapsed = end - start;
		return TimeUnit.SECONDS.convert(elapsed, TimeUnit.NANOSECONDS);
	}
}
