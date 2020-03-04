package com.iteagles.learnit.kuzminHW9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {
	public static void main(String[] args) {

		System.out.println(ArrayListInsert(0, 100));
		System.out.println(ArrayListInsert(0, 10_000));
		System.out.println(ArrayListInsert(0, 100_000));
		System.out.println(ArrayListInsert(500_000, 100));
		System.out.println(ArrayListInsert(500_000, 10_000));
		System.out.println(ArrayListInsert(500_000, 100_000));
		System.out.println(ArrayListInsert(1_000_000, 100));
		System.out.println(ArrayListInsert(1_000_000, 10_000));
		System.out.println(ArrayListInsert(1_000_000, 100_000));

		System.out.println(LinkedListInsert(0, 100));
		System.out.println(LinkedListInsert(0, 10_000));
		System.out.println(LinkedListInsert(0, 100_000));
		System.out.println(LinkedListInsert(500_000, 100));
		System.out.println(LinkedListInsert(500_000, 10_000));
		System.out.println(LinkedListInsert(500_000, 100_000));
		System.out.println(LinkedListInsert(1_000_000, 100));
		System.out.println(LinkedListInsert(1_000_000, 10_000));
		System.out.println(LinkedListInsert(1_000_000, 100_000));

		System.out.println(ArrayListDelete(0, 100));
		System.out.println(ArrayListDelete(0, 10_000));
		System.out.println(ArrayListDelete(0, 100_000));
		System.out.println(ArrayListDelete(500_000, 100));
		System.out.println(ArrayListDelete(500_000, 10_000));
		System.out.println(ArrayListDelete(500_000, 100_000));
		System.out.println(ArrayListDelete(1_000_000, 100));
		System.out.println(ArrayListDelete(1_000_000, 10_000));
		System.out.println(ArrayListDelete(1_000_000, 100_000));

		System.out.println(LinkedListDelete(0, 100));
		System.out.println(LinkedListDelete(0, 10_000));
		System.out.println(LinkedListDelete(0, 100_000));
		System.out.println(LinkedListDelete(500_000, 100));
		System.out.println(LinkedListDelete(500_000, 10_000));
		System.out.println(LinkedListDelete(500_000, 100_000));
		System.out.println(LinkedListDelete(1_000_000, 100));
		System.out.println(LinkedListDelete(1_000_000, 10_000));
		System.out.println(LinkedListDelete(1_000_000, 100_000));
	}

	public static String ArrayListInsert(int insertStartNumber, int numberOfElements) {

		List<String> arrlist = new ArrayList<>();

		for (int i = 0; i < 1_000_000; i++) {
			arrlist.add(i, new String("Den"));
		}

		long mill = System.currentTimeMillis();

		for (int i = 0; i < numberOfElements; i++) {

			arrlist.add(insertStartNumber, "Hello");
		}

		long delta = System.currentTimeMillis() - mill;

		return "Adding " + numberOfElements + " items starting at index " + insertStartNumber + " in ArrayList takes "
				+ delta + " milliseconds.";

	}

	public static String LinkedListInsert(int insertStartNumber, int numberOfElements) {

		LinkedList<String> linkList = new LinkedList<String>();

		for (int i = 0; i < 1_000_000; i++) {
			linkList.add(i, "Den");
		}

		long mill = System.currentTimeMillis();

		for (int i = 0; i < numberOfElements; i++) {

			linkList.add(insertStartNumber, "Hello");
		}

		long delta = System.currentTimeMillis() - mill;

		return "Adding " + numberOfElements + " items starting at index " + insertStartNumber + " in LinkedList takes "
				+ delta + " milliseconds.";
	}

	public static String ArrayListDelete(int insertNumberOfDelete, int numberOfElementsToDelete) {

		ArrayList<String> arrList = new ArrayList<>();

		for (int i = 0; i < 1_000_000; i++) {
			arrList.add(i, "Den");
		}

		long mill = System.currentTimeMillis();

		int elementDelete = insertNumberOfDelete;

		for (int i = 0; i < numberOfElementsToDelete; i++) {

			if (insertNumberOfDelete < 1_000_000) {
				arrList.remove(elementDelete);
			} else {
				arrList.remove(--elementDelete);
			}
		}

		long delta = System.currentTimeMillis() - mill;
		return "Delete " + numberOfElementsToDelete + " items starting at index " + insertNumberOfDelete
				+ " in ArrayList takes " + delta + " milliseconds.";

	}

	public static String LinkedListDelete(int insertNumberOfDelete, int numberOfElementsToDelete) {

		LinkedList<String> linkList = new LinkedList<String>();

		for (int i = 0; i < 1_000_000; i++) {
			linkList.add(i, "Den");
		}

		long mill = System.currentTimeMillis();

		int elementDelete = insertNumberOfDelete;

		for (int i = 0; i < numberOfElementsToDelete; i++) {

			if (insertNumberOfDelete < 1_000_000) {
				linkList.remove(elementDelete);
			} else {
				linkList.remove(--elementDelete);
			}
		}

		long delta = System.currentTimeMillis() - mill;

		return "Delete " + numberOfElementsToDelete + " items starting at index " + insertNumberOfDelete
				+ " in LinkedList takes " + delta + " milliseconds.";

	}
}
