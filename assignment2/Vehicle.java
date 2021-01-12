package labAssignment2;

public class Vehicle {

	int noOfWheel;
	int noOFPAssenger;
	int model;
	String make;
	
	
	public Vehicle() {
	}


	public Vehicle(int noOfWheel, int noOFPAssenger, int model, String make) {
		super();
		this.noOfWheel = noOfWheel;
		this.noOFPAssenger = noOFPAssenger;
		this.model = model;
		this.make = make;
	}


	public void display() {
		System.out.println("No. of Wheel: "+noOfWheel);
		System.out.println("No. of Passengers: "+noOFPAssenger);
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		
	}

}
