package assignment;


import java.util.ArrayList;
import java.util.Scanner;

class MaTest{
	static String remstr;



	public static String RemoveEvenVowels(String str1) {
		int len=str1.length();

		char[] arr = str1.toCharArray();
		StringBuffer sbf =new StringBuffer();

		for(int i=0;i<len;i++) {
			if(i%2!=0) {

				if((arr[i]!='a')&&(arr[i]!='e')&&(arr[i]!='i')&&(arr[i]!='o')&&(arr[i]!='u')){

					sbf.append(arr[i]);
				}
			}
			else{

				sbf.append(arr[i]);
			}

		}

		remstr=sbf.toString();
		return(remstr);

	}
}

public class No6RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();

		String sa=MaTest.RemoveEvenVowels(str);
		System.out.println(sa);

	}

}
