package com.iteagles.learnit.kuzminHW6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewYearBox {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Candy kinder = new Candy("Kinder", 27.0, 20, "Kinder Surprise", 18.8);
		Candy bounty = new Candy("Bounty", 21.9, 85, "Trio", 58.3);
		Candy milkyWay = new Candy("MilkyWay", 44.20, 130, "Milky Way 5", 213.5);
		Candy waffles = new Candy("Waffles", 157.3, 1580, "Roshen Wafers", 48.4);
		Candy candiedFruit = new Candy("Сandied Fruit", 52.20, 250, "Assorted", 53.4);
		Candy milka = new Candy("Milka", 32.0, 100, "With cookies", 54.6);
		Candy korona = new Candy("Korona", 24.0, 85, "Milk Chocolate", 49.8);

		List<Candy> newYearBox = new ArrayList();
		newYearBox.add(kinder);
		newYearBox.add(bounty);
		newYearBox.add(kinder);
		newYearBox.add(milkyWay);
		newYearBox.add(milka);
		newYearBox.add(waffles);
		System.out.println("A complete catalog of sweets in a \"NEW YEAR BOX\"");
		Sweets.sweetsCatalog(newYearBox);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Sort sweets by weight");
		Sweets.sortByWeight(newYearBox);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Find sweets in a gift matching your sugar range[20-213]: ");
		double sugar = sc.nextInt();
		Sweets.getSugar(newYearBox, sugar);
		System.out.println("----------------------------------------------------------------------------------");
		
		List<Candy> newYearBox2 = new ArrayList();
		System.out.println(" Enter the number of sweet\n 1.Kinder \n 2.Bounty\n 3.MilkyWay\n 4.Waffles\n 5.CandiedFruit\n 6.Milka\n 7.Korona");
		int number = sc.nextInt() ;
		switch (number) {
		case 1:
			newYearBox2.add(kinder);
			break;
		case 2:
			newYearBox2.add(bounty);
			break;
		case 3:
			newYearBox2.add(milkyWay);
			break;

		case 4:
			newYearBox2.add(waffles);
			break;
		case 5:
			newYearBox2.add(candiedFruit);
			break;
		case 6:
			newYearBox2.add(milka);
			break;
		case 7:
			newYearBox2.add(korona);
			break;
		}		
		List<Candy> newYearBox3 = new ArrayList<Candy>(newYearBox);
		newYearBox3.addAll(newYearBox2);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Box with bonus candy");
		Sweets.addCandy(newYearBox3);
	}
	
}
