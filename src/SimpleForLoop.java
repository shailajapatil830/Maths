
public class SimpleForLoop {

public static void main(String[] args) {
		
		for(int index = 0; index < 10; index++) {
			System.out.println("Hello " + index);
		}
		
		System.out.println("");
		
		for(int i = 10; i > 0; i--) {
			System.out.println("Hello " + i);
		}
		
		System.out.println("");
		
		for(int index = 10; index < 100; index = index + 10) {
			System.out.println("Hello " + index);
		}
		
	}
}
