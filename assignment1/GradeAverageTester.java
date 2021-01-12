package labAssignment1;
import java.util.Scanner;

public class GradeAverageTester {
	public static void main(String[] args) {
		int numStudents;
		Scanner s = new Scanner(System.in);
		numStudents = s.nextInt();
		GradeAverage g = new GradeAverage(numStudents);
		g.takeInput();
		g.calculateAverage();
		s.close();
	}
	
	
	
}
