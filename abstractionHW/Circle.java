package abstractionHW;

public class Circle extends Shape {
double r=5.0;
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		double area=3.14*r*r;
		System.out.println("Area of circle is :"+area);
		
		
		return area;
	}

}
