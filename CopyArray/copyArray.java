package CopyArray;
/*write a java program to reverse the array contents*/
public class copyArray {
	public static int[] copyarr(int arr[]) {
		int newarr[] = new int[arr.length];
		int j = arr.length-1;
		for (int i=0;i<=arr.length-1;i++) {
			newarr [j] = arr[i];
			j--;
		}
		return newarr;
	}
}
