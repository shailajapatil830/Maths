import java.util.Scanner;

public class InfiniteLoop {
	
	public static void main(String[] args) {
		
		// Invalid loop control will never go in the loop
		for(int i = 1; i > 10; i++) {
			System.out.println("Number: " + i);
		}
		
		// This is infinite loop because i is never changing and will be always letss than 10
		/*for(int i = 0; i < 10; i = i) {
			System.out.println("Number: " + i);
		}*/
		
		// this is also infinte loop which terminated on specific conditions
		for ( ; ; ) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter your name : ");
			String name = input.next();
			
			if(name.equals("Exit")) {
				break;
			}
			
			System.out.println("Hello: " + name);
		}
		
		System.out.println("End");
	}

}
