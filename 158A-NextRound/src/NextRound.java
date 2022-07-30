import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NextRound {
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

		int n = fr.nextInt();
		int k = fr.nextInt();

		int passed = 0;

		int[] participants = new int[n];

		for (int i = 0; i < n; i++) {
			int score = fr.nextInt();
			participants[i] = score;
		}

		int pScore = participants[k - 1];

		for (int score : participants) {
			if (score > 0 && score >= pScore) {
				passed++;
			}
		}

		System.out.println(passed);
	}
}
