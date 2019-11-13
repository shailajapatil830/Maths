import java.util.Scanner;

public class findSumAvarge {
 public static void main(String [] args) {
	 
	
	 
	 Scanner input = new Scanner(System.in);
			 System.out.println("Enter first number:");
			 int a = input.nextInt();
			  
			 System.out.println("Enter second number:");
			 int b = input.nextInt();
			 
			 //Calculate sum and average//
			int Sum = a+b;
			int sub = a-b;
			int div = a/b;
					
			float averge = (a+b) /2;
			 
			 System.out.println("Sum :" +Sum  +  "Sub:" + sub  +  "div:" +  "An average:" + averge);
			 
 }
}
