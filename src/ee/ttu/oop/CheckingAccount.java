package ee.ttu.oop;

public class CheckingAccount extends Account{

	private final double overDraftLimit;
	
	public CheckingAccount(double Balance, double overDraftLimit)
	{
		super(Balance);
		this.overDraftLimit = overDraftLimit;
		
	}
	
	public CheckingAccount(double Balance)
	{
		super(Balance);
		this.overDraftLimit = 0;
		
	}
	
	/*
	// @Override
	public boolean withdraw(double amount)
	{		
		
		return false;
	}
    */

}
