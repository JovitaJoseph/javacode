package collections;
import java.util.HashMap;
public class HashMapDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,Integer>hmap=new HashMap<String,Integer>();
		
		boolean isempty=hmap.isEmpty();
		System.out.println("Is hashmap empty "+isempty);
		
		hmap.put("Jovita",11);
		hmap.put("Usha",22);
		hmap.put("saranya",33);
	
		
		System.out.println(hmap);
		System.out.println(hmap.size());
		
		hmap.put(null, null);
		System.out.println(hmap.size());
		System.out.println(hmap);
		
		hmap.remove(null);
		System.out.println(hmap.size());
		System.out.println(hmap);
		
		hmap.put("Usha",44);
		hmap.put("sree",33);
		
		//System.out.println("Is hashmap empty "+hmap(isempty));
		
		System.out.println(hmap);
		System.out.println(hmap.size());
		
	}

}
