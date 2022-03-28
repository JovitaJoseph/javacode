package strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="HelloWorld";
		System.out.println(str.charAt(1));
		
		System.out.println(str.equalsIgnoreCase("Helloworld"));
		System.out.println(str.indexOf('W'));
		
		System.out.println(str.length());
		System.out.println(str.replace('o','O'));
		System.out.println(str.substring(4,7));
		System.out.println(str.contains("orld"));
		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith("d"));
	}

}
