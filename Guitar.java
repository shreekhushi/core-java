class Guitar {
	static int price = 8000;
	static String brand = "Fender";
    static String color = "black";
    static String topMaterialType ="Wood";
    static String bodyMaterial ;
    static double scaleLength ;
    static String size  = "‎F280NT";
    static String manufacturer= "Fender India limited"	;
    static String material;
	
  public static void main(String[] args) {
 
    // price = 7299;
	// brand = "Yamaha";
    // color = "Natural";
    // topMaterialType = "Spruce wood";
	// bodyMaterial = "Rosewood";
	// scaleLength = 40.5;
	// size = "‎F280NT";
	// manufacturer = "Yamaha Music India Private Limited";
    // material = "Stainless steel";
 
 
 
 
    int price = 7299;
	String brand = "Yamaha";
    String color = "Natural";
    String topMaterialType = "Spruce wood";
    String bodyMaterial = "Rosewood";
    double scaleLength = 40.5;
    String size = "‎F280NT";
    String manufacturer = "Yamaha Music India Private Limited";
    String material = "Stainless steel";

    System.out.println("The price is : " + price); 
    System.out.println("The material is : " + material);
    System.out.println("The body material is : " + bodyMaterial);
    System.out.println("The color is : " + color);
    System.out.println("The size is : " + size);
    System.out.println("The brand in : " + brand);
	System.out.println("The top mayerial type is : " + topMaterialType);
    System.out.println("The length of scale  is : " + scaleLength);
    System.out.println("manufacturer is  : " + manufacturer );
	
	
	System.out.println("The price is : " + Guitar.price); 
    System.out.println("The material is : " + Guitar.material);
    System.out.println("The body material is : " + Guitar.bodyMaterial);
    System.out.println("The color is : " + Guitar.color);
    System.out.println("The size is : " + Guitar.size);
    System.out.println("The brand in : " + Guitar.brand);
	System.out.println("The top mayerial type is : " + Guitar.topMaterialType);
    System.out.println("The length of scale  is : " + Guitar.scaleLength);
    System.out.println("manufacturer is  : " + Guitar.manufacturer );
    }
}
