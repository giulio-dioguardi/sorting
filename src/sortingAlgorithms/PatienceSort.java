package sortingAlgorithms;

import java.util.*;

public class PatienceSort implements SortingAlgorithm {

	@Override
	public void sort(int[] v) {
		// TODO Auto-generated method stub
		List<Pile<Integer>> piles = new ArrayList<Pile<Integer>>();
		for (int x : v) {
			Pile<Integer> newPile = new Pile<Integer>();
			newPile.add(x);
			int i = Collections.binarySearch(piles, newPile);
			if (i < 0) {
				i = ~i;
			}
			if (i != piles.size()) {
				piles.get(i).push(x);
			} else {
				piles.add(newPile);
			}
		}

		PriorityQueue<Pile<Integer>> heap = new PriorityQueue<Pile<Integer>>(piles);
		for (int c = 0; c < v.length; c++) {
			Pile<Integer> smallPile = heap.poll();
			v[c] = smallPile.pop();
			if (!smallPile.isEmpty()) {
				heap.offer(smallPile);
			}

		}
		assert (heap.isEmpty());
	}

	
	private class Pile<E extends Comparable<? super E>> extends Stack<E> implements Comparable<Pile<E>> {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7318825230713569584L;

		public int compareTo(Pile<E> y) {
			return peek().compareTo(y.peek());
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Patience Sort";
	}

}
