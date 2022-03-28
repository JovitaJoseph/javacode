package InheritanceHw;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NRIAccount n=new NRIAccount();
		n.applyFixedDeposit();
		n.depositMoney();
		n.withdrawMoney();
	
				
		SeniorCitizen s=new SeniorCitizen();
		s.applyFixedDeposit();
		s.depositMoney();
		s.withdrawMoney();
		
		
		//System.out.println(n.interestRate);
		//System.out.println(s.interestRate);
		
//		s.getInterestRate();
//		n.getInterestRate();
			
		
		
		
		
	}
	

}
