package labAssignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentTester {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		
		Student student = null;
		
		System.out.println("Choose what you want to do:");
		System.out.println("1.Create the Object");
		System.out.println("2.Display the Object");
		System.out.println("3.Exit ");
		int choice = Integer.parseInt(s.readLine());
		if(choice == 1) {
			System.out.println("Choose what type of input you want to enter:");
			System.out.println("1.Create Object using Name,Id,Grades");
			System.out.println("2.Create Object using Name,Id");
			System.out.println("3.Create Object using Id");
			choice = Integer.parseInt(s.readLine());
			if(choice == 1) {
				
				System.out.println("Enter Name,Id,Grade: ");
				String studentName = s.readLine();
				String studentId = s.readLine();
				int studentGrade = Integer.parseInt(s.readLine());
				student = new Student(studentName,studentId,studentGrade);
				
			}else if(choice == 2) {
				
				System.out.println("Enter Name and Id: ");
				String studentName = s.readLine();
				String studentId = s.readLine();
				student = new Student(studentName,studentId);

			}else if(choice == 3) {
				
				System.out.println("Enter Id: ");
				String studentId = s.readLine();
				student = new Student(studentId);
				
			}else {
				System.out.println("You don't want to create any object! ");
				return;
			}
			
			System.out.println("Do you want to enter Year ?? ");
			System.out.println("1.Yes");
			System.out.println("2.No");
			choice = Integer.parseInt(s.readLine());
			if(choice == 1) {
				System.out.println("Enter year: ");
				int year = Integer.parseInt(s.readLine());
				student.display(year);
			}else {
				student.display();
			}
			
		}else if(choice == 2) {
			if(student == null) {
				System.out.println("You have not created student yet! Bye");
				return;
			}
		}else {
			System.out.println("Bye!");
		}
	}

}
