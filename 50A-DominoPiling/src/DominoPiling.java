import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DominoPiling {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();

		int M, N;
		M = fr.nextInt();
		N = fr.nextInt();

		int largestSide = Math.max(M, N);
		int shortestSide = Math.min(M, N);

		int dominoCount = (Math.floorDiv(largestSide, 2) * shortestSide) + (largestSide % 2 != 0 ? Math.floorDiv(shortestSide, 2) : 0);
		System.out.println(dominoCount);
	}
}
