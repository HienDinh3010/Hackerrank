package com.medium;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		scanner.close();

		int rotateArr[] = new int[n];
		// Start rotate the array to the left 4 times
		for (int i = 0; i < d; i++) {
			for (int index = 0; index < n; index++) {
				int rotateIndex = index - 1;// Move to left one unit
				if (rotateIndex == -1) {
					rotateIndex = n - 1; // leftIndex equal last index
				}
				rotateArr[rotateIndex] = a[index];
			}
			// Update original array a to rotateArr
			a = Arrays.copyOf(rotateArr, n);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(rotateArr[i] + " ");
		}
	}
}
