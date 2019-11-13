import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String []arges) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> books = new ArrayList<String>();
		ArrayList<Integer> prices = new ArrayList<Integer>();
		
		for(; ;) {
			
			System.out.println(" Please enter book name");
			String book = input.next();
			
			if(book.equals("Exist")) {
				break;
			}
	      books.add(book);
	      
	      System.out.println("Please enter book price");
	      int price = input.nextInt();
	      prices.add (price);
// Test change
		}   
		
	}

}
