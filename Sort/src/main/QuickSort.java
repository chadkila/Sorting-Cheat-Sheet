/**
 * http://en.wikipedia.org/wiki/Quicksort
 * On average, quicksort makes O(nlogn) comparisons to sort n items, while in
 * the worst case, it makes O(n2) comparisons. Quicksort is not stable and not
 * adaptive.
 */
package main;

/**
 * @author yu
 * 
 */
public class QuickSort {

	public int[] sort(int num[]) {
		quickSort(num, 0, num.length - 1);
		return num;
	}

	private void quickSort(int num[], int p, int r) {
		if (p < r) {
			// num[i..q] < num[q+1..r]
			int q = partition(num, p, r);
			quickSort(num, p, q - 1);
			quickSort(num, q + 1, r);
		}
	}

	private int partition(int num[], int p, int r) {
		// last element as pivot
		int cur = num[r];
		int i = p;
		// iteratively finding elements smaller than pivot
		for (int j = p; j < r; j++) {
			if (num[j] <= cur) {
				i++;
				// move smaller elements to the left
				swap(num, i - 1, j);
			}
		}
		// swap pivot
		swap(num, i, r);
		return i;
	}

	// XOR swap without using temp integer
	private void swap(int arg[], int i, int j) {
		// when i=j it will be 0
		if (i != j) {
			arg[i] = arg[i] ^ arg[j];
			arg[j] = arg[j] ^ arg[i];
			arg[i] = arg[j] ^ arg[i];
		}
	}

}
