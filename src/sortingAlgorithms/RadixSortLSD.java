package sortingAlgorithms;

public class RadixSortLSD implements SortingAlgorithm {
	private static final int BITS_PER_BYTE = 8;

	/**
	 * Rearranges the array of 32-bit integers in ascending order. This is about
	 * 2-3x faster than Arrays.sort().
	 * @param v
	 *            the array to be sorted
	 */
	public void sort(int[] v) {
		int BITS = 32; // each int is 32 bits
		int W = BITS / BITS_PER_BYTE; // each int is 4 bytes
		int R = 1 << BITS_PER_BYTE; // each bytes is between 0 and 255
		int MASK = R - 1; // 0xFF

		int N = v.length;
		int[] aux = new int[N];

		for (int d = 0; d < W; d++) {

			// compute frequency counts
			int[] count = new int[R + 1];
			for (int i = 0; i < N; i++) {
				int c = (v[i] >> BITS_PER_BYTE * d) & MASK;
				count[c + 1]++;
			}

			// compute cumulates
			for (int r = 0; r < R; r++)
				count[r + 1] += count[r];

			// for most significant byte, 0x80-0xFF comes before 0x00-0x7F
			if (d == W - 1) {
				int shift1 = count[R] - count[R / 2];
				int shift2 = count[R / 2];
				for (int r = 0; r < R / 2; r++)
					count[r] += shift1;
				for (int r = R / 2; r < R; r++)
					count[r] -= shift2;
			}

			// move data
			for (int i = 0; i < N; i++) {
				int c = (v[i] >> BITS_PER_BYTE * d) & MASK;
				aux[count[c]++] = v[i];
			}

			// copy back
			for (int i = 0; i < N; i++)
				v[i] = aux[i];
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Radix Sort LSD";
	}
}
