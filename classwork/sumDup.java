package classwork;
import java.util.Scanner;

public class sumDup {

	public static void main(String[] args) {
		int sum;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len=s.nextInt();

		
		int arr[]=new int[len];
		System.out.println("Enter the elements of array");

		for (int i=0;i<len;i++) {
			arr[i]=s.nextInt();
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate values are:"+arr[j]);
				}
			}
			//sum=sum+arr[i];
		}
		//System.out.println("sum is"+sum);
		
	}
	
}
