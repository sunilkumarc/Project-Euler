package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestPrimeFactor3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (long i = 0; i < T; ++i) {
			long N = Long.parseLong(br.readLine().trim());
			long result = 1;
			for (long primeFactor = 2; primeFactor*primeFactor <= N; ++primeFactor) {
				while (N % primeFactor == 0) {
					result = primeFactor;
					N /= primeFactor;
				}
				if (N > 1) {
					result = N;
				}
			}
			System.out.println(result);
		}
	}
}

/*
 * class InputReader { public BufferedReader reader; public StringTokenizer
 * tokenizer;
 *
 * public InputReader(InputStream stream) { reader = new BufferedReader(new
 * InputStreamReader(stream), 32768); tokenizer = null; }
 *
 * public String next() { while (tokenizer == null || tokenizer.hasMoreTokens())
 * { try { tokenizer = new StringTokenizer(reader.readLine()); } catch
 * (IOException e) { throw new RuntimeException(); } } return
 * tokenizer.nextToken(); }
 *
 * public int nextInt() { return Integer.parseInt(next()); } }
 */
