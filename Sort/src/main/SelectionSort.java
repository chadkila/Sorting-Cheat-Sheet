/**
 * http://en.wikipedia.org/wiki/Selection_sort
 * selection sort is a an in-place comparison sort algorithm. It has O(n^2) time
 * complexity and it is not stable and not adaptive.
 */
package main;

/**
 * @author yu
 * 
 */
public class SelectionSort {
	public int[] sort(int num[]) {
		// find the smallest item n-1 times
		for (int i = 0; i < num.length - 1; i++) {
			int minIdx = i;
			// find smallest item's index
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[minIdx])
					minIdx = j;
			}
			// exchange smallest and current position
			swap(num, minIdx, i);
		}
		return num;
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
