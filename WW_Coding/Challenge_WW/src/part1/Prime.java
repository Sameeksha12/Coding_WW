package part1;

import java.util.concurrent.*;

public class Prime implements Runnable {
	ConcurrentLinkedQueue<Integer> inputqueue;
	ConcurrentLinkedQueue<OutputFormat> outputqueue;

	Prime(ConcurrentLinkedQueue<Integer> in, ConcurrentLinkedQueue<OutputFormat> out) {
		this.inputqueue = in;
		this.outputqueue = out;
	}

	public void run() {
		int num;
		System.out.println("Prime checker started");
		for (int i = 0; i < 10; i++) {
			while (!inputqueue.isEmpty()) {
				num = inputqueue.poll();
				OutputFormat o = new OutputFormat(num, isPrime(num));
				outputqueue.add(o);
			}
			try {
				Thread.currentThread().sleep(800);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	// logic to check if number is prime or not
	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}

		if (num > 2 && num % 2 == 0) {

			return false;
		}
		int top = (int) Math.sqrt(num);
		for (int i = 3; i < top; i += 2) {
			if (num % i == 0) {

				return false;
			}
		}

		return true;
	}

}
