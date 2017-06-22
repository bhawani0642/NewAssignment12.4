package com.prienc;
//Here i have created a TestBank class 
public class TestBank {
	// Here i have created a test method accept balance as parameter it will throws an exceptionBankATMException it will check the account balance before withdraw
	//if balance in account is less than 10000 it will throws an exception
	public void test(double balance) throws BankATMException{
		if(balance<10000.00){
			throw new BankATMException();
			
		}
		else{
			System.out.println("You do not have sufficient fund for this transcation");
		}
	}
	
}
