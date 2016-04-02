package sortingAlgorithms;

public class CycleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] v) {
		// TODO Auto-generated method stub
		
		for (int i = 0 ; i <= v.length - 2 ; i++) {
			int item = v[i];
			int pos = i;
			for (int j = i + 1; j <= v.length - 1 ; j++) {
				if (v[j] < item) {
					pos++;
				}
			}
			if (pos == i) {
				continue;
			}
			
			while (item == v[pos]) {
				pos++;
			}
			Swapper.swap(v, i, pos);
			while (pos != i) {
				pos = i;
				for (int j = i + 1; j <=v.length - 1; j++) {
					if (v[j] < item) {
						pos++;
					}
				}
				while (item == v[pos]) {
					pos++;
				}
				Swapper.swap(v, i, pos);
			}
		}		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cycle Sort";
	}

}
