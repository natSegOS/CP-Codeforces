import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

		String expr = fr.next();
		int[] orderedNums = Arrays.stream(expr.split("[+]")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(orderedNums);

		String orderedExpr = IntStream.of(orderedNums).mapToObj(Integer::toString).collect(Collectors.joining("+"));
		System.out.println(orderedExpr);
	}
}
