class Mouse {
	static int price = 600;   
    static String brand = "Zebronics" ;
    static String model ;
    static String color ="Silver";
    static String connectivity ="wireless";
    static String powerSource = "electric";
    static String hardwarePlatform ;
    static String operatingSystem ="windows";
    static String itemWeight ="100 gm" ;
    static String dimensions ;
    static String countryOfOrigin ;
    static String components ;

	
  public static void main(String[] args) {
    
	// price = 399; 
	// brand = "Dell";
	// model = "MS116";
	// color = "Black";
	// connectivity = "Wired";
	// powerSource = "Corded Electric";
	// hardwarePlatform = "PC";
	// operatingSystem = "Linux, Windows 7, Windows XP";
	// itemWeight = "120 g";
	// dimensions = "3 x 7 x 5 cm";
	// countryOfOrigin = "China";
	// components = "Mouse, User Manual";
	
	
    int price = 399;   
    String brand = "Dell";
    String model = "MS116";
    String color = "Black";
    String connectivity = "Wired";
    String powerSource = "Corded Electric";
    String hardwarePlatform = "PC";
    String operatingSystem = "Linux, Windows 7, Windows XP";
    String itemWeight = "120 g";
    String dimensions = "3 x 7 x 5 cm";
    String countryOfOrigin = "China";
    String components = "Mouse, User Manual";

    System.out.println("The price is : " + price);
    System.out.println("The brand is : " + brand);
    System.out.println("The model is : " + model);
    System.out.println("The color is : " + color);
    System.out.println("The connectivity is : " + connectivity);
    System.out.println("The power source is : " + powerSource);
    System.out.println("The hardware platform is : " + hardwarePlatform);
    System.out.println("The operating system supported is : " + operatingSystem);
    System.out.println("The item weight is : " + itemWeight);
    System.out.println("The dimensions are : " + dimensions);
    System.out.println("The country of origin is : " + countryOfOrigin);
    System.out.println("The components included are : " + components);
	
	System.out.println("The price is : " + Mouse.price);
    System.out.println("The brand is : " + Mouse.brand);
    System.out.println("The model is : " + Mouse.model);
    System.out.println("The color is : " + Mouse.color);
    System.out.println("The connectivity is : " + Mouse.connectivity);
    System.out.println("The power source is : " + Mouse.powerSource);
    System.out.println("The hardware platform is : " + Mouse.hardwarePlatform);
    System.out.println("The operating system supported is : " + Mouse.operatingSystem);
    System.out.println("The item weight is : " + Mouse.itemWeight);
    System.out.println("The dimensions are : " + Mouse.dimensions);
    System.out.println("The country of origin is : " + Mouse.countryOfOrigin);
    System.out.println("The components included are : " + Mouse.components);
  }
}
