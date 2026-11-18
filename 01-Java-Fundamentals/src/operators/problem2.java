




/*                        Problem 2 – Shopping Mall Billing System

                                      Difficulty: 4/10


                 
                                
              A customer purchases:

                   Product	Quantity	Price

                   Laptop   	1       ₹55,000
                   Mouse    	2	    ₹750
                   Keyboard	    1	    ₹1,500
                   Headphones	1	    ₹2,500
                   
                   

 
          The store offers:

            12% discount on the total product amount.
            18% GST after applying the discount.
            ₹200 delivery charge.


        Your tasks:

            1. Calculate the total product cost.
            2. Calculate the discount.
    		3. Calculate the amount after discount.
    		4. Calculate GST.
    		5. Calculate the final bill.

     Challenge: Calculate the discount and GST without using hardcoded intermediate values.                    */







package operators;

public class problem2 {

	public static void main (String[] args)
	{
		int laptop = 55000;
		int mouse = 750 ;
		int keyboard = 1500;
		int headphones = 2500;
		int deliveryCharge = 200;
		double totalcost = laptop + (mouse *2)+ keyboard + headphones ;
		
		double totalDiscount = totalcost * 0.12;
		double amountAfterDiscount = totalcost - totalDiscount ;
		double gst = amountAfterDiscount * 0.18 ;
		double finalbill = amountAfterDiscount + gst + deliveryCharge;
		
		
		
		System.out.println ("Total product cost is = " + totalcost  );
		System.out.println("Discount is = " + totalDiscount);
		System.out.println("Amount after discount is = "+ amountAfterDiscount);
		System.out.println("GST is = "+ gst);
		System.out.println("Final bill is = " + finalbill);
		
		
		

/*                           Interview-style bonus question
  
   
      Suppose the customer purchases:
        - 3 laptops
        - 5 mouse
        - 2 keyboards
        - 4 headphones                                                                                     */

		
		
		//  double totalcost = (laptop * 3 ) + (mouse * 5) + (keyboard * 2) + (headphones *  4);
		//  System.out.println ("Total product cost is = " + totalcost  );
		
		
		
	}
}











