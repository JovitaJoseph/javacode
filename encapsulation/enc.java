package encapsulation;

public class enc {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s = new sample();
		
		s.setBalance(2000);
		System.out.println("Balance is "+s.getBalance());
		
		s.setName("Rama");
		System.out.println("Name is "+s.getName());
		
		s.setAge(20);
		System.out.println("Age is "+s.getAge());

	}

}
