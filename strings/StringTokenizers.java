package strings;
import java.util.StringTokenizer;

public class StringTokenizers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=":";
		String b="welcome : to : java";
		StringTokenizer s=new StringTokenizer(b,a);
while(s.hasMoreTokens()) {
	System.out.println(s.nextToken());
	}

	}

}
