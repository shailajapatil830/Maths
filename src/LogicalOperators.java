
public class LogicalOperators {
	
	public static void main(String[] args) {
		
		  boolean b1 = true;
	      boolean b2 = false;

	      System.out.println("b1 && b2: " + (b1&&b2));
	      System.out.println("b1 || b2: " + (b1||b2));
	      System.out.println("!(b1 && b2): " + !(b1&&b2));
	      
	     int no1 = 10;
	     int no2 = 10;
	     boolean compare = no1 == no2;
	     System.out.println(compare);
	     
	     no2 = 15;
	     System.out.println(no1 == no2);
	     System.out.println(no1 < no2);
	     System.out.println(no1 > no2);
	     
	     
	     no2 = 10;
	     System.out.println(no1 <= no2);
	     System.out.println(no1 >= no2);
	     
	     System.out.println(no1 != no2);
	     
	     no2 = 11;
	     System.out.println(no1 != no2);	     
	      
	}

}
