class RunningShoe {
	static int price = 3000;
	static String brand = "Adidas;
    static String closureType ;
    static String HeelType = "flat" ;
    static String waterResistanceLevel = "not water resistant";
    static String style = "sneaker";
    static String outerMaterial = "textile";
    static String countryOfOrigin = "India";
    static String weight ; 
	
  public static void main(String[] args) {
    // price = 2619;
	// brand = "PUMA";
	// closureType = "Lace-up";
	// HeelType = "Flat";
	// waterResistanceLevel = "not water resistant";
	// style = "Sneaker";
	// outerMaterial = "Textile";
	// countryOfOrigin = "Vietnam";
	// weight = "700 g";
	
    int price = 2619;
	String brand = "PUMA";
    String closureType = "Lace-up";
    String HeelType = "Flat";
    String waterResistanceLevel = "not water resistant";
    String style = "Sneaker";
    String outerMaterial = "Textile";
    String countryOfOrigin = "Vietnam";
    String weight = "700 g";

    System.out.println("The price is : " + price); 
    System.out.println("The brand of shoe is : " + brand);
    System.out.println("The closure type is : " + closureType);
    System.out.println("The heel type is : " + HeelType);
    System.out.println("The shoe is : " + waterResistanceLevel);
    System.out.println("The style of shoe is : " + style);
	System.out.println("The outer material is : " + outerMaterial);
    System.out.println("The shoe is made in : " + countryOfOrigin);
    System.out.println("The  weight of shoe is : " + weight);
	
	System.out.println("The price is : " + RunningShoe.price); 
    System.out.println("The brand of shoe is : " + RunningShoe.brand);
    System.out.println("The closure type is : " + RunningShoe.closureType);
    System.out.println("The heel type is : " + RunningShoe.HeelType);
    System.out.println("The shoe is : " + RunningShoe.waterResistanceLevel);
    System.out.println("The style of shoe is : " + RunningShoe.style);
	System.out.println("The outer material is : " + RunningShoe.outerMaterial);
    System.out.println("The shoe is made in : " + RunningShoe.countryOfOrigin);
    System.out.println("The  weight of shoe is : " + RunningShoe.weight);
    }
}
