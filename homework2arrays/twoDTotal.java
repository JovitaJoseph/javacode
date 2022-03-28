package homework2arrays;
import java.util.Scanner;
public class twoDTotal {
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the 2D array:");
		int rows=s.nextInt();
		int cols=s.nextInt();

		System.out.println("Enter the elements of array");
		int a[][]=new int[rows][cols];

		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				a[i][j]=s.nextInt();

			}
		}
		System.out.println("Array elements:");
		for(int i=0; i < rows; i++){
			for (int j=0; j < cols; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

		// To find total sum of row elements:			
		int total=0;
		for(int i =0; i < rows; i++) {
			int sum=0;
			for(int j=0; j < cols;j++) {
				sum=sum+a[i][j];
			}
			total=total+sum;
			System.out.println("Sum of row "+i+" = "+sum);
		}
		System.out.println("Total sum of rows:"+total);
		System.out.println();

		// To find total sum of column elements:			

		for(int i =0; i < cols; i++) {
			int sum1=0;
			for(int j=0; j < rows;j++) {
				sum1=sum1+a[j][i];
			}

			System.out.println("Sum of column "+i+" = "+sum1);
		}	

	}
}







