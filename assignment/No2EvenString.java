package assignment;

import java.util.Scanner;

class main{
	static int len;
	static String str2;

	public static String getMiddleChars(String str1) {
		len=(str1.length())/2;
		str2=str1.substring(len-1,len+1);
		System.out.println("The middle characters in the given string are :"+str2);
		return(str2);

	}
}

public class No2EvenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String midChar;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an even length String");
		String str=s.next();
		while(str.length()%2!=0) {
			System.out.println("The entered string is odd. Reenter even string");
			String str6=s.next();
			str=str6;
		}

		midChar=main.getMiddleChars(str);
		System.out.println(midChar);

	}

}
