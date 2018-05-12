import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Made with love By Ayoub <3

public class GCD {

	public static void main(String[] args) throws Exception {
		FastScanner in = new FastScanner();
		int t = Integer.parseInt(in.nextLine());
		while(--t >= 0) {
			String s = in.nextLine();
			String[] split = s.split(" / ");
			long a = Long.parseLong(split[0]);
			long b = Long.parseLong(split[1]);
			long gcd = gcd(a, b);
			long x = a / gcd;
			long y = b / gcd;
			if(y == 1)
				System.out.println(x);
			else
				System.out.println(x+" / "+y);
		}
	}
	
	public static long gcd(long a, long b) {
	    if(b == 0) return a;
	    return gcd(b, a % b);
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