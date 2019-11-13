import java.util.Scanner;

public class timesTable {
	 public static void main(String [ ] arge) {
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Which times tabel do you want? : ");
		 int timestable = input.nextInt();
		 
		 
		 for(int i = timestable; i <= timestable*10; i = timestable+timestable) {
			 System.out.println("times table : " + i); 
		 } 
	 }
	 
	  
	 

}
