package testoopconcepts;

public class SavingAccount extends Bank {

	int rateInterest;
	
	SavingAccount()
	{
		super();
		rateInterest =4;
	}
	SavingAccount(String accountNumber, int balance, int rateInterest)
	{
		super(accountNumber, balance);
		this.rateInterest = rateInterest;
		
	}
	// overriding - runtime polymorphism
	void display()
	{
		super.display();
		System.out.println(" rate of Interest = "+rateInterest);
	}
	
	void deposit(int amount)
	{
		super.balance = super.balance +amount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount s1 = new SavingAccount();
		SavingAccount s2 = new SavingAccount("2000234",350,5);
		s2.display();
		s2.deposit(100);
		s2.display();
		
	}

}
