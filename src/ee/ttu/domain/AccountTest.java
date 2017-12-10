package ee.ttu.domain;

import java.util.Calendar;

import ee.ttu.oop.Bank;
import ee.ttu.oop.Customer;
import ee.ttu.oop.TimeDepositAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1 = new Customer("Jane","Smith");		
		
		 //  System.out.println(customer1); // max number of account set to 2 accounts
		
		 Calendar cal = Calendar.getInstance();
		
		// 180 day term, 6 months (maturity date)
		cal.add(Calendar.DAY_OF_YEAR, 180);
		
		// to test withdrawal method and how the balance re-adjust.. 
		// cal.add(Calendar.DAY_OF_YEAR, 0);
		
		  // System.out.println(cal.getTime());
	
		TimeDepositAccount acc1 = new TimeDepositAccount(500, cal.getTime());		

	customer1.addAccount(acc1);		

	//System.out.println(customer1);

	acc1.deposit(499);
	
	// System.out.println(customer1);
		
	acc1.withdraw(399); // maturityDate is 6 months
	
	 // System.out.println(customer1);
	// System.out.println("Withdrawal status: " + acc1.withdraw(399));
	// System.out.println(customer1);
		
		Bank bank = new Bank();
		
	bank.addCustomer(customer1);
		
	
	System.out.println("Bank " + bank);	  

	}
	
}
