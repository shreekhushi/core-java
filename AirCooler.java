class AirCooler  {
    static int price = 20000;
    static String brand = "Samsung";
	static String capacity = "1 Tons" ;
    static String coolingPower = "3KW";
    static String specialFeature = "Fast Cooling, Inverter Compressor, Remote Controlled" ;
    static String dimensions;
    static String voltages ="220 volts";
    static String color ;
    static String components ;
	
	
	
	
  public static void main(String[] args) {
	  
	// price = 43490;
	// brand = "LG";
    // capacity = "1.5 Tons";
	// coolingPower = "5 KW";
	// specialFeature = "Auto Clean, Fast Cooling, Inverter Compressor, Remote Controlled, WiFi Enabled";
    // dimensions = "21D x 99.8W x 34.5H Centimeters";
	// voltages = "230 Volts";
	// color = "white";
	// components = "1 Indoor Unit, 1 Outdoor Unit, Inter Connecting Copper Pipe of 3 meters length, Remote Control, 2 Batteries, User manual";


	int price = 43490;
    String brand = "LG";
	String capacity = "1.5 Tons";
    String coolingPower = "5 KW";
    String specialFeature = "Auto Clean, Fast Cooling, Inverter Compressor, Remote Controlled, WiFi Enabled";
    String dimensions = "21D x 99.8W x 34.5H Centimeters";
    String voltages = "230 Volts";
    String color = "white";
    String components = "1 Indoor Unit, 1 Outdoor Unit, Inter Connecting Copper Pipe of 3 meters length, Remote Control, 2 Batteries, User manual";

    System.out.println("The price is : " + price); 
    System.out.println("The brand is : " + brand);
    System.out.println("The capacity is : " + capacity);
    System.out.println("The cooling power is : " + coolingPower);
    System.out.println("The special features are : " + specialFeature);
    System.out.println("The dimension is : " + dimensions);
	System.out.println("The voltage is : " + voltages);
    System.out.println("The color is : " + color);
    System.out.println("The components it includes are : " + components);
	
	
	
	System.out.println("The price is : " + AirCooler.price); 
    System.out.println("The brand is : " + AirCooler.brand);
    System.out.println("The capacity is : " + AirCooler.capacity);
    System.out.println("The cooling power is : " + AirCooler.coolingPower);
    System.out.println("The special features are : " + AirCooler.specialFeature);
    System.out.println("The dimension is : " + AirCooler.dimensions);
	System.out.println("The voltage is : " + AirCooler.voltages);
    System.out.println("The color is : " + AirCooler.color);
    System.out.println("The components it includes are : " + AirCooler.components);
    }
}
