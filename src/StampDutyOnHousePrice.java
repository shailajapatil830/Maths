import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StampDutyOnHousePrice {
	public static void main(String [] arges) {
		Scanner input = new Scanner(System.in);
		
	/*	System.out.println("Find out residential property rates : ");
		
		
		System.out.println("Is your transaction freehold or leasehold : ");
		String transaction = input.next();
		
		System.out.println("Residential or non-residential : ");
		String transactions = input.next();
		
		System.out.println("Date of your transaction : ");
		LocalDate dateOfTransaction = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		System.out.println("Are you purchasing property as an individual :");		
		String yes = input.next();
		
		
		System.out.println("Will this property be your own residence : ");
		String Yes = input.next();
		*/
		
		
		
		System.out.println("Enter the price : ");
		int price = input.nextInt();
		float percentage = 0;
		if(price <= 125000) {
			percentage = 0;
		}
		else if(price > 125000 && price <= 250000) {
			percentage = 2;
		}		
		else if(price > 250000 && price <= 925000) {
			percentage = 5;
		}
		else if(price > 925000 && price <= 1500000) {
			percentage = 10;
		}
	    else if(price > 1500000) {
		   percentage = 12;
	    }
		
		System.out.println("Are you first time buyer : ");
		String  firstTimeBuyer = input.next();
		
		if(firstTimeBuyer.equals("No")) {
			percentage = percentage + 3;
		}
		
		  
		 System.out.println("percentage rate : " + percentage + "%");
		
		  float stampdutyAmount = price/100*percentage;
		  System.out.println("Stamp duty amount" + stampdutyAmount);
		  
	}

}
