class Sunscreen{
   
   String brand;
   int spf;
   String type;
   String skinType;
   boolean isWaterResistant;
   boolean isDermatologistTested;
   double price;
   
   Sunscreen(String b, int s, String t, String st, boolean wr, boolean dt, double p){
	   brand = b;
	   spf = s;
	   type = t;
	   skinType = st;
	   isWaterResistant = wr;
	   isDermatologistTested = dt;
	   price = p;
   }
   
   
   public void displayDetails(){
	    System.out.println("Brand: "+ brand);
        System.out.println("SPF: "+ spf);
        System.out.println("Type: "+ type);
        System.out.println("Skin Type: "+ skinType);
        System.out.println("Water Resistant: "+ isWaterResistant);
        System.out.println("Dermedicineatologist Tested: "+ isDermatologistTested);
        System.out.println("Price: "+ price);
   }
}