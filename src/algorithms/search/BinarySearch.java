package algorithms.search;

public class BinarySearch {

	public static int binarySearch(int array[], int key) {
		int mid;
		int left = 0;
		int right = array.length;
		
		while (left <= right) {
			mid = (left + right) >> 1;
			
			if (array[mid] < key)
				left = mid + 1;
			else if (array[mid] > key)
				right = mid - 1;
			else
				return mid;
		}
		
		return -1;
	}
	
}