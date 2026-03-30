class Vase {

        String material;
        String color;
        String shape;
        double height;
        String brand;
        String usage;
        String design;
        double price;
		
		Vase(String m, String c, String s, double h, String b, String u, String d, double p){
			material = m;
			color = c;
			shape = s;
			height = h;
			brand = b;
			usage = u;
			design = d;
			price = p;
		}
		
		public void displayDetails(){
		System.out.println(" Material: " + material);
        System.out.println(" Color: " + color);
        System.out.println(" Shape: " + shape);
        System.out.println(" Height: " + height);
        System.out.println(" Brand: " + brand);
        System.out.println(" Usage: " + usage);
        System.out.println(" Design: " + design);
        System.out.println(" Price: " + price);

    
	}
}
