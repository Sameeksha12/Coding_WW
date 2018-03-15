package part2_coding;

public class Palindrome {

	// check using recursive method
	public static boolean isPalindrome(String str) {
		if ((str.length() == 0) || (str.length() == 1))
			return true;
		else {
			if (str.charAt(0) == str.charAt(str.length() - 1))
				return isPalindrome(str.substring(1, str.length() - 1));
		}
		return false;
	}

	// check using library method
	public static void checkPalindrome(String s) {
		// reverse the given String
		String reverse = new StringBuffer(s).reverse().toString();

		if (s.equals(reverse))
			System.out.println(s + " is Palindrome");

		else
			System.out.println(s + " is not Palindrome");
	}

	public static void main(String[] args) throws java.lang.Exception {
		checkPalindrome("madam");
		checkPalindrome("hello");
		System.out.println(isPalindrome("madam"));
		System.out.println(isPalindrome("hello"));

	}
}
