package com.sweetshop;

import java.util.Scanner;

public class Application {
	UserInterface userInterface = new UserInterface();
	SweetStore sweetStore = new SweetStore();
	final static int EXIT_VALUE = 5;

	public static void main(String[] args) {
		System.out.println("Welcome to Sweet Shop.");
		/*
		 * Laddu laddu = new Laddu(); laddu.price=40; Barfi barfi = new Barfi(); Jalebi
		 * jalebi = new Jalebi(); Rasgulla rasgulla = new Rasgulla();
		 * 
		 * SweetStore sweetstore = new SweetStore(); sweetstore.add(jalebi);
		 * sweetstore.add(laddu); sweetstore.add(barfi); sweetstore.add(rasgulla);
		 * 
		 * UserInterface userInterface = new UserInterface();
		 * userInterface.PrintAllSweet(sweetstore.getList());
		 */
		int input = 0;
		Application app = new Application();
		while (input != app.EXIT_VALUE) {
			input = app.userInterface.showUserMenu();
			app.handleUserSelection(input);
		}
	}

	private void handleUserSelection(int input) {
		Scanner sc = new Scanner(System.in);
		Application app = new Application();

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
			String sweetName = sc.next();

			Sweet name = sweetStore.getSweet(sweetName);
			sweetStore.removeSweet(name);
			break;
//		case 3:
//			System.out.println("Enter the name you want to update");
//			sweetName = sc.next();
//			name = sweetStore.getSweet(sweetName);
//			sweetStore.updateSweet(name);
//			
//			break;
		case 4:
			userInterface.printAllSweet(sweetStore.getList());
			break;

		case EXIT_VALUE:
			System.out.println("Thank you");

		}
	}
}
