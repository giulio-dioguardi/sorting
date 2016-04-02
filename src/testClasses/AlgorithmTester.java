package testClasses;

import sortingAlgorithms.SortingAlgorithm;

import java.util.Scanner;

import sortingAlgorithms.AlgorithmCreator;
import sortingAlgorithms.AlgorithmType;

public class AlgorithmTester {
	static SortingAlgorithm s;
	static int numElements;
	static int numTries;

	public static void main(String[] args) {
		System.out.println("Welcome to Sorting Algorithm Playground!");
		printMenu();
		s = AlgorithmCreator.createAlgorithm(AlgorithmType.RADIX_SORT_LSD);
		numElements = 6000000;// readFromUser("Select the number of elements:");
		numTries = 70;// readFromUser("Select the number of repetitions: ");
		processInputs();
	}

	public static int readFromUser(String title) {
		int output = 0;
		Scanner scanner = new Scanner(System.in);
		scanner.reset();
		boolean bError = true;

		/*
		 * while (true) { System.out.println(title); if (scanner.hasNextInt()) {
		 * output = scanner.nextInt(); break; } else { scanner.next();
		 * scanner.reset(); continue; } }
		 */

		do {
			try {
				System.out.println(title);
				String line = scanner.next();
				Scanner sc = new Scanner(line);
				output = scanner.nextInt();
				sc.close();
				bError = false;
			} catch (Exception e) {
				System.out.println("Error!\n");
				scanner.next();
				scanner.reset();
			}
		} while (bError);
		scanner.close();
		return output;
	}

	private static void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("\n---MENU---\n");
		for (AlgorithmType type : AlgorithmType.values()) {
			SortingAlgorithm s = AlgorithmCreator.createAlgorithm(type);
			System.out.println(type.ordinal() + "\t" + s.getName());
		}

	}

	public static void processInputs() {
		try {
			System.out.println("Processing.....");
			int[] v = ArrayManager.setUpArray(numElements);
			long totalTime = 0;
			for (int i = 1; i <= numTries - 1; i++) {
				int[] w = v.clone();
				long beginTime = System.currentTimeMillis();
				s.sort(w);
				long endTime = System.currentTimeMillis();
				totalTime += endTime - beginTime;
				// System.out.println("Sorting algorithm " + s.getName() + "
				// took: "
				// + str + "ms.");
				if (i % 10 == 0) {
					System.out.print(".");
				}
				if (i % (80 * 10) == 0) {
					System.out.print("\n");
				}
			}
			System.out.print("\n");
			// ArrayManager.printResults(v);
			System.out.println("Sorting algorithm " + s.getName() + " took " + String.valueOf(totalTime) + "ms to sort "
					+ numElements + " elements " + numTries + " times.");
			System.out.println("That's an average of " + String.valueOf(((double) (totalTime) / numTries) * 1000)
					+ " µs per time.");
			System.out.println("");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
