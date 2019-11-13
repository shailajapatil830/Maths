import java.util.Scanner;

public class ExArrayEvenOdd {
	public static void main(String[]args) {
		
		//creating objects//
		int number;
		Scanner input = new Scanner(System.in);
		
		//enter number for elements//
		System.out.println("Enter a number of element you want in aaray : ");
		number = input.nextInt();
		int a[] = new int [number];
		
		//enter all elements//
		System.out.println("Enter all the elements : ");
		for (int i = 0; i < number; i++) {
			 
			a[i] = input.nextInt();
		}
		System.out.println("Odd number in the array are : ");
		for(int i = 0; i < number; i++) {
			
			if(a[i] % 2 != 0) {
				System.out.println(a[i]+" ");
			}
		}
	     System.out.println("...............................");
	     System.out.println("Even numbers in the array are : ");
	     for(int i = 0; i < number; i++) {
	    	 if(a[i] % 2 == 0) {
	    		 System.out.println(a[i]+" ");
	    		 
	    	 }
	     }
	     
	}
}
