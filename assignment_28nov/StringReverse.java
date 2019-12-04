package assignment_28nov;

import java.util.Scanner;

public class StringReverse {

	/**
	 * This method takes string as input and reverses the string
	 *
	 */
	public static String reverseString(String str) {
		char ch[] = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}

	public static void main(String[] args) {

		StringReverse strrev = new StringReverse();
		System.out.println("Please enter a string to reverse");
		// taking input from user
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// calling stringreverse() method by passing user input
		System.out.println(strrev.reverseString(str));

	}

}
