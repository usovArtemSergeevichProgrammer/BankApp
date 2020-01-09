package test;

import model.Account;
import model.Client;
import services.AccountServices;
import services.ClientServices;
import services.exceptions.ClientOperationException;

public class BankTester {

	public static void main(String[] args) {
		
		
		Client cl1 = new Client(100,"John",null,new Account(52000,"ALFA","USD"));
		Client cl2 = new Client(200,"Lisa","Kent",new Account(15000,"ALFA","USD"));
		
//		ClientServices.info(cl1);
//		ClientServices.info(cl2);
//		
//		AccountServices.deposit(cl1, 12000);
//		ClientServices.info(cl1);
//		AccountServices.withdraw(cl1, 65000);
//		ClientServices.info(cl1);
//		
//		AccountServices.withdraw(cl2, 14000);
//		ClientServices.info(cl2);
//		
//		AccountServices.transfer(cl2, cl1, 5000);
//		ClientServices.info(cl1);
//		ClientServices.info(cl2);
		
		try {
			ClientServices.info(null);//go to 38 line
			ClientServices.info(cl1);
		} catch (ClientOperationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e.getMessage() + " .STATUS: " + e.getStatus() + (e.getCause()==null ? "":" NESTED EXCEPTION is " + e.getCause()));
		}
		
		try {
			ClientServices.info(cl1);
		} catch (ClientOperationException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage() + " .STATUS: " + e.getStatus() + (e.getCause()==null ? "":" NESTED EXCEPTION is " + e.getCause()));
		}
		
		System.out.println("END");

	}

}
