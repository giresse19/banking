
package ee.ttu.oop;

import java.util.Date;

import java.util.Date;

public class TimeDepositAccount extends Account{

	private double Balance;
	private Date maturityDate;
	
	public TimeDepositAccount(double Balance, Date maturityDate) {
		super(Balance);
		this.maturityDate = maturityDate;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return Balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}

	/**
	 * @return the maturityDate
	 */
	public Date getMaturityDate() {
		return maturityDate;
	}

	/**
	 * @param maturityDate the maturityDate to set
	 */
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	
	public void deposit(double amount)
	{
		Balance += amount; // balance = balance + amount
	}
	
	// allow withdrawing only after a maturity date
	
	public boolean withdraw (double amount) 
	{
		Date today = new Date ();
		if (today.after(maturityDate))
		{
			if (amount <= Balance)
			{
			Balance -= amount; // balance = balance - amount
			return true;
			}
			else
			{
				return false;
			}
				
		}
		
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// @Override
	public String toString() {
		return "TimeDepositAccount Balance:" + Balance + " maturityDate:" + maturityDate;
	}
	
	
	
}
