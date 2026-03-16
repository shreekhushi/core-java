class MicrowaveOven {
	static int price = 5000;
	static String size = "15L" ;
    static String brand  = "Butterfly";
    static String color ="black" ;
    static String heatingMethod ;
    static String finishingType;
    static String voltages = "220 volts";
    static String fuelType =" electric";
    static String components ;
	
  public static void main(String[] args) {
    
	// price = 6440;
	// size = "20L";
	// brand = "Panasonic";
	// color = "Silver";
	// heatingMethod = "Solo";
	// finishingType = "Polished";
	// voltages = "230 Volts";
	// fuelType = "Electric";
	// components = "MWO Unit, Turntable, Rotating Ring, User Manual";
	
	
    int price = 6440;
	String size = "20L";
    String brand = "Panasonic";
    String color = "Silver";
    String heatingMethod = "Solo";
    String finishingType = "Polished";
    String voltages = "230 Volts";
    String fuelType = "Electric";
    String components = "MWO Unit, Turntable, Rotating Ring, User Manual";

    System.out.println("The price is : " + price); 
    System.out.println("The size of product is : " + size);
    System.out.println("The brand it belongs to is : " + brand);
    System.out.println("The color is : " + color);
    System.out.println("The heating method of product is : " + heatingMethod);
    System.out.println("The finishing type is : " + finishingType);
	System.out.println("The voltage is : " + voltages);
    System.out.println("The fuel type it can accept is : " + fuelType);
    System.out.println("The components it includes are : " + components);
	
	
	 System.out.println("The price is : " + MicrowaveOven.price); 
    System.out.println("The size of product is : " + MicrowaveOven.size);
    System.out.println("The brand it belongs to is : " + MicrowaveOven.brand);
    System.out.println("The color is : " + MicrowaveOven.color);
    System.out.println("The heating method of product is : " + MicrowaveOven.heatingMethod);
    System.out.println("The finishing type is : " + MicrowaveOven.finishingType);
	System.out.println("The voltage is : " + MicrowaveOven.voltages);
    System.out.println("The fuel type it can accept is : " + MicrowaveOven.fuelType);
    System.out.println("The components it includes are : " + MicrowaveOven.components);
    }
}
