package sortingAlgorithms;



public class AlgorithmCreator {
	public static SortingAlgorithm createAlgorithm(AlgorithmType type) {
		SortingAlgorithm s;
		
		switch (type) {
		case BUBBLE_SORT:
			s = new BubbleSort();
			break;
		case COCKTAIL_SORT:
			s = new CocktailSort();
			break;
		case COMB_SORT:
			s = new CombSort();
			break;
		case CYCLE_SORT:
			s = new CycleSort();
			break;
		case GNOME_SORT:
			s = new GnomeSort();
			break;
		case HEAP_SORT:
			s = new HeapSort();
			break;
		case INSERTION_SORT:
			s = new InsertionSort();
			break;
		case MERGE_SORT:
			s = new MergeSort();
			break;
		case MERGE_SORT_IN_PLACE:
			s = new MergeSortInPlace();
			break;
		case PATIENCE_SORT:
			s = new PatienceSort();
			break;
		case QUICK_SORT:
			s = new QuickSort();
			break;
		case RADIX_SORT_LSD:
			s = new RadixSortLSD();
			break;
		case SELECTION_SORT:
			s = new SelectionSort();
			break;
		case SHELL_SORT:
			s = new ShellSort();
			break;
		default:
			throw (new IllegalArgumentException("The input is not valid."));
		}
		return s;
	}
}
