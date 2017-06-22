package com.prienc;

public class BankAtm {
	int id=0004;
	String bankName="SBI";
	String location="new delhi";
	double balance= 30000.00;
	// i have made a withdraw method it first check the balance in account
	// if balance is below 10000 it throws the exception
    // otherwise it shows message that the transaction is successful
	public void withdraw(double amt){
		double newbalance;
		newbalance= balance-amt;
		if(balance-amt<10000){
			// i have implemented the try and catch block to catch the exception
			try {
				throw new BankATMException();
			} catch (BankATMException e) {
				// TODO Auto-generated catch block
				System.out.println("You can not make this withdrawl your balance is below 10000");
			}
		}else{
			// if transaction is successful it shows the message  with new balance 
			System.out.println("You withdrawl is succesful your new balance is "+ newbalance);
		}
	}
	// Here i have created deposit method it will accept the amount to be deposit and shows newBalance
		public void deposit(double amt)	{
			double newBalance= balance+amt;
			System.out.println("Amount deposited new balance is "+ newBalance);
		}
	

	public static void main(String[] args) {
		//Here we created three objects of BankAtm class and called the method deposit and withdraw each time
		BankAtm be= new  BankAtm();
		be.deposit(1000.00);
		be.withdraw(1000000.00);
		BankAtm bb= new BankAtm();
		bb.deposit(20000.00);
		bb.withdraw(10000.00);
		BankAtm cc= new BankAtm();
		cc.deposit(87699.98);
		cc.withdraw(980943.00);
		
		// TODO Auto-generated method stub

	}

}
