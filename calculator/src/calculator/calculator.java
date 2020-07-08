package calculator;

import java.util.Scanner;

public class calculator {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator");
		System.out.println("Please select from our list of options: ");
		System.out.println("For addition press 1");
		System.out.println("For subtraction press 2");
		System.out.println("For multiplcation press 3");
		System.out.println("For division press 4");
		int menu = input.nextInt();
		System.out.println("Excellent choice.  Now what numbers should we use? (Max 2)");
		int x = input.nextInt();
		
		int y = input.nextInt();

		switch (menu) {
		case 1:
			System.out.println("Performing complex calculations.. Please wait");
			addition(x, y);
			break;
		case 2:
			System.out.println("Performing complex calculations.. Please wait");
			subtraction(x, y);
			break;
		case 3:
			System.out.println("Performing complex calculations.. Please wait");
			multiplication(x, y);
			break;
		case 4:
			System.out.println("Performing complex calculations.. Please wait");
			division(x, y);
			break;
		}
	}

	public static int addition(int x, int y) {
		int sum = x + y;
		System.out.println("Your answer is " + sum);
		return sum;
	}

	public static int subtraction(int x, int y) {
		int sum = x - y;
		System.out.println("Your answer is " + sum);
		return sum;
	}

	public static int multiplication(int x, int y) {

		int sum = x * y;
		System.out.println("Your answer is " + sum);
		return sum;
	}

	public static void division(int x, int y) {
		int sum = x / y;
		int remainder = x % y;
		if (remainder == 0) {
			System.out.println("Your answer is " + sum);

		} else if (x % y != 0) {
			System.out.println("Your answer is " + sum + " with a remainder of " + remainder);

		}
	}
}
