package sortingAlgorithms;

public class SelectionSort implements SortingAlgorithm {
	@Override
	public void sort(int[] v) {
		// TODO Auto-generated method stub
		for (int i = 0; i < v.length; i++) { // invoer = array met integers

			int minIndex = i; // zoek kleinste in de rest van de array
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[minIndex]) {
					minIndex = j;
				}
			}
			Swapper.swap(v, i, minIndex); // verwissel waarden
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Selection Sort";
	}

}
