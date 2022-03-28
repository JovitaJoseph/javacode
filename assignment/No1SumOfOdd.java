package assignment;

import java.util.Scanner;

class MainCode{
	static int sum=0;
	static int digits;
	public static int checkSum(int num) {
		while(num>0) {
			digits=num%10;
			if(digits%2!=0) {      //calculates sum only if the number is odd
				sum=sum+digits;
			}

			num=num/10;
		}
		System.out.println("The sum of odd digits are :"+sum);

		if(sum%2!=0) {
			System.out.println("The sum of odd digit is odd");
			return(1);
		}
		else {
			System.out.println("The sum of odd digit is even");
			return(-1);
		}


	}
}

public class No1SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a =s.nextInt();

		int d=MainCode.checkSum(a);
		System.out.println(d);

	}

}
