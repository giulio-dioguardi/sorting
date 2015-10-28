
public class MergeSort implements SortingAlgorithm {

	public void sort(int v[], int left, int right) {
		if (v.length <= 1) {
			return;
		}

		int i1 = v.length / 2;
		int[] vLeft = new int[i1];
		for (int i = 0; i < i1; i++) {
			vLeft[i] = v[i];
		}
		int[] vRight = new int[v.length - i1];
		for (int i = i1; i < v.length; i++) {
			vRight[i - i1] = v[i];
		}

		sort(vLeft, 0, 0);
		sort(vRight, 0, 0);

		int iLeft = 0;
		int iRight = 0;

		for (int i = 0; i < v.length; i++) {
			if (iLeft >= vLeft.length) {
				v[i] = vRight[iRight++];
			} else if (iRight >= vRight.length) {
				v[i] = vLeft[iLeft++];
			} else if (vLeft[iLeft] < vRight[iRight]) {
				v[i] = vLeft[iLeft++];
			} else {
				v[i] = vRight[iRight++];
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Merge Sort";
	}
}
