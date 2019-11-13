import java.util.Scanner;

public class squareNumber {
	

	public static void main( String[] arges) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number to check that it is square number or not : ");
		int number = input.nextInt();
		
		for(int i = 2; i < number; i++){
		
			if(i * i ==number) {
				System.out.println("This number is square number of : " + i);
				break;
				} 
			
			if(i * i > number) {
				System.out.println("This number is not square number");
				break;
			}
		}	
		
	         
	        	
	        	
		
}
	}	
		
	
	    	  
		      
    
        


	

