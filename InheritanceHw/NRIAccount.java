package InheritanceHw;

public class NRIAccount extends BankAccount {

public void applyFixedDeposit() {
	
		float interestRate =6.5f;
		
		System.out.println("Interest rate for NRI Account is "+interestRate);
		System.out.println("Interest rate for normal account is "+super.interestRate);
	}
	
}
