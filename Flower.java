class Flower {

    String name;
    String color;
    String fragrance;
    int numberOfPetals;
    boolean isSeasonal;
    double price;
    String countryOfOrigin;
	
	Flower(String n, String c, String f, int np, boolean s, double p, String co){
		name = n;
		color = c;
		fragrance = f;
		numberOfPetals = np;
		isSeasonal = s;
		price = p;
		countryOfOrigin = co;
	}
	
	public void displayDetails(){
		System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Number oflower Petals: " + numberOfPetals);
        System.out.println("Is Seasonal: " + isSeasonal);
        System.out.println("Price: " + price);
        System.out.println("Country oflower Origin: " + countryOfOrigin);
	}
}
