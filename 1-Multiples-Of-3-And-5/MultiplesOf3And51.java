import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplesOf3And51 {

	static long s(long n) {
		return n*(n+1)/2;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		long N;
		for (int i = 0; i < T; ++i) {
			N = Integer.parseInt(br.readLine().trim()) - 1;
			System.out.println(s(N/3)*3 + s(N/5)*5 - s(N/15)*15);
		}
	}
}
