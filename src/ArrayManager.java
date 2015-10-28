import java.util.Random;

public class ArrayManager {
	public static int[] setUpArray(int numElements) {
		Random rnd = new Random();
		int[] v = new int[numElements];

		for (int i = 0; i < v.length; i++) {
			v[i] = rnd.nextInt(numElements) + 1;
		}
		return v;
	}

	public static String getSorted(SortingAlgorithm s, int v[]) {
		long beginQ = System.currentTimeMillis();
		s.sort(v, 0, v.length - 1);
		long endQ = System.currentTimeMillis();
		// System.out.println("Quick sort took: " + (endQ - beginQ) +
		// "ms.");
		String line = String.valueOf((endQ - beginQ));
		return line;
	}

	public static void printResults(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
}
