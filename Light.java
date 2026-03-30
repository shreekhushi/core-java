class Light {
	
	String type;
    String color;
    String brand;
    String powerSource;
    String material;
    String switchType;
    boolean rechargeable;
    double wattage;
	
	
	Light(String t, String c, String b, String ps, String m, String st, boolean r, double w){
		type = t;
		color = c;
		brand = b;
		powerSource = ps;
		material = m;
		switchType = st;
		rechargeable = r;
		wattage = w;
	}
	
	public void displayDetails(){
		System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Material: " + material);
        System.out.println("Switch Type: " + switchType);
        System.out.println("Rechargeable: " + rechargeable);
        System.out.println("Wattage: " + wattage);
	}
	
}