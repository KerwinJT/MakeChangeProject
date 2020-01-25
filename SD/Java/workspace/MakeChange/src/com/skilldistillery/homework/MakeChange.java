package com.skilldistillery.homework;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hello. I will calculate change based on price and payment.");
		calculation(keyboard);
		keyboard.close();

	}

	public static String makeChange(double total, double payment) {
		String change = "";

		double changeToGive = (payment * 100 - total * 100);
		if (changeToGive < 0) {
			return "EEROR: Payment not sufficient.";
		} else {
			System.out.println("Total Change to Receive: $" + (changeToGive / 100));
			while (changeToGive > 0) {

				if (changeToGive >= 2000) {
					change += ("\n$20: " + ((int) changeToGive / 2000));
					changeToGive %= 2000;

				} else if (changeToGive >= 1000) {
					change += ("\n$10: " + ((int) changeToGive / 1000));
					changeToGive %= 1000;

				} else if (changeToGive >= 500) {
					change += ("\n$5: " + ((int) changeToGive / 500));
					changeToGive %= 500;

				} else if (changeToGive >= 100) {
					change += ("\n$1: " + ((int) changeToGive / 100));
					changeToGive %= 100;

				} else if (changeToGive >= 25) {
					change += ("\nQuarters: " + ((int) changeToGive / 25));
					changeToGive %= 25;

				} else if (changeToGive >= 10) {
					change += ("\nDimes: " + ((int) changeToGive / 10));
					changeToGive %= 10;

				} else if (changeToGive >= 5) {
					change += ("\nNickels: " + ((int) changeToGive / 5));
					changeToGive %= 5;

				} else if (changeToGive >= 1) {
					change += ("\nPennies: " + ((int) changeToGive / 1));
					changeToGive %= 1;

				}

			}
		}

		return change;
	}

	public static void calculation(Scanner keyboard) {
		String contOrQuit = "";
		do {
			System.out.print("\nHow much does it cost?    $");
			double total = keyboard.nextDouble();
			System.out.print("How much are you paying?  $");
			double payment = keyboard.nextDouble();
			System.out.println(makeChange(total, payment));
			System.out.println("\nWould you like to calculate another item? ");
			System.out.print("If no, please enter 'quit': ");
			contOrQuit = keyboard.next();
														//Condition will only check for quit
		} while (!contOrQuit.equalsIgnoreCase("quit")); //Other responses will continue the code
		System.out.println("\nThank you! Goodbye!");	
	}

}
