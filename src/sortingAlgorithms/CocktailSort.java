package sortingAlgorithms;

public class CocktailSort implements SortingAlgorithm {

	@Override
	public void sort(int[] v) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < v.length - 2; i++) {
				if (v[i] > v[i + 1]) {
					Swapper.swap(v, i, i + 1);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
			swapped = false;
			for (int i = v.length - 2; i > 0; i--) {
				if (v[i] > v[i + 1]) {
					Swapper.swap(v, i, i + 1);
					swapped = true;
				}
			}
		} while (swapped);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Cocktailshaker Sort";
	}
}
