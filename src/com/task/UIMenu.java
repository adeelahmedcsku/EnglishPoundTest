package com.task;

import java.util.Scanner;

public class UIMenu {

public static String lineBeforeStart = "*|--------------------------------  ";
public static String lineBeforeEnd = "  -------------------------------- |*";
public static String lineBreak= "*|===========================================================================================|*";
	
	public static void showMenu()
	{
		System.out.println(lineBreak);
		System.out.println(lineBeforeStart + "Old Fashioned English Pound Test" + lineBeforeEnd);
		System.out.println(lineBreak);
		System.out.println("Press the required key according to the given menu operation below");
		System.out.println("1. For the Addition.");
		System.out.println("2. For the Subtraction.");
		System.out.println("3. For the Multiply.");
		System.out.println("4. For the Division.");
		System.out.println("5. For the Exit.");
	}
	
	public static void chooseOperation(int option)
	{
		switch(option)
		{
			case 1:
				System.out.println(lineBeforeStart + "Addition operation selected by user" + lineBeforeEnd);
				ui_Addition_template();
				break;
			case 2:
				System.out.println(lineBeforeStart + "Subtraction operation selected by user" + lineBeforeEnd);
				ui_Subtraction_template();
				break;
			case 3:
				System.out.println(lineBeforeStart + "Multiplication operation selected by user" + lineBeforeEnd);
				ui_Multiplication_template();
				break;
			case 4:
				System.out.println(lineBeforeStart + "Division operation selected by user" + lineBeforeEnd);
				ui_Division_template();
				break;
			default:
				System.out.println(lineBeforeStart + "Exit operation selected by user" + lineBeforeEnd);
				System.exit(0);
		}	
			
		/*	System.out.println(lineBreak);
		System.out.println(lineBeforeStart + "Old Fashioned English Pound Test" + lineBeforeEnd);
		System.out.println(lineBreak);
		System.out.println("Press the required key according to the given menu operation below");
		System.out.println("1. For the Addition.");
		System.out.println("2. For the Subtraction.");
		System.out.println("3. For the Multiply.");
		System.out.println("4. For the Division.");
		System.out.println("5. For the Exit.");*/
	}
	
	public static void ui_Addition_template()
	{
		System.out.println(lineBreak);
		System.out.println(lineBeforeStart + "Addition operation (a + b) = result" + lineBeforeEnd);
		System.out.println(lineBreak);
		System.out.println("Enter first amount like this. Hint: a = 21p 10s 6d");
		Scanner sc= new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("You enter the amount ===> a = "+a);
		System.out.println("Enter Second amount like this. Hint: b = 21p 10s 6d");
		
		String b = sc.nextLine();
		System.out.println("You enter the amount ===> b = "+b);
		AmountModal amountModal1 =  new AmountModal(a);
		AmountModal amountModal2 =  new AmountModal(b);
		String res = amountModal1.sum(amountModal2).toString();
		
		System.out.println("The Sum of a and b is equal to = " + res);
		System.out.println(lineBeforeStart + "Addition operation ("+a+" and " + b+") = "+ res +" Completed"+ lineBeforeEnd);
		sc.nextLine();
	}

	public static void ui_Subtraction_template()
	{
		System.out.println(lineBreak);
		System.out.println(lineBeforeStart + "Subtraction operation (a - b) = result" + lineBeforeEnd);
		System.out.println(lineBreak);
		System.out.println("Enter first amount like this. Hint: a = 21p 10s 6d");
		Scanner sc= new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("You enter the amount ===> a = "+a);
		System.out.println("Enter Second amount like this. Hint: b = 21p 10s 6d");

		String b = sc.nextLine();
		System.out.println("You enter the amount ===> b = "+b);
		AmountModal amountModal1 =  new AmountModal(a);
		AmountModal amountModal2 =  new AmountModal(b);
		String res = amountModal1.sub(amountModal2).toString();

		System.out.println("The Subtarction of a and b is equal to = " + res);
		System.out.println(lineBeforeStart + "Subtraction operation ("+a+" and " + b+") = "+ res +" Completed"+ lineBeforeEnd);
		sc.nextLine();
	}

	public static void ui_Multiplication_template()
	{
		System.out.println(lineBreak);
		System.out.println(lineBeforeStart + "Multiplication operation (amount * Any integer number ) = result" + lineBeforeEnd);
		System.out.println(lineBreak);
		System.out.println("Enter first amount like this. Hint: a = 21p 10s 6d");
		Scanner sc= new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("You enter the amount ===> a = "+a);
		System.out.println("Enter Integer value:Hint 2 or 4");

		int multiple = sc.nextInt();
		System.out.println("You enter the Number ===> "+multiple);

		AmountModal amountModal1 =  new AmountModal(a);

		String res = amountModal1.multiply(multiple).toString();

		System.out.println("The Multiplication of a and multiple is equal to = " + res);
		System.out.println(lineBeforeStart + "Multiplication operation ("+a+" and " + multiple+") = "+ res +" Completed"+ lineBeforeEnd);
		sc.nextLine();
	}
	public static void ui_Division_template()
	{
		System.out.println(lineBreak);
		System.out.println(lineBeforeStart + "Division operation (amount / Any integer number ) = result" + lineBeforeEnd);
		System.out.println(lineBreak);
		System.out.println("Enter first amount like this. Hint: a = 21p 10s 6d");
		Scanner sc= new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("You enter the amount ===> a = "+a);
		System.out.println("Enter Integer value:Hint 2 or 4");

		int multiple = sc.nextInt();
		System.out.println("You enter the Number ===> "+multiple);

		AmountModal amountModal1 =  new AmountModal(a);

		String res = amountModal1.divide(multiple).toString();

		System.out.println("The Division of a and Divisor is equal to = " + res);
		System.out.println(lineBeforeStart + "Multiplication operation ("+a+" and " + multiple+") = "+ res +" Completed"+ lineBeforeEnd);
		sc.nextLine();
	}

	
}
