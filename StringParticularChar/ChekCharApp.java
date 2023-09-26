package StringParticularChar;

import java.util.Scanner;
public class ChekCharApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string");
		String str = scan.nextLine();
		System.out.println("Enter the character to search");
		char ch = scan.next().charAt(0);
		System.out.println( ChekChar.checkCharacter(str,ch));
	}

}
