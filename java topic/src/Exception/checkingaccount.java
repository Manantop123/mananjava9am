package Exception;

import java.util.Scanner;

public class checkingaccount {
	
	long accountno;
	double balance=0;
	
	
	
	public checkingaccount(long accountno) {
		this.accountno = accountno;
	}

	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	
	public void withdraw(double amount) throws insufficientbal
	{
		if(amount<=this.balance)
		{
			this.balance = this.balance-amount;
		}
		else
		{
			double needs = amount = this.balance;
			throw new insufficientbal(needs);
		}
	}
	public void checkingBalance()
	{
		System.out.println("your current balance is "+this.balance);
	}
	
	public static void main(String[] args) {
		System.out.println("**********welcome to SBI***********\n");
		checkingaccount c1 = new checkingaccount(123456789);
		c1.checkingBalance();
		Scanner sc = new Scanner(System.in);
		double amt;
		System.out.println("Enter amount to be deposit\n");
		amt = sc.nextDouble();
		c1.deposit(amt);
		c1.checkingBalance();
		System.out.println("Enter amount to be withdraw\n");
		amt = sc.nextDouble();
		try {
			c1.withdraw(amt);
		} catch (insufficientbal e) {
			// TODO Auto-generated catch block
			System.out.println("sorry u need to unsufficient bal"+e.getamount());
		}
		c1.checkingBalance();
	}
}
