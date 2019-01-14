package algorithms.sort;

public class SelectionSort {

	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int smallestValue = array[i];
			int smallestIndex = i;
			
			for (int j = i; j < array.length; j++) {
				if (array[j] < smallestValue) {
					smallestValue = array[j];
					smallestIndex = j;
				}
			}
			
			if (smallestValue < array[i]) {
				int temp = array[i];
				array[i] = array[smallestIndex];
				array[smallestIndex] = temp;
			}
		}
		
		return array;
	}
	
}