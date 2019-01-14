package algorithms.sort;

public class QuickSort {

	public static void quickSort(int[] array, int left, int right) {
		if (array == null || array.length == 0)
			return;
		
		if (left <= right) {
			quickSort(array, left, partition(array, left, right) - 1);
			quickSort(array, partition(array, left, right) + 1, right);
		}
	}
	
	private static int partition(int array[], int left, int right) {
		int size = array[right];
		
		int low = (left - 1);
		for (int i = left; i < right; i++) {
			if (array[i] <= size) {
				low++;
				swap(array, low, i);
			}
		}
		swap(array, low + 1, right);
		
		return low + 1;
	}
	
	private static void swap(int array[], int first, int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	
}