package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class UserMainCode {
	public static ArrayList<Integer> SortMergedArrayList(ArrayList<Integer> ar,ArrayList<Integer> ar1) {
		ar.addAll(ar1);
		System.out.println("Merged 2 arraylists are :"+ ar);
		Collections.sort(ar);//to sort the elements in arraylist in ascending order
		System.out.println("Sorted list :"+ar);
		ArrayList<Integer> ans= new ArrayList<Integer>();
		ans.add(ar.get(2));
		ans.add(ar.get(6));
		ans.add(ar.get(8));
		return ans;

	}
}

public class ArrayListCW {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ArrayList<Integer> ar2=new ArrayList<Integer>();

		System.out.println("Enter the length of the arraylist1");
		int len=s.nextInt();


		System.out.println("Enter "+len+" elements in arraylist1 :");


		for(int i=0;i<len;i++) {
			ar.add(s.nextInt());
		}
		System.out.println(ar);

		System.out.println("Enter the length of the arraylist2");
		int len1=s.nextInt();

		System.out.println("Enter "+len1+" elements in arraylist2 :");
		for(int i=0;i<len1;i++) {
			ar1.add(s.nextInt());
		}
		System.out.println(ar1);

		ar2=UserMainCode.SortMergedArrayList(ar, ar1);
		System.out.println(ar2); 

	}


}
