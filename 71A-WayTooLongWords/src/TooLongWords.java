import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TooLongWords {
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

		for (int i = 1; i <= n; i++) {
			String s = fr.next();
			int length = s.length();

			if (s.length() > 10) {
				System.out.printf("%s%d%s\n", s.charAt(0), length - 2, s.charAt(length - 1));
			} else {
				System.out.println(s);
			}
		}
	}
}
