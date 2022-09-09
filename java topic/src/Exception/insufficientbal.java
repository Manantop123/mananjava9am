package Exception;

import topic.exception;

public class insufficientbal extends Exception {
	double amount;

	public insufficientbal(double amount) {
		this.amount = amount;
	}
	
	public double getamount()
	{
		return this.amount;
	}
	
}
