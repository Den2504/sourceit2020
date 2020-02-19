package com.iteagles.learnit.kuzminHW6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class Sweets {
	static Scanner sc = new Scanner(System.in);
	

	public static void sweetsCatalog(List<Candy> newYearBox) {

		for (Candy i : newYearBox) {
			System.out.println(i);
		}

	}

	public static List<Candy> sortByWeight(List<Candy> sweets) {
		Collections.sort(sweets, new Comparator<Candy>() {
			@Override
			public int compare(Candy o1, Candy o2) {
				return o1.getWeight() - o2.getWeight();
			}
		});
		System.out.println(sweets);
		return sweets;
	}

	public static void getSugar(List<Candy> sweets, double sugar) {
		for (int i = 0; i < sweets.size(); i++) {
			if (sugar >= sweets.get(i).getSugar()) {
				System.out.println(sweets.get(i));

			}

		}
	}

public static void addCandy(List<Candy> newYearBox3) {

	for (Candy i : newYearBox3) {
		System.out.println(i);
	}
	
	
	
}
}

