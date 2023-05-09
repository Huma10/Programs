package practice.samplearrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int arr[] = {1,4,20,3,10,5};
		int sum = 33;
		sunArray(arr,sum);
	}

	private static void sunArray(int[] arr, int sum) {	
		for(int i = 0;i < arr.length; i++) {
			int currentSum = arr[i];
			if(currentSum == sum) {
				System.out.println("Sum found at index " + i);
				return;
			}else {
				for(int j = i + 1; j< arr.length;j++) {
					currentSum +=arr[j];
					if(currentSum == sum) {
						System.out.println("Sum found at index "+i+ " and " + j);
						return;
					}	
				}
			}
			
		}
		System.out.println("No sub array found ");
		return;
	}
}
