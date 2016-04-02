package testClasses;
import sortingAlgorithms.HeapSort;
import sortingAlgorithms.MergeSort;
import sortingAlgorithms.QuickSort;
import sortingAlgorithms.RadixSortLSD;
import sortingAlgorithms.ShellSort;
import sortingAlgorithms.SortingAlgorithm;

public class CumulativeTestAveraged {

	public static void main(String[] args) {
		SortingAlgorithm[] s = new SortingAlgorithm[] { new QuickSort(), new MergeSort(), new HeapSort(),
				new RadixSortLSD(), new ShellSort() };
		int averagingNumber = 4;
		printHeader(s, averagingNumber);

		for (double numElementsD = 1000; numElementsD < 200000; numElementsD *= 1.02) {
			int numElements = (int) numElementsD;
			String line = String.valueOf(numElements) + ";";
			int[] v = ArrayManager.setUpArray(numElements);

			long beginTime = System.currentTimeMillis();
			for (int i = 0; i < s.length; i++) {
				line += ArrayManager.getSorted(s[i], v.clone(), averagingNumber) + ';';
			}
			long endTime = System.currentTimeMillis();
			line += ((double)(endTime - beginTime) / averagingNumber);

			System.out.println(line);
		}
	}

	public static void printHeader(SortingAlgorithm[] s, int averagingNumber) {
		System.out.println("Results averaged by :" + averagingNumber);
		String str = "NumElements;";
		for (int i = 0; i < s.length; i++) {
			str += s[i].getName() + ';';
		}
		str += "Total";
		System.out.println(str);
	}

}
