class Bindhi{
	
	String color;
	String shape;
	String size;
	String material;
	String pattern;
	String design;
	String occasion;
	double price;
	
	Bindhi(String c, String sh, String s, String m, String pt , String d, String o, double p){
		color = c;
		shape = sh;
		size = s;
		material =m;
		pattern = pt;
		design = d;
		occasion = o;
		price = p;
	}
	public void displayDetails(){
		System.out.println("The color of bindhi is:" + color);
		System.out.println("The shape of bindhi is:" + shape);
		System.out.println("The size is:" + size);
		System.out.println("The material is:" + material);
		System.out.println("The pattern of bindhi is:" + pattern);
		System.out.println("The design is:" + design);
		System.out.println("The occasion is:" + occasion);
		System.out.println("The price of bindhi is:" + price);
	}
}