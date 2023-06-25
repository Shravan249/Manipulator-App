package project;

import java.util.*;

public class Generators {

	Scanner sc;

	public void loop() throws Exception {

		sc = new Scanner(System.in);

		printWelcome();
		printMenu();
		String options = "-1";

		while (!options.equals("4")) {

			options = sc.next();
			switch (options) {

			case "1": {

				StringGenerator words = new StringGenerator();
				words.stringLoop();
				break;
			}
			case "2": {
				NumberGenerator number = new NumberGenerator();
				number.numberLoop();
				break;

			}
			case "3": {

				printQuitMsg();
				break;
			}

			default: {
				System.out.println();
				System.out.println("Please select correct Option");
				System.out.println("***************************");
				printMenu();
			}

			}

		}

	}

	private void printQuitMsg() {

		System.out.println();
		System.out.print("Thank You for Using and Have a good day :) ");

	}

	public void printWelcome() {

		System.out.println("Welcome to Manipulation App");

	}

	public void printMenu() {

		System.out.println();
		System.out.println("Press 1 : String Manipulation");
		System.out.println("Press 2 : Number Manipulation");
		System.out.println("Press 3 : Quit");
		System.out.print("Choice : ");

	}
}
