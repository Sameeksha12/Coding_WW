package part2_Ques;

public class Singleton {
	private static Singleton s = new Singleton();
	private int value;
	private String msg;
	private Singleton(){
		//constructor to assign the other property of class
		value= 10;
		msg="Default message";
	}
	
	public static Singleton getInstance(){
		
		return s;
	}
	
	public void printvalues(){
		System.out.println("Value: "+value+"Msg:"+msg);
	} 
}
