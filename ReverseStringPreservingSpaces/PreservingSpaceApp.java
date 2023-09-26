package ReverseStringPreservingSpaces;

import java.util.Scanner;
public class PreservingSpaceApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		System.out.println(PreservingSpace.reverseStrWithSpace(str));
	}
}
