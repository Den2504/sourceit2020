package com.iteagles.learnit.kuzminHW6;

public class Candy {

	protected String title;
	protected double price;
	protected int weight;
	protected String type;
	protected double sugar;

	public Candy(String title, double price, int weight, String type, double sugar) {
		this.title = title;
		this.price = price;
		this.weight = weight;
		this.type = type;
		this.sugar = sugar;
	}

	public String getTitle1() {
		return this.title;
	}

	public double getPrice() {
		return this.price;
	}

	public int getWeight() {
		return this.weight;
	}

	public String getType() {
		return this.type;
	}

	public double getSugar() {
		return this.sugar;
	}

	public String toString() {
		final StringBuilder sb = new StringBuilder("Sweets");
		sb.append(", title = ").append(title);
		sb.append(", price =").append(price);
		sb.append(", weight =").append(weight);
		sb.append(", type =").append(type);
		sb.append(", sugar =").append(sugar);
		return sb.toString();
	}

}

