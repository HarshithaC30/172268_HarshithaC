package proj1;

public class Account1 extends Customer1{

	int aid;
	double balance=0.0;
	public Account1( ) 
	{
		super(id, name, gender);
		this.balance=balance;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public int getAid() 
	{
		return aid;
	}
	public void credit(double amount)
	{
		balance = balance+amount;
		System.out.print("After credit:");
	}
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
			System.out.print("After withdraw:");
		}
		else
		{
			System.out.println("amount withdrawn exceeds the current balance!");
		}
	}
	@Override
	public String toString()
	{
		return String.format("%.2f", balance);
	}
	
}
