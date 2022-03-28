package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class treesetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> ts=new TreeSet<String>();
		//ts.add(null);doesn't allow null anywhere. we get NPE error
		ts.add("kiruba");
		ts.add("usha");
		ts.add("jovita");
		ts.add("usha");
		//ts.add(null);
		ts.add("saranya");
		ts.add("sree");
		ts.add("usha");
		ts.add("sree");
		
		
		System.out.println(ts);
		System.out.println(ts.size());

		ArrayList<String> list= new ArrayList<String>();		
		list.addAll(ts);
		System.out.println("___________________using simple for loop");
		for(int i=0;i<ts.size();i++) {
		System.out.println(list.get(i));

		}

		
        System.out.println("___________________enhanced for loop");
		
		for(String temp:ts) {
		System.out.println(temp);
		}
		
		
		System.out.println("___________________using iterator");

		Iterator<String> treemapIterator=ts.iterator();
		while(treemapIterator.hasNext()) {
		System.out.println(treemapIterator.next());
		}

		
		//Reverse alphabetical order
		System.out.println("___________________using simple for loop");
		for(int i=ts.size()-1;i>0;i--) {
		System.out.println(list.get(i));

		}


	}

}
