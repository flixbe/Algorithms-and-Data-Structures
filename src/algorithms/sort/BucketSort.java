package algorithms.sort;

public class BucketSort {

	public static int[] bucketSort(int[] array) {
		int[] arr = new int[array.length];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = 0;
		
		for (int i = 0; i < array.length; i++)
			arr[array[i]]++;
		
		int key = 0;
		
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i]; j++)
				array[key++] = i;
		
		return array;
	}
	
}