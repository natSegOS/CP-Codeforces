import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YESorYES {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while(st == null || !st.hasMoreElements()) {
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

		int t = fr.nextInt();

		for (int i = 1; i <= t; i++) {
			String s = fr.next();

			if ("YES".equalsIgnoreCase(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
