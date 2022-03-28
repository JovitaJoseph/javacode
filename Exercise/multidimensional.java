package Exercise;

public class multidimensional {
	
	public static void main(String[] args) {
		
int marks[][]= {
		        {75,85,95,96,85},
		        {95,85,88,78,60},
		        {77,88,99,66,68}
};

System.out.println(marks[0].length);
System.out.println(marks.length);

for(int i=0;i<marks.length;i++) {
	for(int j=0;j<marks[i].length;j++) {
		System.out.print(marks[i][j]+" ");
	}
	System.out.println();
}
//System.out.println(marks[0][2]);
}


}

