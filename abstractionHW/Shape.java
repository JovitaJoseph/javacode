package abstractionHW;

public abstract class Shape {
	String color;
	public abstract double calculateArea();
	public void setColor(String color) {
		this.color=color;
		System.out.println("Color is :"+color);
	}

}
