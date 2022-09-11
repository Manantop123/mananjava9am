package Exceptiondemo;

import java.util.Scanner;

public class checkingbal {
	long accountno;
	double balance=0;
	
	public checkingbal(long accountno) {
		this.accountno = accountno;
	}
	
	public void deposit(double amount)
	{
		this.balance = this.balance+amount;
	}
	
	public void withdraw(double amount) throws insufficientbal
	{
		if(amount<=this.balance)
		{
			this.balance = this.balance - amount;
		}
		else
		{
			double need = amount - this.balance;
			throw new insufficientbal(need);
		}
	}
	
	public void checkingbalance()
	{
		System.out.println("your current balance is"+this.balance);
	}

	public static void main(String[] args) {
		checkingbal cbal = new checkingbal(12345678);
		cbal.checkingbalance();
		Scanner sc = new Scanner(System.in);
		double amt;
		System.out.println("\nenter deposit amount");
		amt=sc.nextDouble();
		cbal.deposit(amt);
		cbal.checkingbalance();
		System.out.println("\nenter withdraw amount");
		amt=sc.nextDouble();
		try {
			cbal.withdraw(amt);
		} catch (insufficientbal e) {
			// TODO Auto-generated catch block
				System.out.println("sorry u need unsufficient bal"+ e.getamount());
		}
		cbal.checkingbalance();
	}
}
