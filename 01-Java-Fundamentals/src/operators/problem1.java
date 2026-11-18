



//                  Problem 1 – Salary Breakdown Calculator

//                             Difficulty: 3/10



//     An employee has the following salary structure:
//-      Basic salary = ₹35,000
//-      HRA = 20% of basic salary
//-      DA = 15% of basic salary
//-      Travel allowance = ₹2,500
//-      Professional tax = ₹200
//-      Income tax = 5% of gross salary


//    Your tasks:
//     1. Calculate HRA and DA.
//     2. Calculate gross salary.
//     3. Calculate income tax.
//     4. Calculate total deductions.
//     5. Calculate final take-home salary.


//  Challenge: Store the percentage values as variables instead of directly writing them into formulas.






package operators;

public class problem1 {
	
	public static void main (String[] args)
	{
		
		int basicSalary = 35000;
		int travelAllovance = 2500;
		int profTax = 200;
		double Hra = basicSalary * 0.20;
		double da = basicSalary * 0.15;
		double grossSalary = basicSalary + Hra + da + travelAllovance ;
		double incometax = grossSalary * 0.05 ;
		double totalDeduction = incometax + profTax ; 
		double takehomeSalary = grossSalary - totalDeduction ;
		
		
		
		System.out.println ("HRA = " + Hra + " and DA = " + da);
		System.out.println ("Gross Salary is = " + grossSalary);
		System.out.println("Income tax is = " + incometax);
		System.out.println("Total Deduction is = " + totalDeduction);
		System.out.println("Final take home Salary is " + takehomeSalary);
		
	
	}
	
	

}
