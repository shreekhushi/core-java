class Jeans{

    String brand;
	String fitType;
	String color;
	int waistSize;
	boolean isStretchable;
	boolean isFaded;
	double price;
	
	Jeans(String b, String ft, String c, int w, boolean s, boolean f, double p){
		brand = b;
		fitType = ft;
		color = c;
		waistSize = w;
		isStretchable = s;
		isFaded = f;
		price = p;
	}
	
	public void displayDetails(){
		System.out.println("Brand: "+ brand);
        System.out.println("Fit Type: "+ fitType);
        System.out.println("Color: "+ color);
        System.out.println("Waist Size: "+ waistSize);
        System.out.println("Stretchable: "+ isStretchable);
        System.out.println("Faded: "+ isFaded);
        System.out.println("Price: "+ price);
	}
}