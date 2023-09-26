/*Write a java program find the greatest no present in array */
package GreatestNoArray;
public class GreatestNoArray {
	public static int findGreatestNo(int arr[]) {
		int max=0;
		for (int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
}
