package assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class testabc1{
	static int num=0;

	public static int removeElements(String[] arr,int lengthElem) {
		int size1=arr.length;

		
		ArrayList<String> arrlis=new ArrayList<String>();

		for(int j=0;j<size1;j++) {

			if(arr[j].length()!=lengthElem) {
				arrlis.add(arr[j]);
				num=num+1;
			}


		}


		System.out.println(arrlis);		
		return(num);
	}
}

public class No11RemStringOfGivenLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int noOfArrElements;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the string array");
		int size=s.nextInt();

		String[] str=new String[size];

		System.out.println("Enter " +size+ " strings in the array");
		for(int i=0;i<size;i++) {
			str[i]=s.next();
		}

		System.out.println("Enter the length of the string to be removed");
		int lengthRem=s.nextInt();

		noOfArrElements=testabc1.removeElements(str,lengthRem);

		System.out.println("No of elements in the array are : "+noOfArrElements);

	}

}


