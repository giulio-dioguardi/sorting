package testClasses;
import java.util.Random;

import sortingAlgorithms.SortingAlgorithm;

public class ArrayManager {
	public static int[] setUpArray(int numElements) {
		Random rnd = new Random();
		int[] v = new int[numElements];

		for (int i = 0; i < v.length; i++) {
			v[i] = rnd.nextInt(numElements) + 1;
		}
		return v;
	}

	public static String getSortedStr(SortingAlgorithm s, int v[]) {
		long beginQ = System.currentTimeMillis();
		s.sort(v);
		long endQ = System.currentTimeMillis();
		String line = String.valueOf(endQ - beginQ);
		return line;
	}

	public static String getSorted(SortingAlgorithm s, int v[], int averagingNumber) {
		int totalTime = 0;
		for (int i = 0; i < averagingNumber; i++) {
			int[] copy = v.clone();
			long beginQ = System.currentTimeMillis();
			s.sort(copy);
			long endQ = System.currentTimeMillis();
			totalTime += endQ - beginQ;
		}
		double average = totalTime / (double) averagingNumber;
		String line = String.valueOf(average);
		return line;
	}

	public static void printResults(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
}
