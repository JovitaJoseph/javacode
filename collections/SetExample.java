package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> days=new HashSet<String>();
		days.add("monday");
		days.add("tuesday");
		days.add("wednesday");
		days.add("thursday");
		days.add("friday");
		days.add("saturday");
		days.add("sunday");
		
		days.add("tuesday");//doesn't allow duplicates
		
		System.out.println("Days of the week: "+days);
		
		
		
		//LinkedHashset
		
		Set<String> days1=new LinkedHashSet<String>();
		days1.add("monday");
		days1.add("tuesday");
		days1.add("wednesday");
		days1.add("thursday");
		days1.add("friday");
		days1.add("saturday");
		days1.add("sunday");
		
		days.add("tuesday");//doesn't allow duplicates
		
		System.out.println("Days of the week: "+days1);
	}
	
	
}
