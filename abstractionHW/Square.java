package abstractionHW;

public class Square extends Shape {

double breadth=3.0;
double length=4.0*breadth;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double area=length*breadth;
		System.out.println("Area of square is :"+area);
		
		
		return area;
	}



}
