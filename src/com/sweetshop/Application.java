package com.sweetshop;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
//	UserInterface userInterface = UserInterface.getInstance();
//	SweetStore sweetStore =SweetStore.getInstance();
	final static int EXIT_VALUE = 5;

	public static void main(String[] args) {
		UserInterface userInterface = UserInterface.getInstance();
		System.out.println("Welcome to Sweet Shop.");
		int input = 0;
		Application app = new Application();
		while (input != app.EXIT_VALUE) {
			input = userInterface.showUserMenu();
			app.handleUserSelection(input);
		}
	}

	private void handleUserSelection(int input) {
		Scanner sc = new Scanner(System.in);
		Application app = new Application();
		SweetStore sweetStore = SweetStore.getInstance();// Singleton concept
		switch (input) {
		case 1:
			Laddu laddu = new Laddu();
			laddu.price = 40;
			Barfi barfi = new Barfi();
			Jalebi jalebi = new Jalebi();
			Rasgulla rasgulla = new Rasgulla();
			Rasgulla rasgulla2 = new Rasgulla();

			sweetStore.add(jalebi);
			sweetStore.add(laddu);
			sweetStore.add(barfi);
			sweetStore.add(rasgulla);
			sweetStore.add(rasgulla2);
			break;
		case 2:
			System.out.println("Enter the name you want to delete");
			String sweetName = sc.nextLine();

			Sweet name = sweetStore.getSweet(sweetName);
			sweetStore.removeSweet(name);
			break;
		case 3:
			System.out.println("Enter a sweet name you want to update");
			sweetName = sc.nextLine();
			Sweet sweet = sweetStore.getSweet(sweetName);
			updateSweet(sweet);
			break;
		case 4:
			UserInterface userInterface = UserInterface.getInstance();
			userInterface.printAllSweet(sweetStore.getList());
			break;

		case EXIT_VALUE:
			System.out.println("Thank you");
		}
	}

	Scanner sc = new Scanner(System.in);

	public void updateSweet(Sweet sweet) {
		System.out.println("Enter \n1.Shape\n2.Color\n3.Name\n4.Price\n5.Ingredient");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			updateShape(sweet);
			break;
		case 2:
			updateColor(sweet);
			break;
		case 3:
			updateName(sweet);
			break;
		case 4:
			updatePrice(sweet);
			break;
		case 5:
			updateIngredient(sweet);
			break;
		default:
			System.exit(0);
		}
	}

	private void updateIngredient(Sweet sweet) {
		System.out.println("Enter the new Ingredients sweet\",\"");
		String newIngredients = sc.next();
		System.out.println(newIngredients);
//		sweet.ingredients.clear();
		String[] ingredientArr = newIngredients.split(",");
		
	
		sweet.ingredients = Arrays.asList(ingredientArr);
	}

	private void updatePrice(Sweet sweet) {
		System.out.println("Enter Price");
		int newPrice = sc.nextInt();
		sweet.price = newPrice;
	}

	private void updateName(Sweet sweet) {
		System.out.println("Enter Name");
		String newName = sc.nextLine();
		sweet.name = newName;
	}

	private void updateColor(Sweet sweet) {
		System.out.println("Enter \n1.RED \n2.GREEN \n3.YELLOW\n4.WHITE");
		int color = sc.nextInt();

		switch (color) {

		case 1:
			sweet.color = Sweet.Color.RED;
			break;

		case 2:
			sweet.color = Sweet.Color.GREEN;
			break;

		case 3:
			sweet.color = Sweet.Color.YELLOW;
			break;

		case 4:
			sweet.color = Sweet.Color.WHITE;
			break;
		}

	}

	private void updateShape(Sweet sweet) {
		System.out.println("Enter \n1.TRIANGLE \n2.SQUARE \n3.ROUND");
		int shape = sc.nextInt();

		switch (shape) {

		case 1:
			sweet.shape = Sweet.Shape.TRIANGLE;
			break;

		case 2:
			sweet.shape = Sweet.Shape.SQUARE;
			break;

		case 3:
			sweet.shape = Sweet.Shape.ROUND;
			break;
		}
	}
}
