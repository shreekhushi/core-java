class TrolleyBag{
    
	String brand;
	String size;
	String color;
	int numberOfWheels;
	boolean isExpandable;
	boolean hasLock;
	double price;
	
	TrolleyBag(String b, String s, String c, int w, boolean e, boolean l, double p){
		brand = b;
		size = s;
		color = c;
		numberOfWheels = w;
		isExpandable = e;
		hasLock = l;
		price = p;
	}
	
	public void displayDetails(){
		System.out.println("Brand: "+brand);
        System.out.println("Size: "+size);
        System.out.println("Color: "+color);
        System.out.println("Numedicineber of Wheels: "+numberOfWheels);
        System.out.println("Expandable: "+isExpandable);
        System.out.println("Has Lock: "+hasLock);
        System.out.println("Price: "+price);
	}
}