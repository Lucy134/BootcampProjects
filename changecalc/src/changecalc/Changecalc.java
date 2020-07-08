package changecalc;

import java.util.Scanner;

public class Changecalc {

	public static void main(String[] args) {
		changeCalc();

	}

	public static void changeCalc() {
		// we're going to need a number, lets get one:
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an amount between 1-99 to calculate coins");
		int change = input.nextInt();
		// now we have to do the math, which is easy because we've done this before!
		int quart = change / 25;
		int dimes = (change % 25) / 10;
		int nick = ((change % 25) % 10) / 5;
		int penn = ((change % 25) % 10) % 5;
		// tested it, it works great, but I need to not display returns of 0
		if (quart != 0) {
			System.out.println("Number of quarters: " + quart);
		}
		if (dimes != 0) {
			System.out.println("Number of dimes: " + dimes);
		}
		if (nick != 0) {
			System.out.println("Number of nickels: " + nick);
		}
		if (penn != 0) {
			System.out.println("Number of pennies: " + penn);
		}
	}
}
