package classwork;

public class ThreeMethods {

	public int sum(int a,int b) {
		int sum=a+b;
		System.out.println("Sum of 2 numbers:"+sum);
		return sum;
	}
	
	public double average(int a,int b,int c) {
		double average=(a+b+c)/3.0;
		System.out.println("Average of 3 numbers:"+average);
		return average;
	}
	
	public void divisible() {
		for (int i=1;i<=50;i++) {
			if (i%3==0) {
				System.out.println("Number divisible by 3 is "+i);
			}
		
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreeMethods s=new ThreeMethods();
s.sum(67,89);
s.average(88,65,70);
s.divisible();
	}

}
