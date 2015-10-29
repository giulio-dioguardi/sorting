
public class ShellSort implements SortingAlgorithm {

	@Override
	public void sort(int[] v) {
		// TODO Auto-generated method stub
		for (int col = v.length / 3;; col /= 3) {
			if (col == 0)
				col = 1;
			for (int i = col; i < v.length; i++) {
				int j = 0;
				while (i - j >= col && v[i - j] < v[i - col - j]) {
					swapper.swap(v, i-j, i-col-j);
					j+=col;					
				}
			}
			if(col==1)
				return;
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Shell Sort";
	}

}
