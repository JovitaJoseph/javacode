package assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;




class DemoTest1{
	static int i;
	public static int getElementPosition(String[] abc,String d) {
		int leng=abc.length;
	
		Arrays.sort(abc, Collections.reverseOrder());
		
     
		System.out.println("Reverse alphabetical order:");
		String[] revorder=abc;
		for(int j=0;j<leng;j++) {
			System.out.println(revorder[j]);
		}
		
		int indexPos=0;
		for(int i=0;i<leng;i++) {
			if(revorder[i].compareTo(d)==0) {
				System.out.println("The matched String is "+revorder[i]);
				indexPos=i+1;
				//System.out.println("Index is :"+indexPos);
				break;
			}
		}

		

		return indexPos;
	}
}


public class No8StringArrayReverseAlphabetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int p;
       
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the string");
		int len=s.nextInt();
		String[] str=new String[len];
		
		System.out.println("Enter the elements of the string");
		for(int i=0;i<len;i++) {
			str[i]=s.next();
			}
		
		
		System.out.println("Enter one element from the given string");
		String str1=s.next();
		
		 p=DemoTest1.getElementPosition(str, str1);
		 System.out.println("Index is :"+p);
	}

}

