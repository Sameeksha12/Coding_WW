package part2_Ques;

import java.util.concurrent.Executors;

public class ExecutorService {
	public static void main(String[] args) {
        java.util.concurrent.ExecutorService e = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable task = new TaskThread("" + i);
            e.execute(task);
          }
        e.shutdown();
        //check whether the executor service is ended and print finish
        while (!e.isTerminated()) {
        }
        System.out.println("Finished all tasks");
    }
}