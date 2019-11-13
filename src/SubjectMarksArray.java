
public class SubjectMarksArray {
	public static void main(String[]arges) {
		
		float[] marks = {80, 67, 75, 75};
		String[] Subject = {"Maths", "History", "English", "HIndi","Science"};
		
		System.out.println("Total marks: " + marks.length);
		System.out.println("Total numbers: " + Subject.length);
		
		for(int i = 0; i < marks.length; i++ ) {
			System.out.println("position: " + i + "value:" + marks[i]);
			
		}
		
		for(float mark : marks) {
			System.out.println(mark);
		}
		
		for(String n : Subject) {
			System.out.println(n);
		}
	}

}
