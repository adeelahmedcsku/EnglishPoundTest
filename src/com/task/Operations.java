package com.task;

public interface Operations {

	public final int shillingsDefault=20;
	public final int penniesDefault=12;
	
	public AmountModal sum(AmountModal amount);
	
	public AmountModal sub(AmountModal amount);
	
	public AmountModal multiply(int multiplyBy);
	
	public AmountModal divide(int divideBy);
	
}
