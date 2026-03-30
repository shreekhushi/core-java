class HairDryerExecutor{
   
   public static void main(String[] args){
   
    HairDryer h1 = new HairDryer();
    HairDryer h2 = new HairDryer("Philips");
    HairDryer h3 = new HairDryer("Panasonic", 1200);
    HairDryer h4 = new HairDryer("Dyson", 1500, "Black");
    HairDryer h5 = new HairDryer("Nova", 1000, "Pink", "Cool");
    HairDryer h6 = new HairDryer("Havells", 1800, "White", "Hot", 2500);

    h1.display(); 
	h2.display();
	h3.display();
    h4.display(); 
	h5.display(); 
	h6.display();
   }
}