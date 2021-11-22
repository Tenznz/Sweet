package com.sweetshop;

import java.util.List;

public class Sweet {
	String name;
	String shape;
	String color;

	int price;
	List<String> ingredients;

	public String toString() {

		return getClass().getSimpleName() + "-> [Shape=" + shape + ",color=" + color + ",Price=" + price + "]";

	}
}
