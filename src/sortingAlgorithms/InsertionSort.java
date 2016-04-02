package sortingAlgorithms;

public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] v) {
		// TODO Auto-generated method stub
		for (int i = 1; i < v.length; i++) {
			int hulp = v[i];
			int j = i - 1;
			while (j >= 0 && hulp < v[j]) {
				v[j + 1] = v[j];
				j--;
			}
			v[j + 1] = hulp;
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Insertion Sort";
	}

}
