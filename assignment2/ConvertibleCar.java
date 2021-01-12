package labAssignment2;

public class ConvertibleCar extends Car{
	boolean isHoodOpen;
	
	public void display() {
		super.display();
		if(isHoodOpen) {
			System.out.println("Hood is Open");
		}else {
			System.out.println("Hood is Closed");
		}
	}
}
