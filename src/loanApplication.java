import java.util.Scanner;

public class loanApplication {
	
	public static void main( String[] arges) {
		
		System.out.println("Tnstruction for loan application");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name");
		String name = input.next();
		
		System.out.println("How many money you want to borrow");
		int money = input.nextInt();
		
	
		
		if(money < 5000) {
			System.out.println("I am sorry your expection is too low");
		}
		else if(money > 25000) {
			System.out.println("Your expection is too high");
		}
	    else {
	    	System.out.println("Please carry on");
	 
	    	System.out.println("How many years do you want money");
	    	int years = input.nextInt();
	    
	    	if(years < 3) {
	    		System.out.println("This amount of time is too short");
	    	}
	    	else {
	        	 System.out.println("Please carry on");
	                 	 
	        	float inter = (money/100)*8f;
	        	float interest = inter * years;
	        	float interm = interest + money;
	        	System.out.println("Thank you you need to return:" + interm);
	    	}
	        	
	      }
	}

}	         	         
	         