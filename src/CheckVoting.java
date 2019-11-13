import java.util.Scanner;

public class CheckVoting {
	
	public static void main(String[] args) {
		
		System.out.println("Are you over 18 years: ");
		
		Scanner input = new Scanner(System.in);
		String ans = input.next();
		
		if(ans.equals("yes")) {
			System.out.println("You can vote!");
		}
		else {
			System.out.println("You can't vote yet");
		}
			
	}

}
