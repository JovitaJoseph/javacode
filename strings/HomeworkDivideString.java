package strings;

public class HomeworkDivideString {

	public static void main(String[] args) {
		String str= "abcdefghijklmnopqr";
	
		
		int len=str.length();
		int p=3;
		
			
			for(int i=0;i<len;i=i+3) {
				if(p>len) {
					p=len;
				}
				
				System.out.println(str.substring(i,p));
				
				p=p+3;
				
			}
		
			
		}
		
		

	}

//}
