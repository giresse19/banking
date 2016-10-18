package ee.ttu.oop;

public abstract class Account {

	private double Balance;
	
	public Account(double Balance)
	{
		super();
		this.Balance = Balance;
	}
	
	public abstract boolean withdraw(double amount);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	// @Override
	public String toString() {
		return "Account [Balance=" + Balance + "]";
	}
	
	
	
	
}