import java.util.Arrays;

public class compareArreysBooleanExample {
	public static void main(String[] arge) {
		
		//create boolean arrays//
		boolean[] blnArray1 = new boolean[] {true, false, true};
		boolean[] blnArray2 = new boolean[] {true, false, true};
		
		boolean blnresult = Arrays.equals(blnArray1,  blnArray2);
		System.out.println("Are two boolean arrays equal ? : " + blnresult);
		
		
	}
	

}
