
public class SimpleArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {20, 30, 40};
		String[] names = { "Sunil", "Shailaja", "Sakshi", "Krishna" };
		
		System.out.println("Total numbers: " + numbers.length);
		System.out.println("Total names: " +  names.length);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Position: " + i + " Value: " + numbers[i]);
		}
		
		for(String n : names) {
			System.out.println(n);
		}
		
		
	}

}
