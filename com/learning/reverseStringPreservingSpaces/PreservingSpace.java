/*Write a java program reverse string by preserving the white spaces*/
package com.learning.reverseStringPreservingSpaces;
public class PreservingSpace {
	public static String  reverseStrWithSpace(String str) {
		char arr1[] = str.toCharArray();
		char arr2[] = new char[arr1.length];
		
		for (int i=0;i<=arr1.length-1;i++) {
			if (arr1[i]==' ') {
				arr2[i] =arr1[i];
			}
		}
		int j=arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			if (arr1[i]!=' ') {
				if(arr2[j]==' ') {
					j--;
				}
				arr2[j]=arr1[i];
				j--;
			}
		}
		String newStr  =new String(arr2);
		return newStr;
	}
}
