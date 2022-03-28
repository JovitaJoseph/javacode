package classwork;

public class missingNo {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[] numbers= {1,2,3,5,6,7};
		int len=numbers.length;
		System.out.println(numbers.length);
		len++;
		int sumOfAll=(len*(len+1))/2;
		System.out.println("sum of all:"+sumOfAll);
		int sumOfArrayElements=0;
		
		if((len-1)==numbers[len-2]) {
			System.out.println("There are no missing numbers");
		}
		else {
		for(int i=0;i<len-1;i++) {
			
		sumOfArrayElements=sumOfArrayElements+numbers[i];
				
				
			}
		int missingNo=sumOfAll-sumOfArrayElements;
		System.out.println("Missing no is "+missingNo);
		}
		
	}
}

