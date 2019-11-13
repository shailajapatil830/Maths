import java.util.Scanner;

public class checkPositiveOrNegativeNumber {
	public static void main(String [] arges) {
		
		int number = 456;
		if(number > 0) {
			System.out.println(number + "is a positive number");
		}
	   else if(number < 0) {
		    System.out.println(number + "is a negative number");
	   }
	   else {
		   System.out.println(number + "is neither positive nor negative");
	   } 
		
		System.out.println("Enter the number you want to check");
		
		Scanner input = new Scanner(System.in);
        
         number = input.nextInt();
          
          if(number > 0) {
        	  System.out.println(number + "is positive number");
          }
          else if (number < 0) {
        	  System.out.println(number + "is negative nuber");
          }
          else {
        	  System.out.println(number + "is neither positive nor negative");
          }
	}
}


