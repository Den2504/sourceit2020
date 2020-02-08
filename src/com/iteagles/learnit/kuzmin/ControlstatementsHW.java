package com.iteagles.learnit.kuzmin;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

/**
 * HomeWork - Control statements
 * 
 * @author Den
 *
 */

public class ControlstatementsHW {
	public static void main(String[] args) {
		// In the first program. The user enters a number and the program prints each
		// digit from a new line.

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number." + "For exemple \"12345\"");
		String[] numbers = String.valueOf(sc.nextInt()).split("");
		for (String number : numbers) {
			System.out.println(number);
		}
		System.out.println();

		/*
		 * In the second program user enters 7 words Program stores all these strings in
		 * array.Program sorts the array putting on the first place strings which has
		 * more characters and putting at the end strings with less length Program
		 * prints to console sorted array.
		 */
		Scanner sc2 = new Scanner(System.in);
		int a = 7;
		String[] arr = new String[a];
		System.out.println("Enter seven words");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc2.next();
		}
		String b;
		for (int i = 0; i < a - 1; i++) {
			for (int j = 0; j < a - 1; j++) {
				if (arr[j].length() < arr[j + 1].length()) {
					b = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = b;
				}
			}

		}

		for (int i = 0; i < a; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		/*
		 * The third program. The user enters the height of the pyramid into the console
		 * and the program draws a pyramid.
		 */
		
		Scanner sc3 = new Scanner(System.in);
		int q, w, r, number;
		System.out.println("\n" + "Enters the height of the pyramid:  ");
		number = sc3.nextInt();
		for (q = 1; q <= number; q++) {
			for (w = q; w < number; w++)
				System.out.print((" "));
			for (r = 1; r < (q * 2); r++)
				System.out.print("*");
			System.out.print("\n");
		}
		System.out.println();

		/*
		 * The fourth program starts and generates an array of 10 random integers, then
		 * creates a second array of 20 elements in size, where the first 10 elements
		 * are from the first array, and the second 10 are elements from the first array
		 * multiplied by two.
		 */
		int c = 1;
		int d = 100;
		int[] arr1 = new int[10];
		int[] arr2 = new int[20];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = c + (int) (Math.random() * d);
		}
		arr2 = Arrays.copyOf(arr1, 20);
		for (int i = 10; i < arr2.length; i++) {
			arr2[i] = arr2[i - 10] * 2;
		}
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		/*
		 * The program starts and generates a 5 x 5 matrix of double values. The program
		 * displays the matrix on the console. Then the user can use the console to
		 * rotate the matrix on 90, 180 or 270 degrees
		 * 
		 * 
		 */
		Scanner sc4 = new Scanner(System.in);
		double[][] matrix = { { 1.1, 1.2, 1.3, 1.4, 1.5 }, { 2.1, 2.2, 2.3, 2.4, 2.5 }, { 3.1, 3.2, 3.3, 3.4, 3.5 },
				{ 4.1, 4.2, 4.3, 4.4, 4.5 }, { 5.1, 5.2, 5.3, 5.4, 5.5 }

		};
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
