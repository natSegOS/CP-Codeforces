import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeautifulMatrix {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		int nextInt() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			return Integer.parseInt(st.nextToken());
		}
	}

	public static void main(String[] args) {
		FastReader fr = new FastReader();

		int[][] matrix = new int[5][5];
		int row = 0;
		int column = 0;

		int moves = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int value = fr.nextInt();

				if (value == 1) {
					row = i;
					column = j;
				}

				matrix[i][j] = value;
			}
		}

		while (matrix[2][2] != 1) {
			moves++;

			matrix[row][column] = 0;

			if (row > 2) {
				matrix[row - 1][column] = 1;
				row--;
			} else if (row < 2) {
				matrix[row + 1][column] = 1;
				row++;
			} else if (column > 2) {
				matrix[row][column - 1] = 1;
				column--;
			} else if (column < 2) {
				matrix[row][column + 1] = 1;
				column++;
			}
		}

		System.out.println(moves);
	}
}
