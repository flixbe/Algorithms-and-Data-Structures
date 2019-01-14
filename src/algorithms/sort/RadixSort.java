package algorithms.sort;

public class RadixSort {

	public static void radixSort(int[] array) {
		if (array == null || array.length == 0)
			return;
		
		int left = array[0];
		int right = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < left)
				left = array[i];
			else if (array[i] > right)
				right = array[i];
		}
		
		int exponent = 1;
		while ((right - left) / exponent >= 1) {
			sort(array, left, exponent, right);
			exponent *= right;
		}
	}
	
	private static void sort(int[] array, int left, int exponent, int right) {
		int index;
		int[] buckets = new int[right];
		int[] output = new int[array.length];
		
		for (int i = 0; i < right; i++)
			buckets[i] = 0;
		
		for (int i = 0; i < array.length; i++) {
			index = (int)(((array[i] - left) / exponent) % right);
			buckets[index]++;
		}
		
		for (int i = 1; i < right; i++)
			buckets[i] += buckets[i - 1];
		
		for (int i = array.length - 1; i >= 0; i--) {
			index = (int)(((array[i] - left) / exponent) % right);
			output[--buckets[index]] = array[i];
		}
		
		for (int i = 0; i < array.length; i++)
			array[i] = output[i];
	}
	
}