/**
 * 
 */
package com.task;

/**
 * @author Mr.Adeel Khatri
 *
 */
public class brain {

	
	public static AmountModal processInBrain(int pennies) {
		
		int temp=0;
		int poundToSub = brain.getQuotient(pennies, 20*12);
		temp = brain.getRemainder(pennies, 20*12);
		int shillingToSub = brain.getQuotient(temp, 12);
		temp = brain.getRemainder(temp, 12);
		int penniestoSub = temp;
		
		System.out.println("Total Pounds = "+ poundToSub);
		System.out.println("Total Shillings = "+ shillingToSub);
		System.out.println("Total Pennies = "+ penniestoSub);
			
		return new AmountModal(poundToSub,shillingToSub,penniestoSub,"");
		
	}
	
	
	public static int getQuotient(int dividend, int divisor)
	{
		return dividend/divisor;
	}
	
	public static int getRemainder(int dividend, int divisor)
	{
		return dividend%divisor;
	}
	
	public static int getBrain(int pounds,int shillings,int pennies)
	{
		return (pounds * 20 * 12) + (shillings*12) + (pennies);
	}
	
	
}
