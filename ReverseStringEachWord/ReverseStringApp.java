package ReverseStringEachWord;

import java.util.Scanner;

public class ReverseStringApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		String reverseStr=ReverseString.reverseStr(str);
		System.out.println(reverseStr);
	}
}
