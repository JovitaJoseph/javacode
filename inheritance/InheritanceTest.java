package inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass d=new DerivedClass();
		d.features();
		d.ownfeatures();
		
		B obj=new B();
		System.out.println(B.a);
		System.out.println(obj.b);
		obj.show();
		obj.display();
		
		A obj2=new A();
		System.out.println(A.a);
		System.out.println(obj2.b);
		obj2.show();
		obj2.display();
		
		SubClass s=new SubClass();
		s.display();

	}

}
