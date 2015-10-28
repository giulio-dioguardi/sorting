
public interface SortingAlgorithm {
	Swapper swapper = new Swapper();
	public void sort(int v[], int left, int right);
	public String getName();
}
