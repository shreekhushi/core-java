class SwitchBox {

    String brand;
    int numberOfSwitches;
    String material;
    String color;
    boolean hasIndicator;
    boolean isModular;
    double price;
	
	SwitchBox(String b, int s, String mt, String c, boolean i, boolean m, double p){
		brand = b;
		numberOfSwitches = s;
		material = mt;
		color = c;
		hasIndicator = i;
		isModular = m;
		price = p;
	}
	
	
	public void displayDetails(){
		System.out.println("Brand: " + brand);
        System.out.println("Number of Switches: " + numberOfSwitches);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Has Indicator: " + hasIndicator);
        System.out.println("Is Modular: " + isModular);
        System.out.println("Price: " + price);
	}
}
