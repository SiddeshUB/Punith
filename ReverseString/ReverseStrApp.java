package ReverseString;

import java.util.Scanner;
public class ReverseStrApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		System.out.println(ReverseStr.reverseStr(str));
	}

}
