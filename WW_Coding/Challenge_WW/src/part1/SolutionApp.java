package part1;

import java.util.concurrent.*;

class OutputFormat {

	int number;
	boolean result;

	OutputFormat(int num, boolean r) {
		this.number = num;
		this.result = r;

	}
}

public class SolutionApp {
	public static void main(String args[]) {
		ConcurrentLinkedQueue<Integer> inputqueue = new ConcurrentLinkedQueue<Integer>();
		ConcurrentLinkedQueue<OutputFormat> outputqueue = new ConcurrentLinkedQueue<OutputFormat>();
		System.out.println("Sample run for Prime Checker:");
		Thread randomizer = new Thread(new Randomizer(inputqueue, outputqueue));
		Thread prime = new Thread(new Prime(inputqueue, outputqueue));
		randomizer.start();
		prime.start();
	}
}