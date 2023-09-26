/*Write the java program to find the sum of array*/
package ArraySum;
public class ArraySum {
	public static int findSum(int arr[]) {
		int sum=0;
		for (int i=0;i<=arr.length-1;i++) {
			sum +=arr[i];
		}
		return sum;
	}
}
