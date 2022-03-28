package homework;

import java.util.Scanner;

public class Student {

	String name1;
	int age;
	String city;
	int mark1,mark2,mark3,mark4,mark5;
	
	

	// Method to calculate total
	
	public int calculateTotal(int mark1, int mark2, int mark3, int mark4, int mark5) {
		int total = mark1 + mark2 + mark3 + mark4 + mark5;
		return total;
	}

	
	// Method to calculate average
	
	public float getAverage(int total,int noOfSubjects) {
		float avg = total / (float)noOfSubjects;
		return avg;
	}

	//Main method
	public static void main(String[]args) {
		
		int noOfStudents;
		
		//To get input from keyboard
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of Students:");
		noOfStudents=s.nextInt();

		// Loop to get student details
		for (int i=1;i<=noOfStudents;i++) {
			
			System.out.println("Enter student number "+i+ " name,age,city");
			String name1=s.next();
			int age=s.nextInt();
			String city=s.next();

			System.out.println("enter the marks");
			int mark1=s.nextInt();
			int mark2=s.nextInt();
			int mark3=s.nextInt();
			int mark4=s.nextInt();
			int mark5=s.nextInt();

			System.out.println("Name1: " + name1);
			System.out.println("Age: " + age);
			System.out.println("City: " + city);
			System.out.println("Mark1: " + mark1);
			System.out.println("Mark2: " + mark2);
			System.out.println("Mark3: " + mark3);
			System.out.println("Mark4: " + mark4);
			System.out.println("Mark5: " + mark5);

			Student s1=new Student();
		
			int totalMarks= s1.calculateTotal(mark1,mark2,mark3,mark4,mark5);
			System.out.println("Total marks of student number "+i +"="+totalMarks);
			
			float average=s1.getAverage(totalMarks,5);
			System.out.println("Average marks of student number "+i +"="+average);

			if (average>=90){
				System.out.println("Grade A");
			}
			else if (average>=75){
				System.out.println("Grade B");
			}
			else if (average>=60){
				System.out.println("Grade C");
			}
			else if (average>=40){
				System.out.println("Grade D");
			}
			else {
				System.out.println("Fail");
			}
		}
	}



}
