package day3;

public class Bank {
	
	private int balance ;
	String accountNumber;
	public String name;

	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public int getBalance()
	{
		return balance ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1 = new Bank();
		b1.balance = 100;
		b1.name = "Test User";
	}
}
