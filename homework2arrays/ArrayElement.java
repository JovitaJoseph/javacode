package homework2arrays;
import java.util.Scanner;

public class ArrayElement {

	int sum=0;
	
	public int total(int x[]) {
		for(int i=0;i<x.length;i++) 
		{
			sum= sum+x[i];
		}

		System.out.println("Sum of all elements:"+sum);	 
		return sum;
	}	


	public void duplicate(int x[]) {
		
		for (int i=0;i<x.length;i++)
		{
			for (int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j]) {
					
					System.out.println("Duplicate values are:" +x[j]);
					
				}
				//else {
					//System.out.println("There are no duplicate values");
				//}
			}
			
			}
						
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len=s.nextInt();

		System.out.println("Enter the elements of array");
		int a[]=new int[len];

		for (int i=0;i<len;i++) {
			a[i]=s.nextInt();
		}

		ArrayElement e=new ArrayElement();
		e.total(a);

		ArrayElement e1=new ArrayElement();
		e1.duplicate(a);
		
		}
		


	}


