class Lays{
    static String ingredients[] = {"potato powder", "Diglycerol Fatty Acid Ester","Vegetable Oil","Citric Acid",
   "Pre Gelatinized Starch","White Granulated Grains"," Loyalty To The Original Flavo","Yeast Extract"};
  

  public static void main(String[] args){
	  
	getingredients();
	// System.out.println(ingredients[0]+","+ingredients[1]+","+ingredients[2]+","+ingredients[3]+","+ingredients[4]+","+
	// ingredients[5]+","+ingredients[6]+","+ingredients[7]);
  }

   static void getingredients(){
	    System.out.println("The ingredients of lays are:");
		for(String ingredient : ingredients){
			System.out.println(ingredient);
		}
   }

}