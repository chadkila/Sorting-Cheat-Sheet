/**
 * http://en.wikipedia.org/wiki/Insertion_sort
 * Insertion sort is a simple O(n^2) sorting algorithm: a comparison sort in which the
 * sorted array (or list) is built one entry at a time. It's stable and adaptive.
 * Insertion sort is also a good choice for linked lists, because insertion is 
 * faster than swapping for linked elements. 
 * e.g. https://oj.leetcode.com/problems/insertion-sort-list/
 */
package main;

/**
 * @author yu
 * 
 */
public class InsertionSort {

	public int[] sort(int num[]) {
		for (int i = 1; i < num.length; i++) {
			int cur = num[i];
			int j = i;
			// find injection position among top j-1 sorted elements
			while (j > 0 && cur < num[j - 1]) {
				// move elements behind
				num[j] = num[j - 1];
				j--;
			}
			// insert
			num[j] = cur;
		}
		return num;
	}

}
