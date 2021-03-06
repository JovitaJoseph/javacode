package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(5, "five");
		hmap.put(10, "ten");
		hmap.put(15, "fifteen");
		hmap.put(20, "twenty");
		hmap.put(25, "twenty five");
		hmap.put(30, "thirty");
		hmap.put(35, "thirty five");
		hmap.put(40, null);//accepts null
		
		
		System.out.println(hmap);
		
		
		//loop the keys using for each loop by keyset method
		
		
System.out.println("___________________enhanced for loop");


		for(Integer num:hmap.keySet()) {
			System.out.println("Number: "+num);
		}
		
		//loop the keys using for each loop by values method
		for(String words:hmap.values()) {
			System.out.println("Words: "+words);
		}
		
		
		//loop the keys using for each loop to iterate entryset
		for(Entry<Integer,String> entry:hmap.entrySet()) {
			//System.out.println("Entries of hashmap are: "+entry);
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
