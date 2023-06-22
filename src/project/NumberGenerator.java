package project;

import java.util.*;

public class NumberGenerator extends NumberManipulations {

	Scanner sc;

	public void numberLoop() throws Exception {
		sc = new Scanner(System.in);

		printWelcome();
		printMenu();

		String options = "-1";

		while (!options.equals("3")) {

			options = sc.next();
			switch (options) {

			case "1": {

				System.out.println("Enter the Number");
				int num = sc.nextInt();
				palidrome(num);
				Thread.sleep(3000);
				printMenu();break;

			}
			case "2": {
				System.out.println("Enter the Number");
				int num = sc.nextInt();
				prime(num);
				Thread.sleep(3000);
				printMenu();break;

			}
			case "3": {
				System.out.println("Enter the Number");
				int num = sc.nextInt();
				evenOrOdd(num);
				Thread.sleep(3000);
				printMenu();break;

			}
			case "4": {
				System.out.println("Enter the Number");
				int num = sc.nextInt();
				multiplication(num);
				Thread.sleep(3000);
				printMenu();break;

			}
			case "5": {
				System.out.println("Enter the Number");
				int num = sc.nextInt();
				reverseNumber(num);
				Thread.sleep(3000);
				printMenu();break;

			}
			case "6": {

				System.out.println("Enter the size of array");
				int size=sc.nextInt();
				int[] num = new int[size];  
				System.out.println("Enter the Array elements");
				for(int i=0; i<size; i++) {
					num[i] = sc.nextInt();
				}
				System.out.println("Enter the Number");
				int target = sc.nextInt();
				pairs(num, target);
				Thread.sleep(3000);
				printMenu();break;

			}
			case "7": {
				System.out.println("Enter the size of array");
				int size=sc.nextInt();
				int[] num = new int[size];  
				System.out.println("Enter the Array elements");
				for(int i=0; i<size; i++) {
					num[i] = sc.nextInt();
				}
				System.out.println("Enter the number");
				int target = sc.nextInt();
				triplets(num, target);
				Thread.sleep(3000);
				printMenu();break;

			}

			case "8": {
				System.out.println("Enter the Number");
				int count = sc.nextInt();
				fibanocci(count);
				Thread.sleep(3000);
				printMenu();break;

			}
			case "9": {

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

	public void printWelcome() {

		System.out.println("Welcome to Number Manipulation");

	}

	public void printMenu() {

		System.out.println();
		System.out.println("Press 1 : Palidrome of a number");
		System.out.println("Press 2 : Prime or Not");
		System.out.println("Press 3 : Even or Odd");
		System.out.println("Press 4 : Mutiplication");
		System.out.println("Press 5 : Reverse of a given Number");
		System.out.println("Press 6 : Pairs  addition of a given Array");
		System.out.println("Press 7 : Triplets  Addition in a given Array");
		System.out.println("Press 8 : Fibnociss series");
		System.out.println("Press 9 : Quit");
		System.out.print("Choice : ");

	}
}
