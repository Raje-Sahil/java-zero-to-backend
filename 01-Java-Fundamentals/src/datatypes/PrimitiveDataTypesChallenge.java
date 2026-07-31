
//*****expected output********
//Student Name = Sahil
//Student Age = 22
//CGPA = 7.06
//Passed = true
//Grade = A
//College Fees = 95000
//India Population = 1450000000


package datatypes;

public class PrimitiveDataTypesChallenge {
	
	public static void main (String []args)
	{
		String name = "Sahil Raje";
		byte age = 22;
		float CGPA = 7.06f;
		boolean passed = true;
		char grade = 'A';
		int collegeFees = 95000;
		long population = 1450000000L;
		
		
		System.out.println("Student Name = "+ name);
		System.out.println("Student Age = "+ age);
		System.out.println("CGPA = "+ CGPA);
		System.out.println("Passed = "+ passed);
		System.out.println("Grade = "+ grade);
		System.out.println("College Fees = "+ collegeFees);
		System.out.println("India Population = "+ population);
		
				
	}

}
