package strings;

import java.util.Arrays;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="malayalam";
		int count;
		char str[]=s.toCharArray();
		for(int i=0; i<str.length;i++) {
			count=1;
			for(int j=i+1;j<str.length;j++) {
				//if(str[i]==str[j] && str[i]!=' ') {
				if(str[i]==str[j]&&str[i]!=' ') {
					count++;
					System.out.println(i+"="+j+":before :"+Arrays.toString(str));
					//set string[j] to 0 to avoid printing visited characters.
					str[j]='*';
					System.out.println("after :"+Arrays.toString(str));
				}else {
					System.out.println(i+"="+j+" -->"+str[i]+"=="+str[j]);
				}
			}
			System.out.println("final :"+Arrays.toString(str));

			//A character is considered as duplicate if the count is greater than 1
			if(count>1 && str[i]!='*') {
				System.out.println("---------------------"+str[i]);
			}
		}



	}
}



