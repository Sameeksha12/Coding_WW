package part2_coding;
import java.io.*;

public class StringReverse {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// option to end the program
		char opt = 'Y';
		while (opt != 'N') {
			// ask for the input string to reverse from user
			System.out.println("Enter the string you want to reverse:");
			String input = br.readLine();
			String rev = "";
			// traverse from end index to the zero index and add it to rev
			// string
			for (int i = input.length() - 1; i >= 0; i--) {
				rev += input.charAt(i);
			}
			
			System.out.println("Reversed String:" + rev);
			
			System.out.println("Do you wish to continue ? Press Y  for Yes or N for No");
			opt = (br.readLine().charAt(0));
		}
	}

}
