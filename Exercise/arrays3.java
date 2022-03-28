package Exercise;

public class arrays3 {
public static void largestandsmallest(int[] numbers) {
	int max=numbers[0];
	int min=numbers[0];
	for(int i=1;i<numbers.length;i++) {
		
			if(numbers[i]>max) {
				max=numbers[i];
			}
			else if(numbers[i]<min) {
				min=numbers[i];
			}
			
			}
		System.out.println("smallest number is "+min);
		System.out.println("largest number is "+max);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		largestandsmallest(new int[] {25,35,64,86,95});
		
	}

}
