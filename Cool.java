import java.util.*;

// Made With Love By Ayoub <3

public class Cool {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] fib = new int[29];
		fib[0] = 0;
		fib[1] = 1;
		for(int i= 2;i <= 28;i++){
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		while(--t >= 0){
			String s = in.next();
			String cool = s.replaceAll("[^aoeui]","");
			int meter = cool.length();
			if(contains(fib, meter))
				System.out.println("Very cool name");
			else
				System.out.println("meh");
		}
		in.close();
	}
	
	public static boolean contains(int[] fib, int v){
		for (int i = 0; i < fib.length; i++) {
			if(fib[i] == v)
				return true;
		}
		return false;
	}
}