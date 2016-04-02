package testClasses;
import sortingAlgorithms.AlgorithmCreator;
import sortingAlgorithms.SortingAlgorithm;
import sortingAlgorithms.AlgorithmType;

public class CumulativeTest {

	public static void main(String[] args) {
		try {
			SortingAlgorithm[] s = new SortingAlgorithm[] { 
					AlgorithmCreator.createAlgorithm(AlgorithmType.RADIX_SORT_LSD),
					AlgorithmCreator.createAlgorithm(AlgorithmType.QUICK_SORT), 
					AlgorithmCreator.createAlgorithm(AlgorithmType.MERGE_SORT)  
					};
			printHeader(s);

			for (double numElementsD = 10000; numElementsD < 100000000; numElementsD *= 1.2) {
				int numElements = (int) numElementsD;
				StringBuilder line = new StringBuilder();
				line.append(String.valueOf(numElements) + ";");
				int[] v = ArrayManager.setUpArray(numElements);

				long beginTime = System.currentTimeMillis();
				for (int i = 0; i < s.length; i++) {
					line.append(ArrayManager.getSortedStr(s[i], v.clone()) + ';');
				}
				long endTime = System.currentTimeMillis();
				line.append(endTime - beginTime);

				System.out.println(line.toString());
			}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public static void printHeader(SortingAlgorithm[] s) {
		StringBuilder str = new StringBuilder();
		str.append("NumElements;");
		for (int i = 0; i < s.length; i++) {
			str.append(s[i]);
			str.append(';');
		}
		str.append("Total");
		System.out.println(str.toString());
	}

}
