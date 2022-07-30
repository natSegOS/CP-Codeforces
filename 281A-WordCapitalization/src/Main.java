import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		final FastReader fr = new FastReader();

		final String word = fr.next();
		StringBuilder sb = new StringBuilder(word);

		final char firstChar = sb.charAt(0);

		if (!Character.isUpperCase(firstChar)) {
			sb.replace(0, 1, Character.toString(Character.toUpperCase(firstChar)));
		}

		System.out.println(sb);
	}
}
