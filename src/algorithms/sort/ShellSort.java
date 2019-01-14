package algorithms.sort;

public class ShellSort {

	public static int[] shellSort(int[] array) {
		for(int e = array.length << 1; e >= 1; e /= 2) {
			for (int i = e; i < array.length; i++) {
				for (int j = i; j >= e && array[j - e] > array[j]; j -= e) {
					int temp = array[j];
					array[j] = array[j - e];
					array[j - e] = temp;
				}
			}
		}
		
		return array;
	}
	
}