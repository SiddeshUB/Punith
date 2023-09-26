/*Write a java program to reverse the string */
package com.learnig.reverseString;

public class ReverseStr {
	public static String  reverseStr(String str) {
		char[] arr1 = str.toCharArray();
		char[] arr2 = new char[arr1.length];
		int j=arr1.length-1;
		for (int i=0;i<=arr1.length-1;i++) {
			arr2[j] = arr1[i];
			j--;
		}
		String newStr  =new String(arr2);
		return newStr;
	}
}
