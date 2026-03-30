class Bangle{
	
	String color;
	String material;
	String size;
	String design;
	String pattern;
	String type;
	double price;
	int quantity;
	
	
	Bangle(String c, String m, String s, String d, String pt , String t, double p, int q){
		color = c;
		material = m;
		size = s;
		design = d;
		pattern = pt;
		type = t;
		price = p;
		quantity = q;
	}
	public void displayDetails(){
		System.out.println("The color of bangle is: " + color);
        System.out.println("The material of bangle is: " + material);
        System.out.println("The size of bangle is: " + size);
        System.out.println("The design of bangle is: " + design);
        System.out.println("The pattern of bangle is: " + pattern);
        System.out.println("The type of bangle is: " + type);
        System.out.println("The price of bangle is: " + price);
        System.out.println("The quantity of bangle is: " + quantity);
	}
}