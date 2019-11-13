import java.util.Scanner;

public class GetStudentsDetail {
  public static void main(String[] arges) {
	  
	  Scanner input = new Scanner(System.in);
	  String name;
	  int rollnumber,mathmarks, phymarks, engmarks;
	  
	  System.out.println("Enter students name: ");
	   name = input.nextLine();
	  
	  System.out.println("Enter roll number: ");
	   rollnumber = input.nextInt();
	   
	   
	   
	   System.out.println("Enter marks in maths, Physics, and English :");
	   mathmarks = input.nextInt();
	   phymarks = input.nextInt();
	   engmarks = input.nextInt();
	   
	   
	   int total = mathmarks + phymarks + engmarks;
	   System.out.println("Total: " + total);
	   
	  float percentage = (mathmarks + phymarks + engmarks) / 3f;
	  System.out.println("percentage: " + percentage);
	  
	  int marks = 0;
	  if(marks > 200) {
		  System.out.println("you are getting first grade : ");
	  } 
	  else if(marks < 200) {
		  System.out.println("you are getting second grade: ");
	  }
	  else if(marks <= 150) {
		  System.out.println("you are getting third grade : ");
	  }
	  else {
		  System.out.println("you are pass grade : ");
	  }
	  
	   
	   
	   
	   
	  
	  
	  
	  
  }
}
