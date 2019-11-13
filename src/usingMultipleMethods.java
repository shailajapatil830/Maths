
public class usingMultipleMethods {
	public static void main(String[] args) {
		int x = 8;
		int y = 2345;
		int z = 3;
		int w = 5;
		int m = 5;
		int add = x + y;
		int divide = (x + y)/z;
		int modulus = (x + y)/z % w;
		int multiply = (x + y)/z % w*m;
		System.out.println("Display the final result : " + add + divide + modulus + multiply );
		System.out.println((8+2345)/3 %5 *5);
		
	}

}
