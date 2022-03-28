package classwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String ar=new String();
		System.out.println("Enter the string");
		ar=s.next();
		System.out.println("The entered string is "+ar);
		System.out.println("The length of the entered string is "+ar.length());

		//loop to check each character in a string
		int count=0;
		
		for(int i=0;i<ar.length();i++ ) {
			
			for(int j=i+1;j<ar.length();j++) {
				
				if(ar.charAt(i)==ar.charAt(j)) {
					count=count+1;
					
				}
			}
		}
		if((count>=1)&&(ar.charAt(0)==ar.charAt(ar.length()-1))) {
			System.out.println("The entered string is a palindrome");
		}
		else {
			System.out.println("The entered string is not a palindrome");
		}


	}
}







