import java.util.Scanner;

public class Math {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/**/
		/*
		 * System.out.println("What is your name");
		String name = input.next();
		System.out.println("Hello " + name);*/
		
		
		// Take input from user 		
		System.out.println("Enter number 1");
		int number1 = input.nextInt();		
		System.out.println("Enter number2");
		int number2 = input.nextInt();
		
		// Do the addition
		int number3 = number1 + number2;
	
		System.out.println("Addition = " + number3);
		
		// Do the subtraction
		int number4 = number1 - number2;
		System.out.println("Substraction = " + number4);
		
		// Do the Division
		int number5 = number1 / number2;
		System.out.println("Division = " + number5);
		
		// Do the Multiplication
		int number6 = number1 * number2;
		System.out.println("Multiplication = " + number6);
		
		// Do the percentage
		int number7 = number1 % number2;
		System.out.println("Percentage = " + number7);
		
		// Do the greater than
		boolean number8 = number1 > number2;
		System.out.println("Greater than = " + number8);
		
		int number9 = number1 * number2 + number3;
		System.out.println("Multiplication and Addition = " + number9);
		
		boolean number10 = number1 <= number2;
		System.out.println("Less than and Equal = " + number10);
		
		//Mix sums
		int number11 = number1 % number2 + number3 * number4 - number2;
		System.out.println("Persentage, Addition, multiplication and Substraction =" + number11);
		
		
		
	}
	
	

}
