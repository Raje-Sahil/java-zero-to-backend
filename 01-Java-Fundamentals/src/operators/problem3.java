/*
  
  
  
                          Problem 3 – Time Conversion Master
                             
                                 Difficulty: 5/10



      A video file has a total duration of 98,765 seconds.

             Convert this duration into:
                      - Hours
                      - Minutes
                      - Seconds

    For example:

       3665 seconds = 1 hour, 1 minute, 5 seconds


          
           Your tasks:

      Use arithmetic operators to extract each component.
      
      

Challenge: Use the modulus (%) and integer division (/) operators correctly.
 Don't use strings or built-in time libraries.                                                                                      */






package operators;

public class problem3 {
	public static void main (String[] args)
	{
		
		int totalDuration = 98765;
		int onehour = 3600 ;
		int oneminute = 60 ;

		
		int hours = totalDuration / onehour ;
		int remainingseconds = totalDuration % onehour ;
		
		int minutes = remainingseconds / oneminute;
		remainingseconds = remainingseconds % oneminute;
		
		int seconds = remainingseconds ;
		
		
		System.out.println("the time duration is = "+ hours + ":" + minutes + ":" + seconds );
		
				
	}
}






/*
                             || Optimized Solution ||
  
  
  
package operators;

public class Problem3 {

    public static void main(String[] args) {

        int totalDuration = 98765;

        int oneHour = 3600;
        int oneMinute = 60;

        int hours = totalDuration / oneHour;

        int remainingSeconds = totalDuration % oneHour;

        int minutes = remainingSeconds / oneMinute;

        int seconds = remainingSeconds % oneMinute;

        System.out.println("Duration = "
                + hours + ":" + minutes + ":" + seconds);
    }
}




*/
