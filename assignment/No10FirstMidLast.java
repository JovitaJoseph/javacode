package assignment;

import java.util.Scanner;

class Testab{

	static int larg;
	static int length1;
	static int leng1;

	public static int checkLargestAmongCorner(int a[]) {
		length1=a.length;
		leng1=length1/2;

		int first=a[0];
		int middle=a[leng1];
		int last=a[length1-1];
		if((first>=middle) && (first>=last)){
			larg=first;
		}
		else if ((middle >= first) && (middle >= last)) {
			larg=middle;
		}

		else {
			larg=last;
		}



		return(larg);
	}
}

public class No10FirstMidLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largestNo;

		Scanner s =new Scanner(System.in);
		System.out.println("Enter an odd length for the array");
		int len=s.nextInt();


		while(len%2==0) {
			System.out.println("The entered length is even.Reenter odd number");
			len=s.nextInt();
		}
		int[] abc = new int[len];


		System.out.println("Enter the integer elements of the array");
		for(int i=0;i<len;i++) {
			abc[i]=s.nextInt();
		}


		largestNo=Testab.checkLargestAmongCorner(abc);
		System.out.println("The largest number among first,mid and last element is "+largestNo);

	}

}
