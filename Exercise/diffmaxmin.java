package Exercise;

public class diffmaxmin {

	public static void main(String[] args) {
		int array[]= {3,5,6,9,8,7};
		int max=array[0];
		int min=array[0];
		int diff;
		for(int i=1;i<array.length;i++) {
			
				if(array[i]>max) {
					max=array[i];
				}
				else if(array[i]<min) {
					min=array[i];
				}
				
				}
			System.out.println("Min value is1 "+min);
			System.out.println("Max value is1 "+max);
			
		
		
		diff=max-min;
		System.out.println("Difference is "+diff);
		
		
		}
}
		

	


