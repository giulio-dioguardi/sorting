
public class QuickSort implements SortingAlgorithm {
	public void sort(int v[]) {
		qsort(v, 0, v.length - 1);
	}

	private void qsort(int v[], int left, int right) {
		int last;
		if (left >= right)
			return;
		swapper.swap(v, left, (left + right) / 2);
		last = left;
		for (int i = left + 1; i <= right; i++) {
			if (v[i] < v[left]) {
				swapper.swap(v, ++last, i);
			}
		}
		swapper.swap(v, left, last);
		qsort(v, left, last - 1);
		qsort(v, last + 1, right);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Quick Sort";
	}
}
