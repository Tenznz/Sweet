package com.sweetshop;

import java.util.Scanner;
import java.util.Set;

import com.sweetshop.Sweet.Color;

public class UserInterface {
	private static UserInterface instance;

	private UserInterface() {
	}

	public static UserInterface getInstance() {
		if (instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	public void printAllYellowSweet(Set<Sweet> sweetList) {
		sweetList.stream().filter(sweet -> (sweet.color == Color.YELLOW)).forEach(System.out::println);
	}

	public void printAllSweet(Set<Sweet> sweetList) {
//		for (int i = 0; i < sweetList.size(); i++) {
//			System.out.println(sweetList.get(i));
//		}
		sweetList.stream().forEach(sweet -> System.out.println(sweet));
	}

	public int showUserMenu() {
		System.out.println("Enter \n1.Add sweet\n2.Remove sweet" + "\n3.Update sweet \n4.Print sweet\n5.print yellow\n"
				+ Application.EXIT_VALUE + ".Exit");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}