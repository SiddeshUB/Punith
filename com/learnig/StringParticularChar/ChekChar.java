/*write java progrom to check whether a string contians a particular character or not*/
package com.learnig.StringParticularChar;

public class ChekChar {
	public static String  checkCharacter(String str,char ch) {
		char[] arr1 = str.toCharArray();
		for(int i=0 ;i<=arr1.length-1;i++) {
			if (arr1[i]==ch) {
				return ("character "+ch+" is present");
			}
		}
		return ("character "+ch+" is not present");
	}
}
