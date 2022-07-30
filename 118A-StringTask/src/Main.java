import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		List<String> vowels = Arrays.asList(new String[]{"a", "e", "i", "o", "u", "y"});
		FastReader fr = new FastReader();

		String word = fr.next();
		StringBuilder sb = new StringBuilder(word.toLowerCase());

		for (int i = sb.length() - 1; i >= 0; i--) {
			if (vowels.contains(Character.toString(sb.charAt(i)))) {
				sb.deleteCharAt(i);
			}
		}

		for (int i = 0; i < sb.length(); i += 2) {
			sb.insert(i, '.');
		}

		System.out.println(sb);
	}
}
