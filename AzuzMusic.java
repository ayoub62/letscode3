import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// Made with love By Ayoub <3

public class AzuzMusic {

	public static void main(String[] args) throws Exception {
		FastScanner in = new FastScanner();
		int n = in.nextInt();
		int k = in.nextInt() - 1;
		long[] mp3 = new long[n];
		for (int i = 0; i < mp3.length; i++) {
			mp3[i] = in.nextLong();
		}
		Arrays.sort(mp3);
		System.out.println(mp3[k]);
	}
	
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;   
		FastScanner(String fn) throws IOException {
			br = new BufferedReader(new FileReader(fn));
		}
		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() throws IOException {      
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());      
			return st.nextToken();
		}
		long nextLong() throws IOException {
			return Long.parseLong(next()); 
		}
		int nextInt() throws IOException {
			return Integer.parseInt(next()); 
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
	}
}
