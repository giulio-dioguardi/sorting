package sortingAlgorithms;

public class Swapper {
	public static void swap(int v[], int i, int j) {
		int temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}
}
