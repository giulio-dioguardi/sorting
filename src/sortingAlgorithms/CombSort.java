package sortingAlgorithms;

public class CombSort implements SortingAlgorithm {

	@Override
	public void sort(int[] v) {
		int gap = v.length;
		double shrink = 1.3;
		boolean swapped = true;

		while (gap != 1 && swapped) {
			gap = (int)((double)gap / shrink);
			if (gap < 1) {
				gap = 1;
			}
			
			swapped = false;
			
			for (int i = 0; i + gap < v.length; i++) {
				if (v[i] > v[i+gap]) {
					Swapper.swap(v, i, i+gap);
					swapped = true;
				}
			}
		}
	}

	@Override
	public String getName() {
		return "Comb Sort";
	}

}
