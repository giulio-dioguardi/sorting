
public class HeapSort implements SortingAlgorithm {

	public void sort(int v[]) {
		heapify(v);

		int end = v.length - 1;

		while (end > 0) {
			swapper.swap(v, end, 0);
			end--;
			siftDown(v, 0, end);
		}
	}

	private void heapify(int v[]) {
		for (int start = (v.length - 2) / 2; start >= 0; start--) {
			siftDown(v, start, v.length - 1);
		}
	}

	private void siftDown(int v[], int start, int end) {
		int root = start;

		while (root * 2 + 1 <= end) {
			int child = root * 2 + 1;
			int swapped = root;

			if (v[swapped] < v[child]) {
				swapped = child;
			}
			if (child + 1 <= end && v[swapped] < v[child + 1]) {
				swapped = child + 1;
			}
			if (swapped == root) {
				return;
			} else {
				swapper.swap(v, root, swapped);
				root = swapped;
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Heap Sort";
	}
}
