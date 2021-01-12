package labAssignment1;
import java.util.Scanner;

public class GradeAverage {
	private int numStudent;
	private int grades[];
	private double sum = 0;
	
	
	
	public GradeAverage() {
	}

	public GradeAverage(int numStudent) {
		this.numStudent = numStudent;
		grades = new int[numStudent];
	}
	
	public void takeInput() {
		int i = 0;
		double sum = 0;
		Scanner s = new Scanner(System.in);
		while(i < this.numStudent) {
		System.out.println("Enter the grade of student " + (i+1) + ": ");
		int g = s.nextInt();
		while(g < 0 || g > 100) {
			System.out.println("Inavlid grade,try agian...");
			System.out.println("Enter the grade of student " + (i+1));
			g = s.nextInt();
		}
		grades[i] = g;
		sum+=grades[i];
		i++;
		}
		s.close();
		this.sum = sum;
	}
	
	public void calculateAverage() {
		System.out.println("The average is: " + sum/numStudent);
	}
	
	
	
	
	
	
}
