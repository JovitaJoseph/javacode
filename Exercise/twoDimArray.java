package Exercise;

public class twoDimArray {

	public static void main(String[] args) {

	    // 2d array
	    int[][] a = {{10,20},{30,40},{50,60}};

	    // display size of array
	    System.out.println("2D array size = "+ a.length);
	    System.out.println("First row size = "+ a[0].length);
	    System.out.println("Second row size = "+ a[1].length);
	    System.out.println("Third row size = "+ a[2].length);

	    // display array using length property
	    System.out.println("Array elements:");
	    for(int i=0; i < a.length; i++){
	      for (int j=0; j < a[i].length; j++) {
	        System.out.print(a[i][j]+"\t");
	      }
	      System.out.println();
	    }

	  }
}
