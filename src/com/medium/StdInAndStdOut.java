package com.medium;

import java.util.Scanner;

/**
 * There are lines of input, and each line contains a single integer.
 * Sample Input
 * 42
 * 100
 * 125
 * Sample Output
 * 42
 * 100
 * 125
 * @author dnmhi
 *
 */
public class StdInAndStdOut {
	public static void main(String[] args) {
/*		Scanner scan = new Scanner(System.in);		
		while (scan.hasNextInt()) {
			int i = scan.nextInt();
			System.out.println(i);
		}
		scan.close();*/
		int[] a = new int[2];
		a[0] = 1;
		a[1] = 4;
		int[] b = new int[2];
		a=b;
		for (int i=0; i < 2; i++) {
			System.out.println(b[i]);
		}
	}
}
