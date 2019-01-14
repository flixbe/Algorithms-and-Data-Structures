package algorithms.sort;

public class HeapSort {

	public static void heapSort(int[] array) {
		if (array == null || array.length == 0)
			return;
		
		heapify(array, array.length);
		
		int right = array.length - 1;
		
		while (right > 0) {
			swap(array, right, 0);
			shiftDown(array, 0, --right);
		}
	}
	
	private static void shiftDown(int[] array, int left, int right) {
		int foo = left;
		
		while ((foo << 1) + 1 <= right) {
			int bar = (foo << 1) + 1;
			int swap = foo;
			
			if (array[swap] < array[bar])
				swap = bar;
			
			if (bar + 1 <= right && array[swap] < array[bar + 1])
				swap = bar + 1;
			
			if (swap != foo) {
				swap(array, foo, swap);
				foo = swap;
			} else {
				return;
			}
		}
	}
	
	private static void heapify(int[] array, int length) {
		int left = (length >> 1) - 1;
		
		while (left >= 0) {
			shiftDown(array, left, length - 1);
			left--;
		}
	}
	
	private static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
}