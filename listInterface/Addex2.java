package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Addex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li=new ArrayList<String>();
		li.add("usha");
		li.add("jovita");
		li.add("usha");
		li.add("saranya");
		li.add("sree");
		li.add("usha");
		li.add("sree");
		
		System.out.println(li);
		
		Collections.reverse(li);
		System.out.println(li);
		
		System.out.println(li.indexOf("usha"));// prints only first location where usha is stored
		
		System.out.println(li.lastIndexOf("usha"));// prints the last index location
		
		System.out.println(li.lastIndexOf("asha"));//prints -1 if the element is not present in the list
		
		System.out.println(li.get(2));//prints element from index 2
		
		System.out.println(li.set(4,"jovita"));//replaces the element at index 4 with the specified element and returns the original element at index 4
		
		System.out.println(li.subList(1,6));// prints elements from position 1 to 5
		
		
		System.out.println(li.contains("jovita"));
		
		
		
	}

}
