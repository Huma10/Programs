package practice.samplearrays;

public class FindDuplicates {

	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 6, 3, 6, 1};
		
		findDuplicates(arr1);
	}

	private static void findDuplicates(int[] arr1) {
		int count = 0;
		int k = 0;
		int firstElement = arr1[0];
		int newArray[] = new int[arr1.length];
		for(int i = 0;i < arr1.length; i++) {
			for(int j = i+1;j < arr1.length; j++) {
				if(arr1[i] == arr1[j]) {
					count++;
					newArray[k++] = arr1[i];
				}
			}
		}
		for(int i = 0;i < newArray.length ; i++) {
			System.out.println(newArray[i]);
		}
		
		System.out.println("No. of Duplicates elements are: "+count);
		
		
	}
}
