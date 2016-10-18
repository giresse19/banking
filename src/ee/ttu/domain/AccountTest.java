package ee.ttu.domain;

import java.util.Calendar;

import ee.ttu.oop.Bank;
import ee.ttu.oop.Customer;
import ee.ttu.oop.TimeDepositAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1 = new Customer("Jane","Smith");
		Customer customer2 = new Customer("Paul","Smith");
		
		System.out.println(customer1);
		
		Calendar cal = Calendar.getInstance();
		//180 day term, 6 months
		cal.add(Calendar.DAY_OF_YEAR, 180);
		
		System.out.println(cal.getTime());
		
		TimeDepositAccount acc1 = new TimeDepositAccount(500, cal.getTime());
		TimeDepositAccount acc2 = new TimeDepositAccount(500, cal.getTime());

		customer1.addAccount(acc1);
		customer1.addAccount(acc2);

		System.out.println(customer1);

		acc1.deposit(499);
		
		System.out.println(customer1);
		
		acc1.withdraw(399); // maturityDate is 6 months
		
		System.out.println(customer1);

		System.out.println("acc1.withdraw() " + acc1.withdraw(399));
		System.out.println(customer1);
		
		Bank bank = new Bank();
		
		bank.addCustomer(customer1);
		bank.addCustomer(customer2);
		
		System.out.println("Bank " + bank);
		showReport(); // static 

	}

	public static void showReport()
	{
		System.out.println("The banking  report is");
	}
	
}
