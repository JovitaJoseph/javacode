package linkedListEX;
import java.util.LinkedList;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("a");
		linkedlist.add("h");
		linkedlist.add("d");
		linkedlist.add("h");//duplicates are allowed
		linkedlist.add(null);// null is accepted
		System.out.println(linkedlist);

	}

}
