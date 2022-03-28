package assignment;

import java.util.Scanner;

class testA{

	static int amount;
	public static int calculateElectricityBill(int a1,int a2,int charge) {
		int mread=a2-a1;
		amount=charge*mread;

		return(amount);
	}
}

public class No9ElectBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prereading;
		String curreading;
		int perunitcharge;
		String pr;
		String cr;
		int no1;
		int no2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 digit prev month reading.Enter 5 characters followed by 5 digit numbers");
		prereading=s.nextLine();

		System.out.println("Enter 10 digit current month reading greater than prev month reading.Enter 5 characters followed by 5 digit numbers");
		curreading=s.nextLine();

		System.out.println("Enter per unit charge");
		perunitcharge=s.nextInt();


		pr=prereading.substring(5);
		no1=Integer.parseInt(pr);
		System.out.println(no1);

		cr=curreading.substring(5);
		no2=Integer.parseInt(cr);
		System.out.println(no2);




		int TotAmount=testA.calculateElectricityBill(no1, no2, perunitcharge);
		System.out.println("Total amount to pay is : "+TotAmount);

	}

}
