package inheritance;

public class B extends A {
	static int a=110;
	int b=130;
	
	static void show() {
		System.out.println("Im static method");
	}
	
	// void show() {
		//System.out.println(super.a);
		//System.out.println(super.b);
	//}
	
	
	void display() {
		System.out.println("Im non-static method");
	}
	
	//void display() {
		//System.out.println(a);
		//System.out.println(b);
	//}
	
}

