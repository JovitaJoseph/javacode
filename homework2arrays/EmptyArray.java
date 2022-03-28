package homework2arrays;

import java.util.Scanner;
import java.util.Arrays;  

public class EmptyArray {

	 
			int sum=0;
			
			// Method 1 to find total
			
			public int total(int x[]) {
				
				for(int i=0;i<x.length;i++) 
				{
					sum= sum+x[i];
				}

				System.out.println("Sum of all elements:"+sum);	 
				return sum;
			}	


			// Method 2 to find duplicate elements
			
			public static int[] duplicate(int x[]) {
				int [] value = new int[x.length];
				
				for (int i=0;i<x.length;i++)
				{
					for (int j=i+1;j<x.length;j++)
					{
						if(x[i]==x[j]) {
							
							
							value[i] = x[j];
							
							System.out.println("Duplicate values are "+ value[i]+" ");
						}

					}
					
					}
				return value;				
			}


			public static void main(String[] args) {
				
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the length of the array");
				int len=s.nextInt();

				System.out.println("Enter the elements of array");
				int a[]=new int[len];

				for (int i=0;i<len;i++) {
					a[i]=s.nextInt();
				}

				EmptyArray e=new EmptyArray();
				e.total(a);

				//EmptyArray e1=new EmptyArray();				
				//duplicate(a);
				
				int [] b = duplicate(a);
				System.out.println(Arrays.toString(b));
			}
}
				
				


			



		

