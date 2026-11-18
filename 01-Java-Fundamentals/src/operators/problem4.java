

/*                 
                                         
                    Swap Variables Without a Third Variable
 
      You are given:
		int a = 45;
		int b = 90;
		
		
 
 Your task is to exchange their values.
 

			Expected output:
			
			Before swapping:
				a = 45
				b = 90

			After swapping:
				a = 90
				b = 45
 
 
 */


package operators;

public class problem4 {
	public static void main (String[] args)
	{
		int a = 45 ;
		int b = 90 ;
		a = a + b  ;
		b = a - b ;
		a = a - b ;
		
		 
		 
		 
		 System.out.println("the swapped values are  ");
		 System.out.println("a : " + a + "\n b : "+ b);
		 
	}

}
