package com.skilldistillery.homework;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(makeChange(45, 99)); // 45,99 should be 54
//		System.out.println(makeChange(tallyPayment(keyboard));

		keyboard.close();

	}

	// Method to calculate change and print total. Potentially, return string. (Two
	// Double Parameters)
	// need while loop and if statements for:
	// Twenty, Ten, Five, One --- Dollars/
	// Quarter, Dime, Nickel, Penny --- Coins

	public static String makeChange(double total, double payment) {
		String change = "";
		int twentyD, tenD, fiveD, oneD;
//		int quarters, dimes, nickels, pennies;
		double changeToGive = payment - total;
		int dollarsToGive = (int)changeToGive;
		double centsToGive = (changeToGive - dollarsToGive) * 100;

		while (dollarsToGive > 0) {
			
			if (dollarsToGive >= 20) {
				twentyD = (int) dollarsToGive / 20;
				dollarsToGive -= (twentyD * 20);
				change += ("\n$20: " + twentyD);
				System.out.println(change);
				
			} else if (dollarsToGive >= 10) {
				tenD = (int) dollarsToGive / 10;
				dollarsToGive -= (tenD * 10);
				change += ("\n$10: " + tenD);
				System.out.println(change);
				
			} else if (dollarsToGive >= 5) {
				fiveD = (int) dollarsToGive / 5;
				dollarsToGive -= (fiveD * 5);
				change += ("\n$5: " + fiveD);
				System.out.println(change);
				
			} else if (dollarsToGive >= 1) {
				oneD = (int)dollarsToGive / 1;
				dollarsToGive -= (oneD * 1);
				change += ("\n$1: " + oneD);
				System.out.println(change);
				
//			} if (changeToGive > 0 && changeToGive < 1) {
//				centsToGive = (int)(changeToGive * 100);
//				System.out.println(centsToGive);
//				changeToGive = 0;
			}
//			while (centsToGive > 0) {
//				
//			}
		}

		return change;
	}
	// Method to ask for payment (keyboard parameter) - call calculate method, pass
	// two parameters.

	public static double tallyPayment(Scanner keyboard) {
		double value = keyboard.nextDouble();
		return value;
		

		

	}

}
