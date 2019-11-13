import java.util.Scanner;

public class DrName {
	public static void main(String [] arges) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your Doctor name : ");
		String DoctorName = input.next();
		
		switch(DoctorName) {
		
		case "DrRam":
			System.out.println("Go to room no- 23 firstfloor :");
			break;
		case "DrSmith" :
			System.out.println("Go to room no-10 firstfloor: ");
			break;
		case "DrDeshpande" :
			System.out.println("Go to romm no- 11 firstfloor : ");
			break;
		case "DrVargeese" :
		
			System.out.println("Go to room no- 09 groundfloor : ");
			break;
		case "DrJoshi" :
			System.out.println("Go to room no- 05 groundfloor : ");
			break;
		
			
		}
			
	}

}
