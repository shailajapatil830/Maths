import java.util.Scanner;

public class findMeanNumber {
  public static void main(String [] arge) {
	  
	  Scanner input = new Scanner(System.in);
	  
	  // enter a number you have to enter//
	  System.out.println("How many number you want to enter: ");
	  int num = input.nextInt();
	  
	  // enter the number//
	  System.out.println("Enter"  +  num  + "Number: ");
	  
	  
	  // formula to calculate mean//
	     int Sum = input.nextInt();
	     int mean = Sum/num;
	     
	     System.out.println("Mean the given number is : "  +  mean);
	  
	  
	  
  }
}
