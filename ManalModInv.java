import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

// Made with love By Ayoub <3

public class ManalModInv {

	static long MOD = (long) 1e9 + 7;
	static long d;
	static long x;
	static long y;
	
	public static void main(String[] args) throws Exception {
		FastScanner in = new FastScanner();
		long[] fact = new long[30001];
		fact[0] = 1;
		for (int i = 1; i <= 30000; i++) {
			fact[i] = (i*fact[i-1]) % MOD;
		}
		int t = in.nextInt();
		while(--t >= 0) {
			int n = in.nextInt();
			Map<Long, Integer> map = new HashMap<>();
			for (int i = 1; i <= n; i++) {
				long tmp = in.nextLong();
				if(map.containsKey(tmp)) {
					int v = map.get(tmp);
					v++;
					map.put(tmp, v);
				}
				else
					map.put(tmp, 1);
			}
			long bas = 1;
			for(Entry<Long, Integer> e : map.entrySet())
				bas *= fact[e.getValue()];
			extendedEuclid(bas, MOD);
			if(x < 0)
				bas = (x + MOD) % MOD;
			else
				bas = x % MOD;
			System.out.println((fact[n] % MOD * bas % MOD) % MOD);
		}
	}
	
	
	public static void extendedEuclid(long A, long B) {
	    if(B == 0) {
	        d = A;
	        x = 1;
	        y = 0;
	    }
	    else {
	        extendedEuclid(B, A%B);
	        long temp = x;
	        x = y;
	        y = temp - (A/B)*y;
	    }
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
