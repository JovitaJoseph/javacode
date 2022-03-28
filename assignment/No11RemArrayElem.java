package assignment;

import java.util.Arrays;
import java.util.Scanner;

class testabc{
	static int num=0;
	
	public static int removeElements(String[] arr,int index1) {
		int size1=arr.length;
		
		String[] newarr=new String[size1-1];
		
		for(int j=0;j<size1-1;j++) {
			
			//if(j>=index1 && j<size1-2) {
			if(j>=index1) {
			newarr[j]=arr[j+1];

			}
			else {
				newarr[j]=arr[j];
				}
		
			num=num+1;
			
			
								
		}

		System.out.println(Arrays.toString(newarr));		
		return(num);
	}
}

public class No11RemArrayElem {

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
		
		System.out.println("Enter the index of the string to be removed");
		int index=s.nextInt();
		
        noOfArrElements=testabc.removeElements(str,index);
	
        System.out.println("No of elements in the array are : "+noOfArrElements);
	
	}

}
