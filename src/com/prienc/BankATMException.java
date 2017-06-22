package com.prienc;
//Here i have created a BankATMException it will extend from its parent class exception
public class BankATMException extends Exception {
	
	
 public BankATMException(){
	 // it will call the super constructor of parent class and display the message 
	 super("You can not withdraw the amount || your account balance is below 10000")
		 ;
 
 } 
 }

 

