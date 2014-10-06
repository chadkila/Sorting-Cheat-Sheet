/**
 * http://en.wikipedia.org/wiki/Bubble_sort
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting
 * algorithm that works by repeatedly stepping through the list to be sorted,
 * comparing each pair of adjacent items and swapping them if they are in the
 * wrong order. The pass through the list is repeated until no swaps are needed,
 * which indicates that the list is sorted.
 * Bubble sort belongs to O(n2) sorting algorithms, it is stable and adaptive.
 */
package main;

/**
 * @author yu
 * 
 */
public class BubbleSort {

	public int[] sort(int num[]) {
		boolean swapped = true;
		int j = 0;
		while (swapped) {
			swapped = false;
			j++;
			// from n to 1
			for (int i = 0; i < num.length - j; i++) {
				if (num[i] > num[i + 1]) {
					swap(num, i, i + 1);
					swapped = true;
				}
			}
		}
		return num;
	}

	// XOR swap without using temp integer
	private void swap(int arg[], int i, int j) {
		if (i != j) {
			arg[i] = arg[i] ^ arg[j];
			arg[j] = arg[j] ^ arg[i];
			arg[i] = arg[j] ^ arg[i];
		}
	}
}
