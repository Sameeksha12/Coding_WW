package part2_Ques;

public class TaskThread implements Runnable {
	  
    private String command;
//constructor of TaskThread class 
    public TaskThread(String s){
        this.command=s;
    }
//override run method of thread as it implements runnable
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Starting. enter your command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End of task");
    }
//processCommand method
    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//to return the command in string format
    public String toString(){
        return this.command;
    }
}
