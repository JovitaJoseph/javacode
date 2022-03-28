package exceptionHandling;

public class finalllly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
	//	int b=30;
		int b=0;
		
		try {
			//int sum=a+b;
			int q=a/b;
			//System.out.println("Sum "+sum);
			System.out.println("Sum "+q);
			
		}
//catch(Exception e) {
		//catch(ArithmeticException e) {
		catch(NullPointerException e) {
	System.out.println(e);
}
		finally {
			//System.out.println("finally block must be executed");
			System.out.println("denominator cannot be zero");
		}
		System.out.println("hello world");
	}

}
