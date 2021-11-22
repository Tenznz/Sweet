package com.sweetshop;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public void printAllSweet(List sweetList) {
		for (int i = 0; i < sweetList.size(); i++) {
			System.out.println(sweetList.get(i));
		}
	}

	public int showUserMenu() {
		System.out.println("Enter \n1.Add sweet\n2.Remove sweet" 
	+"\n3.Update sweet \n4.Print sweet\n5.Exit");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
}