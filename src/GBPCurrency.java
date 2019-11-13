import java.util.Scanner;

public class GBPCurrency {
	public static void main(String[] args) {
		
		System.out.println("Please convert GBP currency into USD and EURO");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter GBP amount");
		float amount = input.nextFloat();
		
		System.out.println("Please enter the currency");
		String currency = input.next();
		
		float destinationAmount = 0f;
		
		if (currency.equals("USD")) {
			destinationAmount = amount * 1.75f;
		}
		else if(currency.equals("EURO")) {
			destinationAmount = amount * 1.5f;			
		}
		else if(currency.equals("INR")) {
			destinationAmount = amount * 100f;
		}
		
	      System.out.println(" you will get "+ destinationAmount + currency);
	      
		
				
	}

}
