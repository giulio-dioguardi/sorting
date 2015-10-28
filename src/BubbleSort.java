
public class BubbleSort implements SortingAlgorithm {

	public void sort(int v[], int a, int b) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 1; j < v.length - i; j++) {
				if (v[j - 1] > v[j]) {
					swapper.swap(v, j, j - 1);
				}
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Bubble Sort";
	}
}
