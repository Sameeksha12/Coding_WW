package part2_Ques;

import java.io.IOException;

public class SingletonDemo {
	public static void main (String args[])throws IOException{
	Singleton obj= Singleton.getInstance();
	obj.printvalues();
	}
}
