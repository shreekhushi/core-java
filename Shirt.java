class Shirt {
	    static String materialComposition = "Cotton" ;
        static String sleeveType = "half sleeves" ;
        static String fitType ;
        static String length ;
        static String neckStyle= "collared neck";
        static String countryOfOrigin = "China";
        static String department = "women";
        static String manufacturer;
        static String genericName= "formal shirt";
        static int price = 700 ;
		
    public static void main(String[] args) {
    // price = 689;
	// genericName = "Sweatshirt";
	// manufacturer = "Bangalore";
	// department = "Men";
	// countryOfOrigin = "India";
	// neckStyle = "High Neck" ;
	// length = "Standard Length";
	// fitType = "Tailored";
	// sleeveType = "Loose Sleeve";
	// materialComposition = "Polyester";
	
	
        String materialComposition = "Polyester";
        String sleeveType = "Loose Sleeve";
         String fitType = "Tailored";
         String length = "Standard Length";
        String neckStyle = "High Neck";
         String countryOfOrigin = "India";
         String department = "Men";
         String manufacturer = "Bangalore";
        String genericName = "Sweatshirt";
         int price = 689;

        System.out.println("The shirt material composition is : " + Shirt.materialComposition);
        System.out.println("The sleeve type is : " + Shirt.sleeveType);
        System.out.println("The fit type is : " + Shirt.fitType);
        System.out.println("The shirt length is : " + Shirt.length);
        System.out.println("The neck style is : " + Shirt.neckStyle);
        System.out.println("The shirt is made in : " + Shirt.countryOfOrigin);
        System.out.println("The department is : " + Shirt.department);
        System.out.println("The manufacturer location is : " + Shirt.manufacturer);
        System.out.println("The generic name is : " + Shirt.genericName);
        System.out.println("The price is : " + Shirt.price);
		
		System.out.println("The shirt material composition is : " + materialComposition);
        System.out.println("The sleeve type is : " + sleeveType);
        System.out.println("The fit type is : " + fitType);
        System.out.println("The shirt length is : " + length);
        System.out.println("The neck style is : " + neckStyle);
        System.out.println("The shirt is made in : " + countryOfOrigin);
        System.out.println("The department is : " + department);
        System.out.println("The manufacturer location is : " + manufacturer);
        System.out.println("The generic name is : " + genericName);
        System.out.println("The price is : " + price);
    }
}
