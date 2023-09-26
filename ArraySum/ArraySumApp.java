package ArraySum;

import java.util.Scanner;
public class ArraySumApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int arr[] = new int[scan.nextInt()];
		for (int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		int sum = ArraySum.findSum(arr); 
		System.out.println("Sum of number present in Array "+sum);
	}
}
