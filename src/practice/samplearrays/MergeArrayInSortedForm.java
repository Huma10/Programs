package practice.samplearrays;

import java.util.Arrays;

public class MergeArrayInSortedForm {

	public static void main(String[] args) {
		int arr1[] = { 10, 5, 6 };
		int arr2[] = { 3, 8, 36 };
		int arr3[] = new int [arr1.length + arr2.length];
		mergeArray(arr1, arr2, arr3);
		
		for(int i = 0 ;i < arr1.length + arr2.length ; i++) {
			System.out.println(arr3[i]+" ");
		}
	}

	private static void mergeArray(int[] arr1, int[] arr2, int[] arr3) {
		
		int i,j,k = 0;
		for (i = 0; i < arr1.length; i++) {
			arr3[k++] = arr1[i];
		}

		for (j = 0; j < arr2.length; j++) {
			arr3[k++] = arr2[j];
		}

		Arrays.sort(arr3);

	}
}
