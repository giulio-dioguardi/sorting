public class CumulativeTest {

	public static void main(String[] args) {
		SortingAlgorithm[] s = new SortingAlgorithm[] { new QuickSort(), new MergeSort(), new HeapSort(),
				new RadixSortLSD(), new SelectionSort() };
		printHeader(s);

		for (double numElementsD = 1000; numElementsD < 10000000; numElementsD *= 1.09) {
			int numElements = (int) numElementsD;
			String line = String.valueOf(numElements) + ";";
			int[] v = ArrayManager.setUpArray(numElements);

			long beginTime = System.currentTimeMillis();
			for (int i = 0; i < s.length; i++) {
				line += ArrayManager.getSorted(s[i], v.clone()) + ';';
			}
			long endTime = System.currentTimeMillis();
			line += (endTime - beginTime);

			System.out.println(line);
		}
	}

	public static void printHeader(SortingAlgorithm[] s) {
		String str = "NumElements;";
		for (int i = 0; i < s.length; i++) {
			str += s[i].getName() + ';';
		}
		str += "Total";
		System.out.println(str);
	}

}
