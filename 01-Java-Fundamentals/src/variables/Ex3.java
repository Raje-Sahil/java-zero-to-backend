//Create variables for a bank account.
//
//Store:
//
//Account Holder Name
//Account Number
//Balance
//IFSC Code
//Is Account Active
//
//Print all values.




package variables;

public class Ex3 {
	
	public static void main(String[] args)
	{
		String name = "Sahil Raje";
		long accNo = 1234567890123L;
		double balance = 1500000.0;
		String ifsc = "SBIN100";
		boolean isActive = true ;
		
		System.out.println("Account Holder Name : "+name);
		System.out.println("Account Number : "+accNo);
		System.out.println("Balance : "+balance);
		System.out.println("IFSC Code : "+ifsc);
		System.out.println("Is Account Active : "+isActive);
		
		
	}

}
