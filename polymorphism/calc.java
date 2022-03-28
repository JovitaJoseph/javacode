package polymorphism;

public class calc {

	public void add(int a,int b) {
		int res=a+b;
		
	}
	public void add(int a, int b,int c) {
		int res=a+b+c;
	}
	
//	public void add(int c) {
//		
//	}
	
	public static void main(String[] args) {
		calc c=new calc();
		c.add(25,60);
	}
}
