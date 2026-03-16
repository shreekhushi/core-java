class Jacket {
	
    static int price = 5000;
	static String material= "jeans" ;
    static String style = "normal";
    static String fitType ;
    static String length ="30 Inch" ;
    static String neckStyle ="Collared neck" ;
    static String pattern ;
    static String countryOfOrigin = "China";
    static String ASIN ;
	
  public static void main(String[] args) {

    // price = 2347;
	// material = "Faux Leather";
	// style = "Biker jacket";
	// fitType = "Slim";
	// length = "27 Inch";
	// neckStyle = "Collared Neck";
	// pattern = "Regular jacket";
	// countryOfOrigin = "India";
	// ASIN = "B07R58S5T5";
	
	
	
	
    int price = 2347;
	String material = "Faux Leather";
    String style = "Biker jacket";
    String fitType = "Slim";
    String length = "27 Inch";
    String neckStyle = "Collared Neck";
    String pattern = "Regular jacket";
    String countryOfOrigin = "India";
    String ASIN = "B07R58S5T5";

    System.out.println("The price is : " + price); 
    System.out.println("The material of jacket is : " + material);
    System.out.println("The style type is : " + style);
    System.out.println("The fit type is : " + fitType);
    System.out.println("The lenght of jacket is : " + length);
    System.out.println("The nect style is is : " + neckStyle);
	System.out.println("The pattern has : " + pattern);
    System.out.println("The jacket is made in is : " + countryOfOrigin);
    System.out.println("It ASIN is : " + ASIN);
	
	 System.out.println("The price is : " + Jacket.price); 
    System.out.println("The material of jacket is : " + Jacket.material);
    System.out.println("The style type is : " + Jacket.style);
    System.out.println("The fit type is : " + Jacket.fitType);
    System.out.println("The lenght of jacket is : " + Jacket.length);
    System.out.println("The nect style is is : " + Jacket.neckStyle);
	System.out.println("The pattern has : " + Jacket.pattern);
    System.out.println("The jacket is made in is : " + Jacket.countryOfOrigin);
    System.out.println("It ASIN is : " + Jacket.ASIN);
    }
}
