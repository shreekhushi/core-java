class Scooter {
	static int price = 110000 ;
	static String manufacturer ="Honda" ;
    static String brand = "Activa";
    static String color ="black" ;
    static String model = "006G" ;
    static String size ;
    static String countryOfOrigin = "Inida";
    static String weight = "110 kg";
    static String features ;
	
  public static void main(String[] args) {
    // price = 129848;
	// manufacturer = "Bajaj Auto Limited";
	// brand = "Chetak";
	// color = "Brooklyn black";
	// model = "‎00GL549V";
	// size = "standard";
	// countryOfOrigin = "India";
	// weight = "129 kg"; 
	// features = "Solid Metal Body ,IP 67 Rated Water Resistance, ARAI Certified Range - 153 km ,Charges 80% in 3 hrs, TFT Touch Display,  Chetak App, Map Navigation, 35 L Bootspace";

	
    int price = 129848;
	String manufacturer = "Bajaj Auto Limited";
    String brand = "Chetak";
    String color = "Brooklyn black";
    String model = "‎00GL549V";
    String size = "standard";
    String countryOfOrigin = "India";
    String weight = "129 kg";
    String features = "Solid Metal Body ,IP 67 Rated Water Resistance, ARAI Certified Range - 153 km ,Charges 80% in 3 hrs, TFT Touch Display,  Chetak App, Map Navigation, 35 L Bootspace";

    System.out.println("The price is : " + price); 
    System.out.println("The manufacturer is : " + manufacturer);
    System.out.println("The brand it belongs to is : " + brand);
    System.out.println("The color is : " + color);
    System.out.println("The model is : " + model);
    System.out.println("The size is : " + size);
	System.out.println("The product is made in is : " + countryOfOrigin);
    System.out.println("The weight is : " + weight);
    System.out.println("The features includes are : " + features);
	
	System.out.println("The price is : " + Scooter.price); 
    System.out.println("The manufacturer is : " + Scooter.manufacturer);
    System.out.println("The brand it belongs to is : " + Scooter.brand);
    System.out.println("The color is : " + Scooter.color);
    System.out.println("The model is : " + Scooter.model);
    System.out.println("The size is : " + Scooter.size);
	System.out.println("The product is made in is : " + Scooter.countryOfOrigin);
    System.out.println("The weight is : " + Scooter.weight);
    System.out.println("The features includes are : " + Scooter.features);
	
    }
}
