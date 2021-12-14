package com.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // TODO Auto-generated method stub
//		AmountModal amountModal1 = new AmountModal("9p 2s 6d");
//		AmountModal amountModal2 = new AmountModal("5p 17s 8d");
//		AmountModal amountModal3 = new AmountModal("18p 16s 1d");
//
//		String res = amountModal1.sum(amountModal2).toString();
//
//
//		System.out.println("The result of sum is = "+ res);
//
//		res = amountModal1.sub(amountModal2).toString();
//		System.out.println("The result of subtraction is = "+ res);
//
//		res = amountModal2.multiply(2).toString();
//		System.out.println("The result of Multiplication is = "+ res);
//
//
//		System.out.println("------------------  Divide by 3 work ------------------------");
//		res = amountModal2.divide(3).toString();
//		System.out.println("The result of division by 3 is = "+ res);
//
//
//		System.out.println("------------------  Divide by 15 work ------------------------");
//		res = amountModal3.divide(15).toString();
//		System.out.println("The result of division by 15 is = "+ res);
    		AmountModal amountModal1 = new AmountModal("9p 2s 6d");
    		AmountModal amountModal2 = new AmountModal("5p 17s 8d");
		System.out.println("Example of chain operation");
       		System.out.println("First Amount ==> "+"9p 2s 6d");
       		System.out.println("Second Amount ==> "+"5p 17s 8d");
       		System.out.println("Multiplier is ==> "+"2");
	       String res = amountModal1.sum(amountModal2).multiply(2).toString();
               System.out.println("The result of sum and multiplication is = "+ res);
        while(true)
        {
            UIMenu.showMenu();
            Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
            int a= sc.nextInt();
            UIMenu.chooseOperation(a);
            //System.out.println("You pressed key "+a);
        }
    }
}
