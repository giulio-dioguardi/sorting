package sortingAlgorithms;

public class MergeSortInPlace implements SortingAlgorithm {

	@Override
	public void sort(int[] v) {
		// TODO Auto-generated method stub
		int[] x = new int[v.length];
		mergeSort(v, x);
	}

	
	private void mergeSort(int[] v, int[] x) {
		// TODO Auto-generated method stub
		for (int width = 1; width < v.length; width *= 2) {
			for ( int i = 0; i < v.length; i = i + 2 * width) {
				bottomUpMerge(v, i,  Math.min(i+width, v.length), Math.min(i + 2 * width, v.length), x);
				
			}
			copyArray(x,v);
		}
	}

	private void bottomUpMerge(int[] v, int left, int right, int end, int[] x) {
		// TODO Auto-generated method stub
		int i0 = left;
		int i1 = right;
		
		for ( int j = left; j < end; j++) {
			if (i0 < right && (i1 >= end || v[i0] <= v[i1])) {
				x[j] = v[i0];
				i0++;
			} else {
				x[j] = v[i1];
				i1++;
			}
		}
	}

	private void copyArray(int[] x, int[] v) {
		for (int k = 0; k <v.length; k++) {
			v[k] = x[k];
		}
	}
	
	@Override
	public String getName() {
		return "Merge Sort in place";
	}

}
