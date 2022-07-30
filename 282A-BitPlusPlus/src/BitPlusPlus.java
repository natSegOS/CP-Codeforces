import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BitPlusPlus {
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

		int x, n;
		x = 0;
		n = fr.nextInt();

		for (int i = 0; i < n; i++) {
			String statement = fr.next();

			if (statement.contains("++")) {
				x++;
			} else if (statement.contains("--")) {
				x--;
			}
		}

		System.out.println(x);
	}
}
