/**
 * http://en.wikipedia.org/wiki/Heapsort
 * Heapsort is a comparison-based sorting algorithm. Heapsort can be thought of
 * as an improved selection sort: like that algorithm, it divides its input into
 * a sorted and an unsorted region, and it iteratively shrinks the unsorted
 * region by extracting the smallest element and moving that to the sorted
 * region. The improvement consists of the use of a heap data structure rather
 * than a linear-time search to find the minimum.
 * It has average and worst case O(nlgn) running time, it is not stable and adaptive
 * although it's in-place.
 */
package main;

/**
 * @author yu
 * 
 */
public class HeapSort {
	public int[] sort(int num[]) {
		int size = num.length - 1;
		// build heap
		buildMaxHeap(num);
		// do heapify n times
		for (int i = num.length - 1; i > 0; i--) {
			// exchange last node with biggest root
			swap(num, 0, i);
			// cut tail
			size--;
			// moves largest node to root
			maxHeapify(num, 0, size);
		}
		return num;
	}

	// makes the array has maximum heap's property
	// every node is bigger than its children
	private void buildMaxHeap(int num[]) {
		// heapify every tree node that has child
		// from last one to root
		for (int i = num.length / 2 - 1; i >= 0; i--) {
			maxHeapify(num, i, num.length - 1);
		}
	}

	// maintain the heap structure among num[i..len]
	private void maxHeapify(int num[], int i, int len) {
		int l = left(i);
		int r = right(i);
		// find out whether left or right child is larger than parent
		int max = (l <= len && num[l] > num[i]) ? l : i;
		max = (r <= len && num[r] > num[max]) ? r : max;
		if (max != i) {
			// exchange largest and its parent
			swap(num, i, max);
			// recursively see whether smaller parent(now child)
			// need to be swapped
			maxHeapify(num, max, len);
		}
	}

	// return index of left child
	private int left(int i) {
		return i * 2;
	}

	// return index of right child
	private int right(int i) {
		return i * 2 + 1;
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
