/*
                 ATM Denomination Calculator
                 
                 
                 An ATM needs to dispense ₹18,765.

Available denominations:
- ₹500
- ₹200
- ₹100
- ₹50
- ₹20
- ₹10
- ₹5
- ₹2
- ₹1


Calculate the minimum number of notes/coins required for each denomination.

Expected output:
₹500 notes: ?
₹200 notes: ?
₹100 notes: ?
₹50 notes: ?
₹20 notes: ?
₹10 notes: ?
₹5 coins: ?
₹2 coins: ?
₹1 coins: ?


 */

package operators;

public class problem5 {
	public static void main (String [] args)
	{
		int totalamount = 18765;
		
		int notes500 = totalamount / 500;
		int remainingamount = totalamount % 500 ;
		
		int notes200 = remainingamount / 200 ;
		 remainingamount = remainingamount % 200 ;
		
		int notes100 = remainingamount / 100 ;
		remainingamount = remainingamount % 100 ;
		
		int notes50 = remainingamount / 50 ;
		remainingamount = remainingamount % 50 ;
		
		int notes20 = remainingamount / 20 ;
		remainingamount = remainingamount % 20 ;
		
		int notes10 = remainingamount / 10 ;
		remainingamount = remainingamount % 10 ;
		
		int coins5 = remainingamount / 5 ;
		remainingamount = remainingamount % 5 ;
		
		int coins2 = remainingamount / 2 ;
		remainingamount = remainingamount % 2 ;
		
		int coins1 = remainingamount / 1 ;
		remainingamount = remainingamount % 1 ;
		
		
		
		
		System.out.println("ATM Withdrawal Amount: " + totalamount);

		System.out.println("₹500 notes: " + notes500);
		System.out.println("₹200 notes: " + notes200);
		System.out.println("₹100 notes: " + notes100);
		System.out.println("₹50 notes: " + notes50);
		System.out.println("₹20 notes: " + notes20);
		System.out.println("₹10 notes: " + notes10);
		System.out.println("₹5 coins: " + coins5);
		System.out.println("₹2 coins: " + coins2);
		System.out.println("₹1 coins: " + coins1);

		System.out.println("Remaining Amount: " + remainingamount);
		
		
	}

}
