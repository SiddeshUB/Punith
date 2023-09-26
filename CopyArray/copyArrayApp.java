package CopyArray;
import java.util.Scanner;
public class copyArrayApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the array element");
		for (int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		int reversearr[] = copyArray.copyarr(arr); 
		System.out.println("Reverse array contents are ");
		for (int i=0;i<=reversearr.length-1;i++) {
			System.out.print(reversearr[i]+" ");
		}
	}
}
