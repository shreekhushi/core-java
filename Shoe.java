class Shoe{
	
	String brand;
	String material;
	String closureType;
	String heelType;
	double price;
	String style;
	int quantity;
	String weight;
	
	
	Shoe(String b, String m, String ct, String ht, double p, String s, int q, String w){
		brand = b;
		material = m;
		closureType = ct;
		heelType = ht;
		price = p;
		style = s;
		quantity = q;
		weight = w;
	}
	
	public void displayDetails(){
		System.out.println("The brand of shoe is:" + brand);
		System.out.println("The material of shoe is:" + material);
		System.out.println("The closure type is:" + closureType);
		System.out.println("The heel type is:" + heelType);
		System.out.println("The price of shoe is:" + price);
		System.out.println("The style is:" + style);
		System.out.println("The no of quantity is:" + quantity);
		System.out.println("The weight of shoe is:" + weight);
	}
}