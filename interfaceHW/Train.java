package interfaceHW;

public class Train implements IVehicle,IPublicTransport {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("The train is in driving mode");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("The train is turning left");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("The train is in brake mode");
	}

	@Override
	public void getNoOfPeople() {
		// TODO Auto-generated method stub
		System.out.println("No of people using public transport is "+n);
				
	}

	
	public static void main(String[] args) {
		
		Train t=new Train();		
		t.drive();
		t.turnLeft();
		t.brake();
		t.getNoOfPeople();
		
	
		Car c=new Car();
		c.drive();
		c.turnLeft();
		c.brake();
		
		
	}
}
