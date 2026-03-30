class Bag {

    String brand;
    String type;          
    String color;
    boolean isWaterproof;
    boolean hasLaptopCompartment;
    boolean isLightWeight;
    double price;
	
	Bag(String b, String t, String c, boolean w, boolean lc, boolean lw, double p){
		brand = b;
		type =t;
		color = c;
		isWaterproof = w;
		hasLaptopCompartment = lc;
		isLightWeight = lw;
		price = p;
		
	}
	public void displayDetails(){
		System.out.println("Brand: "+brand);
        System.out.println("Type: "+type);
        System.out.println("Color: "+color);
        System.out.println("Waterproof: "+isWaterproof);
        System.out.println("Laptop Comedicinepartmedicineent: "+hasLaptopCompartment);
        System.out.println("Light Weight: "+isLightWeight);
        System.out.println("Price: "+price);
	}
}