public class AlgorithmTester {

	public static void main(String[] args) {
		SortingAlgorithm s = new SelectionSort();
		int numElements = 200000;
		int[] v = ArrayManager.setUpArray(numElements);

		String str = ArrayManager.getSorted(s, v);
		//ArrayManager.printResults(v);
		System.out.println("Sorting " + s.getName() + " took: " + str + "ms.");
		System.out.println("");
	}
}
