//Expected Output
//========== STUDENT PROFILE ==========
//Student ID      : 101
//Student Name    : Sahil Raje
//Age             : 22
//CGPA            : 7.06
//Grade           : A
//College Fees    : 95000
//Mobile Number   : 9876543210
//Graduate        : true
//Percentage      : 78.45
//Section         : B
//=====================================


package datatypes;

public class Ex1 {
	
	public static void main(String []args)
	{
		short studentId = 101;
		String studentName = "Sahil Raje";
		byte age = 22;
		float CGPA = 7.06f;
		char grade = 'A';
		int fees = 95000;
		long mobNo = 9876543210L;
		boolean isGraduate = true;
		float percentage = 78.45f;
		char section = 'B';
		
		System.out.println("Student ID      : "+studentId);
		System.out.println("Student Name    : "+studentName);
		System.out.println("Age             : "+age);
		System.out.println("CGPA            : "+CGPA);
		System.out.println("Grade           : "+grade);
		System.out.println("College Fees    : "+fees);
		System.out.println("Mobile Number   : "+mobNo);
		System.out.println("Graduate        : "+isGraduate);
		System.out.println("Percentage      : "+percentage);
		System.out.println("Section         : "+section);
		
	}

}
