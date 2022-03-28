package assignment;

import java.util.Scanner;

 class Demo {
	
	static int bigno;
	static int smallno;
	static int diff;
	
	public static Integer getBigDiff(int arr1[]) {
		int size1=arr1.length;
		bigno=arr1[0];
		smallno=arr1[0];
		if(size1==1) {
			return(arr1[0]);
		}
		else if(size1>1) {
			for(int i=1;i<size1;i++) {
				if(arr1[i]>bigno) {
					bigno=arr1[i];
				}
				else if(arr1[i]<smallno) {
					smallno=arr1[i];
				}

			}
		}
			System.out.println("Biggest no is : " +bigno);
			System.out.println("Smallest no is : " +smallno);
			diff=bigno-smallno;
			return(diff);
		}

 }


	public class No7BigDiff {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			System.out.println("Enter the array size");
			int size=s.nextInt();

			System.out.println("Enter the integer elements of an array");
			int[] arr=new int[size];

			for(int i=0;i<size;i++) {
				arr[i]=s.nextInt();		
			}
			
			int diff1=Demo.getBigDiff(arr);
			System.out.println("The difference is : "+diff1);

		}
	}

	


