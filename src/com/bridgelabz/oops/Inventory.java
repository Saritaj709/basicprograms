package com.bridgelabz.oops;

public class Inventory {

	private String name;

	private int price;

	private int weight;

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public int setPrice(int price) {
		 return this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public int setWeight(int weight) {
		return this.weight = weight;
	}
public int totalPrice(int price,int weight)
{
	int tp=setPrice(price)*setWeight(weight);
	return tp;
}
}
