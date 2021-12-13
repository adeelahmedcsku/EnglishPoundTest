/**
 * 
 */
package com.task;

/**
 * @author Mr.Adeel Khatri
 *
 */
public class AmountModal implements Operations{

	public int pounds ;
	public int shillings;
	public int pennies;
	
	public String reminder;
	
	/**
	 * @return the reminder
	 */
	public String getReminder() {
		return reminder;
	}
	/**
	 * @param reminder the reminder to set
	 */
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}
	/**
	 * @return the pounds
	 */
	public int getPounds() {
		return pounds;
	}
	/**
	 * @param pounds the pounds to set
	 */
	public void setPounds(int pounds) {
		this.pounds = pounds;
	}
	/**
	 * @return the shillings
	 */
	public int getShillings() {
		return shillings;
	}
	/**
	 * @param shillings the shillings to set
	 */
	public void setShillings(int shillings) {
		this.shillings = shillings;
	}
	/**
	 * @return the pennies
	 */
	public int getPennies() {
		return pennies;
	}
	/**
	 * @param pennies the pennies to set
	 */
	public void setPennies(int pennies) {
		this.pennies = pennies;
	}
	public AmountModal(int pounds, int shillings, int pennies, String reminder) {
		super();
		this.pounds = pounds;
		this.shillings = shillings;
		this.pennies = pennies;
		this.reminder=reminder;
	}
	
	public AmountModal(String amount) {
		super();
		
		String[] amountArr = amount.split(" "); 
		
		if(amountArr.length==3)
		{
			this.pounds =Integer.parseInt(amountArr[0].split("p")[0]);
			this.shillings =Integer.parseInt(amountArr[1].split("s")[0]);
			this.pennies =Integer.parseInt(amountArr[2].split("d")[0]);
		}
		else
		{
			System.out.println("AMount is not in correct format please check again");
		}
	
	}
	@Override
	public AmountModal sum(AmountModal amountToSum) {
		// TODO Auto-generated method stub
		int penniestoAdd =0;
		int shillingToAdd=0;
		int poundToAdd=0;
		
		penniestoAdd = this.getPennies()+amountToSum.getPennies();
		shillingToAdd =  this.getShillings()+amountToSum.getShillings();
		poundToAdd = this.getPounds()+amountToSum.getPounds();
		if(penniestoAdd>11)
		{
			if(penniestoAdd==12)
			{
				shillingToAdd +=1;
				penniestoAdd = 0;
			}
			else
			{
				shillingToAdd += brain.getQuotient(penniestoAdd, 12);
				penniestoAdd = brain.getRemainder(penniestoAdd, 12); 
			}
		}
		if (shillingToAdd>19) {
			
			if(shillingToAdd==20)
			{
				poundToAdd +=1;
				shillingToAdd=0;
			}
			else
			{
				poundToAdd += brain.getQuotient(shillingToAdd, 20);
				shillingToAdd = brain.getRemainder(shillingToAdd, 20); 
			}
		}
		System.out.println("Total Pounds = "+ poundToAdd);
		System.out.println("Total Shillings = "+ shillingToAdd);
		System.out.println("Total Pennies = "+ penniestoAdd);
			
		return new AmountModal(poundToAdd,shillingToAdd,penniestoAdd,"");
		
	}
	@Override
	public AmountModal sub(AmountModal amountToSuB) {
		// TODO Auto-generated method stub
		int penniestoSub =0;
		int shillingToSub=0;
		int poundToSub=0;
		
		penniestoSub = this.getPennies()-amountToSuB.getPennies();
		shillingToSub =  this.getShillings()-amountToSuB.getShillings();
		poundToSub = this.getPounds()-amountToSuB.getPounds();
		
		//int totalNumberOfPennies = brain.getBrain(this.getPounds(), this.getShillings(), this.getPennies());
		return brain.processInBrain(brain.getBrain(poundToSub, shillingToSub, penniestoSub));
		
//		int totalAmountInPennies = (poundToSub * 20 * 12) + (shillingToSub*12) + (penniestoSub);
//		int temp=0;
//		poundToSub = brain.getQuotient(totalAmountInPennies, 20*12);
//		temp = brain.getRemainder(totalAmountInPennies, 20*12);
//		shillingToSub = brain.getQuotient(temp, 12);
//		temp = brain.getRemainder(temp, 12);
//		penniestoSub = temp;
//		
//		System.out.println("Total Pounds = "+ poundToSub);
//		System.out.println("Total Shillings = "+ shillingToSub);
//		System.out.println("Total Pennies = "+ penniestoSub);
//			
//		return new AmountModal(poundToSub,shillingToSub,penniestoSub);
		
	}
	@Override
	public AmountModal multiply(int multiplyBy) {
		// TODO Auto-generated method stub
		int totalNumberOfPennies = brain.getBrain(this.getPounds(), this.getShillings(), this.getPennies());
		return brain.processInBrain(totalNumberOfPennies*multiplyBy);
	}
	@Override
	public AmountModal divide(int divideBy) {
		// TODO Auto-generated method stub
		int pounds = brain.getQuotient(this.getPounds(), divideBy);
		int poundReminder = brain.getRemainder(this.getPounds(), divideBy);
		int shillings = brain.getQuotient(poundReminder*20 + this.getShillings(), divideBy);
		int reminderShillings = brain.getRemainder(poundReminder*20 + this.getShillings(), divideBy);
		
		int pennies = brain.getQuotient(this.getPennies(), divideBy);
		int penniesReminder = brain.getRemainder(this.getPennies(), divideBy);
		return new AmountModal(pounds,shillings,pennies,makeReminder(reminderShillings, penniesReminder));
	}
	
	@Override
	public String toString() { 
        return this.getPounds()+"p "+ this.getShillings()+"s "+this.getPennies()+"d" + this.getReminder();
     } 
	
	
	public static String makeReminder(int shillings,int pennies)
	{
		String result="";
		if(shillings!=0 & pennies!=0)
			result = "("+shillings+"s "+pennies+"d)";
		else if(shillings==0 & pennies==0)
		{
			result= "";
		}
		else
		{
			if(shillings==0 & pennies!=0)
			{
				result= "("+pennies+"d)";
			}
			else if(pennies==0 & shillings!=0)
			{
				result = "("+shillings+"s)";
			}
		}
		return result;
	}
	
	
//	public void splitString(String str)
//    {
//       StringBuffer num = new StringBuffer()
//         
//        for (int i=0; i<str.length(); i++)
//        {
//        	if(Character.isAlphabetic(str.charAt(i)) && str.charAt(i) == 'p')
//        	{
//        	  if (Character.isDigit(str.charAt(i)))
//	            	this.pounds = str.charAt(i);
//        	}	
//            else if(Character.isAlphabetic(str.charAt(i)))
//                alpha.append(str.charAt(i));
////            else
////                special.append(str.charAt(i));
//        }
//      
//        //System.out.println(alpha);
//        System.out.println(num);
//       //System.out.println(special);
//    }
}
