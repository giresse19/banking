package ee.ttu.oop;

import java.util.Arrays;

public class Customer {

	private String firstName;
	private String lastName;	                          
	private Account [] Accounts;  //  accounts array
	private int numberOfAccounts;
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		// initialize accounts array
		Accounts = new Account[10];
		numberOfAccounts = 0;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public void addAccount(TimeDepositAccount acc)
	{
		int i = numberOfAccounts ++;
		Accounts [i] = acc;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// @Override
	public String toString() {
		return "Customer firstName:" + firstName + " lastName:" + lastName + " Accounts:" + Arrays.toString(Accounts)
				+ " numberOfAccounts:" + numberOfAccounts;
	}
	
	
	
	
	
	
}
