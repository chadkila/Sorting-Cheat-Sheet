/**
 * Java examples of bubble sort, insertion sort, Shell sort, selection sort,
 * quick sort, merge sort and heap sort.
 */
package main;

import java.util.Arrays;

/**
 * @author yu
 * 
 */
public class Main {

	public static void main(String[] args) {
		int num[] = { 13, 11, 7, 22, 6, 14, 2, 3, 26, 17, 20, 25, 9, 12, 19,
				15, 24, 28, 8, 21, 29, 4, 27, 31, 18, 1, 30, 5, 16, 23, 10 };
		System.out.println("Bubble Sort:");
		System.out.println(Arrays.toString(new BubbleSort().sort(num.clone())));

		System.out.println("Insertion Sort");
		System.out
				.println(Arrays.toString(new InsertionSort().sort(num.clone())));

		System.out.println("Shell Sort");
		System.out.println(Arrays.toString(new ShellSort().sort(num.clone())));

		System.out.println("Selection Sort");
		System.out
				.println(Arrays.toString(new SelectionSort().sort(num.clone())));

		System.out.println("Quick Sort");
		System.out.println(Arrays.toString(new QuickSort().sort(num.clone())));

		System.out.println("Merge Sort");
		System.out.println(Arrays.toString(new MergeSort().sort(num.clone())));

		System.out.println("Heap Sort");
		System.out.println(Arrays.toString(new HeapSort().sort(num.clone())));

	}
}
