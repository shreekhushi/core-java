class Wallet{
	
	String brand;
	String material;
	String color;
	String type;
	String closureType;
	int numberOfCompartmnts;
	double price;
	int quantity;
	
	Wallet(String b, String m, String c, String t, String ct, int nc, double p, int q){
		brand = b;
		material = m;
		color = c;
		type = t;
		closureType = ct;
		numberOfCompartmnts = nc;
		price = p;
		quantity = q;
		
	}
	
	public void displayDetails(){
		System.out.println("The brand of wallet is: " + brand);
        System.out.println("The material of wallet is: " + material);
        System.out.println("The color of wallet is: " + color);
        System.out.println("The type of wallet is: " + type);
        System.out.println("The closure type is: " + closureType);
        System.out.println("The comedicinepartmedicineents are: " + numberOfCompartmnts);
        System.out.println("The price is: " + price);
        System.out.println("The quantity is: " + quantity);
	}
	
}