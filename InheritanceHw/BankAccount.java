package InheritanceHw;

public class BankAccount {
int withdrawAmount=2000;
int depositAmount=10000;
float interestRate=9.5f;
int balance;

public void depositMoney() {
	System.out.println("Deposit Amount:"+depositAmount);
}

public void withdrawMoney() {
	System.out.println("Withdrawal Amount:"+withdrawAmount);
	balance=depositAmount-withdrawAmount;
	
}

//
//  public float getInterestRate() {
//  System.out.println("Base Interest rate :"+interestRate); 
//  return interestRate;
//  }
 
}
