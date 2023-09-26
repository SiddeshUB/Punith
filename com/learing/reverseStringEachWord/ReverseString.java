/*Write a java program to reverse the each word in a sentence/string */
package com.learing.reverseStringEachWord;
public class ReverseString {
	public static String  reverseStr(String str) {
		String arr[] = str.split(" ");
		
		String reverseSentence ="";
		for (int i=0;i<=arr.length-1;i++) {
			String word = arr[i];
			String reverseWord = "";
			for (int j=word.length()-1;j>=0;j--) {
				reverseWord +=word.charAt(j);
			}
			reverseSentence +=reverseWord + " ";
		}
		return reverseSentence;
	}
}
