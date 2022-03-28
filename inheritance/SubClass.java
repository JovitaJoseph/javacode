package inheritance;

public class SubClass extends SuperClass {
	int x=70;

	void display() {
		System.out.println(super.x);
		System.out.println("The value of x is "+x);
	}
	
	
}
