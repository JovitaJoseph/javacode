package assignment;

import java.util.Scanner;

class UserMainCode{

	public static int checkCharacters(String str) {
		int l=str.length();
		if(str.charAt(0) == str.charAt(l-1)) {
			return(1);
		}
		else {
			return(-1);
		}
	}
}	
public class No3StringProg {		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=s1.nextLine();

		int len=s.length();
		System.out.println("The length of the string is "+len);

		//if statement to compare first and last element in a string

		if(s.charAt(0) == s.charAt(len-1)) {
			System.out.println("String is valid");
		}
		else {
			System.out.println("String is invalid");
		}

		int a=UserMainCode.checkCharacters(s);//calling static method inside another static method using classname
		System.out.println(a);
	}

}


