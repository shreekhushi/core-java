class Kajal {

        String brand;
        String color;
        String type;
        String waterproof;
        String smudgeProof;
        String ingredients;
        double price;
        String expiryDate;
		
		Kajal(String b, String c, String t, String wp, String sp, String i, double p, String ed){
			brand = b;
			color = c;
			type = t;
			waterproof=wp;
			smudgeProof = sp;
			ingredients = i;
			price = p;
			expiryDate =ed;
		}
		
		public void displayDetails(){
		    System.out.println(" Brand: " + brand);
            System.out.println(" Color: " + color);
            System.out.println(" Type: " + type);
            System.out.println(" Waterproof: " + waterproof);
            System.out.println(" SmudgeProof: " + smudgeProof);
            System.out.println(" Ingredients: " + ingredients);
            System.out.println(" Price: " + price);
            System.out.println(" Expiry: " + expiryDate);
		}
}