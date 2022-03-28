package polymorphism;

public class Change extends wedding{
@Override 
	void weddingDate() {
		System.out.println("28th feb");
	}
	
	public static void main(String[] args) {
		Change c = new Change();
		c.engDate();
		c.weddingDate();
	}
	
}
