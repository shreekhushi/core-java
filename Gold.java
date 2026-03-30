class Gold {

    String brand;
    String type;          
    double weight;       
    int purity;           
    boolean isHallmarked;
    double price;
    String countryOfOrigin;
	
	Gold(String b, String t, double w, int p, boolean h, double pr, String co){
		brand = b;
		weight = w;
		type = t;
		purity = p;
		isHallmarked = h;
		price = pr;
		countryOfOrigin = co;
	}
	
	public void displayDetails(){
		System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Purity: " + purity + "K");
        System.out.println("Hallmarked: " + isHallmarked);
        System.out.println("Price: " + price);
        System.out.println("Country of Origin: " + countryOfOrigin);
	}
}
