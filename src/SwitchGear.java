import java.util.Scanner;

public class SwitchGear {
	
	public static void main(String[] args) {
		
		// Car - 5 Gears forward  1 Gear Reverse
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the gear: ");
		int gear = input.nextInt();
		
		switch(gear) {
		
		case 0: 
			System.out.println("You are in reverse gear, Max spead is 10");
			break;
			
		case 1:
			System.out.println("You are in gear 1, Max spead is 15");
			break;
			
		case 2:
			System.out.println("You are in gear 2, Max spead is 20");
			break;
			
		case 3:
			System.out.println("You are in gear 3, Max spead is 30");
			break;
			
		case 4:
			System.out.println("You are in gear 4, Max spead is 60");
			break;
			
		case 5:
			System.out.println("You are in gear 5, Max spead is 100");
			break;
			
		default:
			System.out.println("Invalid gear. Please enter gear from 0 to 5");
			
		}
	}

}
