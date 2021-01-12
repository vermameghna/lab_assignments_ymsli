package labAssignment1;

public class Fibonacci {
	private double sum;
	
	public void calculateFibo() {
		int first = 1;
		int second = 1;
		sum = 2;
		System.out.print(first + " " + second);
		for(int i = 3;i<=20;i++) {
			int temp = second;
			second += first;
			System.out.print(second + " ");
			first = temp;
			sum+= second;
		}
		System.out.println();
		
	}
	
	public double calculateAverage() {
		System.out.print("The average is: ");
		return sum/20;
	}
}
