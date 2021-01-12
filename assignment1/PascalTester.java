package labAssignment1;
import java.util.Scanner;

public class PascalTester {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		Pascal p = new Pascal(n);
		p.makeTraingle();
		s.close();
	}
	
}
