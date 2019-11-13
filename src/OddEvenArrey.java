
public class OddEvenArrey {
	public static void main(String[] args) {
				
		int[] numbers = {25, 56, 78, 45, 88, 30, 58, 93, 50};
		
		System.out.println("Find odd/even using for loop and position");
		for(int i=0; i < numbers.length; i++) {		
			
			if(numbers[i] % 2 == 0) {
				System.out.println("number : " +  numbers[i] + " is even number ");				
			}
			else {
				System.out.println("number : " + numbers[i] + " is odd number");
			}
		}
		
		
		System.out.println("Find odd/even using for loop and without position");
		for(int num :  numbers)	{	
			
			if(num % 2 == 0) {
				System.out.println("number : " +  num + " is even number ");				
			}
			else {
				System.out.println("number : " + num + " is odd number");
			}
		}
		
		System.out.println("Find odd/even using while loop and with position");
		int i = 0;
		while(i < numbers.length)	{	
			
			if(numbers[i] % 2 == 0) {
				System.out.println("number : " +  numbers[i] + " is even number ");				
			}
			else {
				System.out.println("number : " + numbers[i] + " is odd number");
			}
			
			i++;
		}
		
		System.out.println("Find odd/even using do while loop and with position");
		i = 0;
		do	{	
			
			if(numbers[i] % 2 == 0) {
				System.out.println("number : " +  numbers[i] + " is even number ");				
			}
			else {
				System.out.println("number : " + numbers[i] + " is odd number");
			}
			
			i++;
		}while(i < numbers.length);
		


}
}