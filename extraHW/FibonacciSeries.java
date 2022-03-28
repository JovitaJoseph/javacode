package extraHW;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num1=0,num2=1,num3;
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the count for fibonacci series :");
		int count=s.nextInt();
		
		System.out.println("Fibonacci series for "+count +" numbers are :");
		System.out.print(num1);
		System.out.print(" "+num2);
		
		num3=num1+num2;
		
		for(int i=2;i<count;i++) {
		System.out.print(" "+num3);
		num1=num2;
		num2=num3;
		num3=num1+num2;
		
		
		}
		
	
	}

}
