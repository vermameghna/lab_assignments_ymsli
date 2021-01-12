package labAssignment1;

import java.util.Scanner;

public class TimeTableTester {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		TimeTable t = new TimeTable(n);
		t.makeTable();
		t.showTable();
		s.close();
	}
	
}
