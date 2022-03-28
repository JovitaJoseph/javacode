package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li=new ArrayList<String>();
		li.add("usha");
		li.add("jovita");
		li.add("usha");
		li.add("saranya");
		li.add(null);
		li.add("sree");
		li.add("usha");
		li.add("sree");
		li.add(null);
		
		HashSet<String> hs=new HashSet<String>();
		hs.addAll(li);//adding all elements from list to hashset
		hs.add("kala");
		hs.add("jovita");//duplicates are ignored
		
		
		System.out.println("Hash code is "+hs.hashCode());
		
		
		System.out.println(li);//list output
		System.out.println(hs);//hashset output
		
	}

}
