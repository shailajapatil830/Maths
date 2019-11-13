import java.util.Scanner;

public class classForm {
	public static void main(String [ ] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your form : ");
		char form = input.next().charAt(0);
		
		switch(form) {
		
		case 'A':
			System.out.println("Please go to English class : ");
			break;
		case 'B' :
			System.out.println("Please go to science class : ");
			break;
		case 'C' :
			System.out.println("Please go to history class : ");
			break;
		case 'D' :
			System.out.println("Please go to maths Class : ");
			break;
		case 'E' :
			System.out.println("Please go to spanish class : ");
			break;
		case 'F' :
			System.out.println("please go to music class : ");
			break;
		default:
			System.out.println("invalid form entered : ");
		
			
			
			
			
		
		}
	}

}
