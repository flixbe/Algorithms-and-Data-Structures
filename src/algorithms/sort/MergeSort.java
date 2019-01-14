package algorithms.sort;

public class MergeSort {

	public static int[] mergeSort(int[] array, int left, int right) {		
		if (left < right) {
			int mid = (left + right) >> 1;
		
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			
			merge(array, left, mid, right);
		}
		
		return array;
	}
	
	private static void merge(int[] array, int left, int mid, int right) {
		if (array == null || array.length == 0)
			return;
		
		int bar = mid - left + 1;
		int baz = right - mid;
		
		int[] low = new int[bar];
		int[] high = new int[baz];
		
		for (int i = 0; i < bar; ++i)
			low[i] = array[left + i];
		
		for (int i = 0; i < baz; ++i)
			high[i] = array[mid + 1 + i];
		
		int L = 0, R = 0;
		int l = left;
		
		while (L < bar && R < baz) {
			if (low[L] <= high[R]) {
				array[l] = low[L];
				L++;
			} else {
				array[l] = high[R];
				R++;
			}
			l++;
		}
		
		while (L < bar) {
			array[l] = low[L];
			L++;
			l++;
		}
		
		while (R < baz) {
			array[l] = high[R];
			R++;
			l++;
		}
	}
	
}
