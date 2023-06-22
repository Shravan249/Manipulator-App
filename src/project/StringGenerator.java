package project;

import java.util.Scanner;

public class StringGenerator extends StringManipulation {

	Scanner sc;

	public void stringLoop() throws Exception {

		sc = new Scanner(System.in);
		printWelcome();
		printMenu();
		String options = "-1";

		while (!options.equals("3")) {

			options = sc.next();
			switch (options) {

			case "1": {
				System.out.println("Enter the String");
				String str = sc.next();
				reverseString(str);
				Thread.sleep(3000);
				printMenu();

			}
			case "2": {
				System.out.println("Enter the String");
				String str1 = sc.next();
				System.out.println("Enter the second String");
				String str2 = sc.next();
				Anagram(str1, str2);
				Thread.sleep(3000);
				printMenu();

			}
			case "3": {
				System.out.println("Enter the String");
				String str = sc.next();
				balanced(str);
				Thread.sleep(3000);
				printMenu();
				break;
			}
			case "4": {
				System.out.println("Enter the String");
				String str1 = sc.next();
				System.out.println("Enter the second String");
				String str2 = sc.next();
				stringConcat(str1, str2);
				Thread.sleep(3000);
				printMenu();
				break;
			}
			case "5": {
				System.out.println("Enter the String");
				String str = sc.next();
				stringPalidrome(str);
				Thread.sleep(3000);
				printMenu();
				break;
			}
			case "6": {
				System.out.println("Enter the String");
				String str = sc.next();
				occurence(str);
				Thread.sleep(3000);
				printMenu();
				break;
			}
			case "7": {

				Generators gen = new Generators();
				gen.printWelcome();
				gen.printMenu();
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

	private void printWelcome() {

		System.out.println("Welcome to String Manipulation");

	}

	private void printMenu() {

		System.out.println();
		System.out.println("Press 1 : Reverse a String");
		System.out.println("Press 2 : Anagram");
		System.out.println("Press 3 : Balanced");
		System.out.println("Press 4 : Concat a Strings");
		System.out.println("Press 5 : Palidrome of String");
		System.out.println("Press 6 : Occurence of Characters in a String");
		System.out.println("Press 7 : Quit");
		System.out.print("Choice : ");

	}
}
