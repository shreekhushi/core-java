class StanleyBottle {
	    static int price = 2000 ;
        static String brand = "Pexpo";
        static String material =  "Stainless steel";
        static String color = "black" ;
        static String capacity = "20 fluid ounces";
        static String specialFeature= "rotating";
        static String style = "50 OZ" ;
        static String shape = "Round";
        static String components = " Lid, Straw" ;
		
    public static void main(String[] args) {
    
	// price = 9800;
	// brand = "Stanley";
	// material = "Stainless steel";
	// color = "Orchid";
	// capacity = "40 fluid ounces";
	// specialFeature = "rotating";
	// style = "40 OZ";
	// shape = "Round";
	// components = "Handle, Lid, Straw";
	
	
	
        int price = 9800;
        String brand = "Stanley";
        String material = "Stainless steel";
         String color = "Orchid";
         String capacity = "40 fluid ounces";
         String specialFeature = "rotating";
         String style = "40 OZ";
         String shape = "Round";
         String components = "Handle, Lid, Straw";

		 //local variables
        System.out.println("The price is : " + price);
        System.out.println("The brand is : " + brand);
        System.out.println("The material type is : " + material);
        System.out.println("The color is : " + color);
        System.out.println("The capacity is : " + capacity);
        System.out.println("The special feature is : " + specialFeature);
        System.out.println("The style is : " + style);
        System.out.println("The shape is : " + shape);
        System.out.println("The components are : " + components);
		
		//static variables
		System.out.println("The price is : " + StanleyBottle.price);
        System.out.println("The brand is : " + StanleyBottle.brand);
        System.out.println("The material type is : " + StanleyBottle.material);
        System.out.println("The color is : " + StanleyBottle.color);
        System.out.println("The capacity is : " + StanleyBottle.capacity);
        System.out.println("The special feature is : " + StanleyBottle.specialFeature);
        System.out.println("The style is : " + StanleyBottle.style);
        System.out.println("The shape is : " + StanleyBottle.shape);
        System.out.println("The components are : " + StanleyBottle.components);
    }
}
