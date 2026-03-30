class Anklet{
	
	String materialType;
	String designType;
	String color;
	String brand;
	String style;
	String occasion;
	String gender;
	boolean adjustable;
	
	Anklet(String m , String d, String c, String b, String s, String o, String g, boolean a){
		materialType = m;
		designType = d;
		color = c;
		brand = b;
		style = s;
		occasion = o;
		gender = g;
		adjustable = a;
		
	}
	public void displayDetails(){
		System.out.println("Material: " + materialType);
        System.out.println("Design: " + designType);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Style: " + style);
        System.out.println("Occasion: " + occasion);
        System.out.println("Gender: " + gender);
        System.out.println("Adjustable: " + adjustable);
	}
}