package assignment;

import java.util.Scanner;

class method{

	static int rev=0;
	static int digit;

	public static int reverseNumber(int num1) {


		while(num1!=0) {
			digit=num1%10;   //we get last digit
			rev=(rev*10)+digit; //to move forward to 1 tens place each time
			num1=num1/10;  
		}
		return(rev);
	}

}
public class No4ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the positive number");
		int num=s.nextInt();

		int rev=method.reverseNumber(num);

		System.out.println("The reverse of the number is:"+rev);
	}

}
