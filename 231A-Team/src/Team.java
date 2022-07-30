import jdk.jfr.StackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Team {
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
		int tp = 0;

		for (int i = 1; i <= n; i++) {
			int f = 0;

			for (int j = 1; j <= 3; j++) {
				int fo = fr.nextInt();

				if (fo == 1) {
					f++;
				}
			}

			if (f >= 2) {
				tp++;
			}
		}

		System.out.println(tp);
	}
}
