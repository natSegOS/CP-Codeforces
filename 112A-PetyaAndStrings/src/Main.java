import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
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
	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();

		String str1 = fr.next();
		String str2 = fr.next();

		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println(0);
		} else if (str1.compareToIgnoreCase(str2) > 0) {
			System.out.println(1);
		} else if (str1.compareToIgnoreCase(str2) < 0) {
			System.out.println(-1);
		}
	}
}
