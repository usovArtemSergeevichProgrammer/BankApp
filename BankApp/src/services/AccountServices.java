package services;

import java.util.Date;
import model.Account;
import model.Client;
import model.Employee;

public class AccountServices {

	public static boolean withdraw(Client c, double amount) {
		System.out.println(new Date() + " withdraw() -> Amouunt : " + amount + " -> Client ID: " + c.getUid());
		Account acc = c.getAcc();
		if (amount <= acc.getBalance()) {
			
			//0. get current balance 
			//1. current balance "-" amount
			//2. Store changes like current balance
			
			acc.setBalance(acc.getBalance() - amount);
			System.out.println("Success Withdraw");
			return true;
		} else {
			System.out.println("Balance < Withdraw Amount");
			return false;
		}
	}

	public static void deposit(Client c, double amount) {
		System.out.println(new Date() + " deposit() -> Amount : " + amount + " -> Client ID: " + c.getUid());
		Account acc = c.getAcc();
		acc.setBalance(acc.getBalance() + amount);
		System.out.println("Seccess Deposit");
	}
	
	public static void transfer(Client from,Client to,double amount){
		System.out.println(new Date() + " transfer() -> Amount : " + amount + " -> FROM Client ID: " + from.getUid() + " -> TO -> Client ID: " + to.getUid());	
		if(withdraw(from, amount)){
			deposit(to, amount);
			System.out.println("Seccess Transfer");
		}
	}
	
	public static void transfer(Account acc,Employee to[]){
		System.out.println(new Date() + " transfer() -> to Employee");	
		for (Employee employee : to) {
			
		}
	}
	
	

}
