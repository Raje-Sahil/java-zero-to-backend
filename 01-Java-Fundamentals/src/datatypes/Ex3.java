package datatypes;

public class Ex3 {
	
	 public static void main(String[] args) 
	 {

	        byte seatingCapacity = 5;
	        short modelYear = 2025;
	        int price = 1800000;
	        long chassisNumber = 9876543210123L;

	        float mileage = 21.8f;
	        double engineCapacity = 1498.75;

	        char fuelType = 'P';   // P = Petrol, D = Diesel, E = Electric

	        boolean isAutomatic = true;

	        System.out.println("===== Car Details =====");
	        System.out.println("Seating Capacity : " + seatingCapacity);
	        System.out.println("Model Year       : " + modelYear);
	        System.out.println("Price            : ₹" + price);
	        System.out.println("Chassis Number   : " + chassisNumber);
	        System.out.println("Mileage          : " + mileage + " km/l");
	        System.out.println("Engine Capacity  : " + engineCapacity + " cc");
	        System.out.println("Fuel Type        : " + fuelType);
	        System.out.println("Automatic        : " + isAutomatic);
     }

}
