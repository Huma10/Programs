package practice.samplearrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class FilterDuplicateFrom {

	public static void main(String[] args) {
		int arr1[] = {7,6,8,3,3,4,6};
		
		filter(arr1);
	}

	private static void filter(int[] arr1) {
		/*
		 * // Using Linked HashSet LinkedHashSet<Integer> hashSet = new
		 * LinkedHashSet<>(); for(int i = 0;i< arr1.length;i++) { hashSet.add(arr1[i]);
		 * } System.out.println(hashSet);
		 */
		
		// Using for loop
		int a[] = new int[arr1.length];
		int k = 0;
		for(int i = 0 ;i< arr1.length - 1;i++) {
				if(arr1[i]!=arr1[i+1]) {
					a[k++] = arr1[i];
				}
		}
		arr1[k++] = arr1[(arr1.length) - 1];
		
		for(int  i =0; i<a.length;i++) {
			System.out.println(a[i]+ "");
		}
		
	}
}
