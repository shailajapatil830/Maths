import java.util.Scanner;

public class SqareRoot {
	
	public static void main( String[] arges) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number to find its square root : ");
		int number = input.nextInt();
		
		for(int i = number/2; i >= 1; i--){
		
			if(i * i ==number) {
				System.out.println("The square root of this number is : " + i);
				break;
				} 
			
			if(i == 1) {
				System.out.println("No square root for this number");
				break;
			}
		}	
}

}
