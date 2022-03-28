package collections;
import java.util.ArrayList;

public class ExArraylist {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("A");
		ar.add("B");
		
		System.out.println(ar);
		
		ArrayList<String> ar1=new ArrayList<String>();
			ar1.add("a");
		ar1.add("b");
		
		ar.addAll(ar1);
		System.out.println(ar);
	}
	
	
}
