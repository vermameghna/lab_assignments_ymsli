package labAssignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarTester {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		
		while (true) {
			System.out.println("Choose which type of object you want to create: ");
			System.out.println("1.Create Vehicle Object");
			System.out.println("2.Create Car Object");
			System.out.println("3.Create convertible Car");
			System.out.println("4.Create Sports Car");
			System.out.println("5.Exit");
			
			choice = Integer.parseInt(s.readLine());

			if (choice == 1) {
				Vehicle vehicle = new Vehicle(4,4,23,"Maruti");
				vehicle.display();
			}else if (choice == 2) {
				Car car = new Car();
				car.display();
			}else if (choice == 3) {
				ConvertibleCar convertibleCar = new ConvertibleCar();
				convertibleCar.display();
			}else if (choice == 4) {
				SportsCar sportsCar = new SportsCar();
				sportsCar.display();
			}else {
				break;
			}

		}
	}
}
