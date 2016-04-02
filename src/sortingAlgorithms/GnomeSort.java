package sortingAlgorithms;

public class GnomeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] v) {
		// TODO Auto-generated method stub
		int pos = 1;
		while (pos < v.length) {
			if(v[pos] >= v[pos-1]) {
				pos++;
			} else {
				Swapper.swap(v, pos, pos - 1);
				if (pos > 1) {
					pos--;
				}
			}
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Gnome Sort";
	}

}
