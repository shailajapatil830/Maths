import java.util.Scanner;

public class SalaryCalculator {
	private static int percentage;

	public static void main(String [ ] arges) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Find out salary tax : ");
		int salary = input.nextInt();
		float taxPercentage = 0;
		float niPercentage = 0;
		
	
		if(salary <= 10000) {
			taxPercentage = 0;
			niPercentage = 5;
		}
		
		else if(salary > 10000 && salary <= 30000) {
			taxPercentage = 20;
			niPercentage = 10;
			
		}
		
	   else if(salary > 30000 && salary <= 40000) {
		   taxPercentage = 25;
		   niPercentage = 15;
	   }
	   else if(salary > 40000) {
		   taxPercentage = 40;
		   niPercentage = 20;
	   } 
		  
	     System.out.println("your tax percentage is : " + taxPercentage);
	     System.out.println(" and NI Percentage is :" + niPercentage);
		
		float taxAmount = salary/100*taxPercentage;
		System.out.println("tax amount : " + taxAmount);
			
	}

}
