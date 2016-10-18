package ee.ttu.oop;

import java.util.Arrays;

public class Bank {

	private Customer [] customers;
	private int numberOfCustomers;
	
	
	/**
	 * @return the numberOfCustomers
	 */
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	/**
	 * @param numberOfCustomers the numberOfCustomers to set
	 */
	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}
	
	
	public Bank() {
		super();
		this.customers = new Customer [10];
		numberOfCustomers = 0;
	}
	
	public void addCustomer(Customer customer)
	{
		int i = numberOfCustomers++;
		customers [i] = customer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// @Override
	public String toString() {
		return "Customers:" + Arrays.toString(customers) + " numberOfCustomers:" + numberOfCustomers;
	}
	
	
	
	
}
