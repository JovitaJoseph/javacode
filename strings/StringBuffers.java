package strings;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello world");
		System.out.println(sb.append(" java"));
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.insert(5,"World"));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(5,9));
		
		
	}

}
