/**
 * http://en.wikipedia.org/wiki/Merge_sort
 * Merge sort is an O(n log n) comparison-based sorting algorithm. Most
 * implementations produce a stable sort, meaning that the implementation
 * preserves the input order of equal elements in the sorted output. It is a
 * divide and conquer algorithm and not adaptive.
 */
package main;

/**
 * @author yu
 * 
 */
public class MergeSort {
	public int[] sort(int num[]) {
		mergeSort(num, 0, num.length - 1);
		return num;
	}

	private void mergeSort(int num[], int p, int r) {
		// check if low is smaller then high, if not then the array is sorted
		if (p < r) {
			int q = p + (r - p) / 2;
			// Sort the left side of the array
			mergeSort(num, p, q);
			// Sort the right side of the array
			mergeSort(num, q + 1, r);
			// Combine them both
			merge(num, p, q, r);
		}
	}

	private void merge(int num[], int p, int q, int r) {
		// the helper array
		int tmp[] = num.clone();
		int i = p, j = q + 1;
		int k = p;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= q && j <= r) {
			num[k++] = (num[j] < tmp[i]) ? num[j++] : tmp[i++];
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= q) {
			num[k++] = tmp[i++];
		}
	}

}
