import java.util.Scanner;

public class twoDoubleAreaOfRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Retangle length ");
		double x = input.nextDouble();
		System.out.println("Enter Retangle breadth ");
		double y = input.nextDouble();
		double area = x*y;
		System.out.println("Area of retangle is : " + (int)area);
	}

}
