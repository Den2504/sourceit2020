package com.iteagles.learnit.kuzmin;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsHW {

	public static void main(String[] args) {
		findMaxArray();
		rectangle();
		AmountOfWords();
		FilteredArray();

	}

	static Scanner sc = new Scanner(System.in);

	public static void findMaxArray() {

		System.out.println("Entre integer numbers separated by space:");
		String[] maxArr = sc.nextLine().split(" ");
		System.out.println("Max value in array is:" + (findMax(maxArr)));
		System.out.println();
	}

	public static int findMax(String arr[]) {
		int[] parArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			parArray[i] = Integer.parseInt(arr[i]);
		}
		Arrays.parallelSort(parArray);
		return parArray[parArray.length - 1];
	}

	public static void rectangle() {
		System.out.println("Enter the height of the rectangle:");
		int height = sc.nextInt();
		System.out.println("Enter the width of the rectangle:");
		int width = sc.nextInt();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == height - 1)
					System.out.print("+");
				else {
					if (j == 0 || j == width - 1)
						System.out.print("+");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void AmountOfWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text:");
		String string = sc.nextLine();
		int count = 0;
		if (string.length() != 0) {
			count++;
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == ' ') {
					count++;
				}
			}
		}

		System.out.println("You entered " + count + " words");
		System.out.println();
	}

	public static void FilteredArray() {
		Scanner sc = new Scanner(System.in);
		int a = 10;
		String[] arr = new String[a];
		System.out.println("Enter your 10 words:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr);
		Arrays.sort(arr, (str1, str2) -> str1.compareToIgnoreCase(str2));
		System.out.println(Arrays.toString(arr));
	}

}
