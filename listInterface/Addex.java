package listInterface;
import java.util.*;
public class Addex {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(42);
		list.add(65);
		list.add(74);
		list.add(85);
		
		list.add(4,78); // adding the element in fourth position
		list.add(2,90);// pushes 90 to index 2
		
		
		List<String> li=new ArrayList<String>();
		li.add("usha");
		li.add("jovita");
		li.add("usha");
		li.add("kala");
		li.add("mala");
		
		list.addAll(3,li);
		list.remove(3);
		li.remove("usha");
		
		
		
		//for loop
		System.out.println("___________________using simple for loop");
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		
		System.out.println("___________________enhanced for loop");
		
		for(String temp:li) {
			System.out.println(temp);
		}
		
		
		//Iterator 
		System.out.println("___________________using iterator");
		
		Iterator<String> listIterator=li.iterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		
		System.out.println(list);
		
	}
	
}
