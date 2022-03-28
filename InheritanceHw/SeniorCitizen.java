package InheritanceHw;

public class SeniorCitizen extends BankAccount{
public void applyFixedDeposit() {
		
		float interestRate=10.5f;
		
		System.out.println("Interest rate for Senior Citizen is "+interestRate);
		
		System.out.println("Interest rate for normal Citizen is "+super.interestRate);
		
	}
	
}
