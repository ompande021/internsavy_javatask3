package currency_converter;

import java.util.Scanner;

public class converter 
{
	 public static void main(String[] args) 
	 {
		 Scanner scanner = new Scanner(System.in);
		 while(true)
		 {
	     System.out.println("Welcome to Currency Converter!");
	     System.out.print("Enter the amount you want to convert: ");
	     double amt = scanner.nextDouble();

	     System.out.println("Enter the currency code you want to convert from \n1.USD \n2.EUR \n3.IND ");
	     int fromCurrency = scanner.nextInt();

	     System.out.println("Enter the currency code you want to convert to \n1.USD \n2.EUR \n3.IND ");
	     int toCurrency = scanner.nextInt();
         
	     if(fromCurrency == 3)
	     {
	    	 IND_to_other(amt, toCurrency);
	     }
	     else if(fromCurrency == 1)
	     {
	    	 USD_to_other(amt, toCurrency);
	     }
	     else if(fromCurrency == 2)
	     {
	    	 Euro_to_other(amt, toCurrency);
	     }  
	     else
	     {
	    	 System.out.println("Invalid option try again....");
	     }
		 }
}
	 
	public static void IND_to_other(double amt, int toCurrency) 
	 {
		 if(toCurrency == 1)
		 {
		    System.out.println("1.0 IND = " + 0.012 + " USD\n-------");
		    System.out.println(amt+" IND = " + (amt*0.012) + " USD\n-------");
		 }
		 else if(toCurrency == 2)
		 {
			System.out.println("1.0 IND = " + 0.012 + " EUR\n-------");
		    System.out.println(amt+" IND = " + (amt*0.011) + " EUR\n-------");  
		 }
		 else
		 {
			 System.out.println("Invalid option try again....");
		 }
	 }   

	public static void USD_to_other(double amt, int toCurrency) 
	{
		if(toCurrency == 3)
		{
		    System.out.println("1.0 USD = " + 82.20 + " IND\n-------");
		    System.out.println(amt+" USD = " + (amt*82.20) + " IND\n-------");
		}
		else if(toCurrency == 2)
		{   
		    System.out.println("1.0 USD= " + 0.91 + " EUR\n-------");
		    System.out.println(amt+" USD = " + (amt*0.91) + " EUR\n-------");
		}
		else
		{
			System.out.println("Invalid option try again....");
		}
	}
		    

	public static void Euro_to_other(double amt, int toCurrency)
	{
		if(toCurrency == 3)
		{ 
			System.out.println("1.0 Euro = " + 89.91 + " IND\n-------");
		    System.out.println(amt+" Euro = " + (amt*89.91) + " IND\n-------");
	    }
	    else if(toCurrency == 1)
	    {
		    System.out.println("1.0 Euro = " + 1.09 + " USD\n-------");
		    System.out.println(amt+" Euro = " + (amt*1.09) + " USD\n-------");
		}
	    else
		{
			System.out.println("Invalid option try again....");
		}
	}
}
