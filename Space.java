import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Made with love By Ayoub <3

public class Space {

	public static void main(String[] args) throws Exception {
		FastScanner in = new FastScanner();
		int t = in.nextInt();
		while(--t >= 0) {
			int n = in.nextInt();
			int c = in.nextInt();
			double ans = Double.MIN_VALUE;
			Point[] points = new Point[n];
			for (int i = 0; i < points.length; i++) {
				points[i] = new Point();
			}
			for (int i = 0; i < points.length; i++) {
				points[i].x = in.nextLong();
			}
			for (int i = 0; i < points.length; i++) {
				points[i].y = in.nextLong();
			}
			for (int i = 0; i < points.length; i++) {
				points[i].z = in.nextLong();
			}
			Point center = points[c-1];
			for (int i = 0; i < points.length; i++) {
				if(i != c-1) {
					ans = Math.max(ans, center.distance(points[i]));
				}
			}
			String out = String.format("%.3f", ans).replace(',', '.');
			System.out.println(out);
		}
	}
	
	static class Point{
		long x;
		long y;
		long z;
		
		public double distance(Point p) {
			double x = Math.abs(this.x - p.x);
			double y = Math.abs(this.y - p.y);
			double z = Math.abs(this.z - p.z);
			return Math.sqrt(x*x + y*y + z*z);
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