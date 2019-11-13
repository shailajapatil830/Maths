import java.util.ArrayList;
import java.util.Scanner;

public class NameArrayList {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		for ( ; ; ) {
			
			System.out.println("Please enter your name : ");
			String name = input.next();
			
			
			
			if(name.equals("Exit")) {
				break;
			}
			
			names.add(name);
			
			System.out.println("Please enter your age: ");
			int age = input.nextInt();
			ages.add(age);			
		}
		
		for(int i = 0; i < names.size(); i++) {
			
			System.out.println("Name: " + names.get(i) + " Age: " + ages.get(i) );
			
			if(ages.get(i) > 21) {
				System.out.println("Yes, you can vote!");
			}
			else {
				System.out.print("Sorry, you can't vote");
			}
				
		}
		
	}

}
