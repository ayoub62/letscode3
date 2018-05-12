import java.util.Scanner;

// Made with love By Ayoub <3

public class NP {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			String s = in.nextLine();
			if(s.split(" ").length*2 == s.replaceAll("[^aieou]", "").length())
				System.out.println("NP");
			else
				System.out.println("P");
		}
		in.close();
	}
}