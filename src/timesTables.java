import java.util.Scanner;

public class timesTables {
	public static void main(String []arges) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Which table do want :");
		int number = input.nextInt();
		
	
		System.out.println("Forward times tables");
		for(int i = number; i <= number*10; i = i+number ) {
			System.out.println(i);
		}
		 
	
		 System.out.println("Backword times table");
		
	     for(int i = number*10; i >= number; i= i-number) {
	    	 System.out.println(i);
	     }
	   
	
	}
}
