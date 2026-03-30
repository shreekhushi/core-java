class Goggle{
	
	String brand;
	String frameColor;
	String lensColor;
	String frameMaterial;
	String lensType;
	String shape;
	double price;
	int quantity;
	
	Goggle(String b, String fc, String lc, String fm, String lt, String s, double p, int q){
		brand = b;
		frameColor = fc;
		lensColor = lc;
		frameMaterial = fm;
		lensType = lt;
		shape = s;
		price = p;
		quantity = q;
	}
	
	public void displayDetails(){
		System.out.println("The brand of goggle is: " + brand);
        System.out.println("The framedicinee color is: " + frameColor);
        System.out.println("The lens color is: " + lensColor);
        System.out.println("The frame material is: " + frameMaterial);
        System.out.println("The lens type is: " + lensType);
        System.out.println("The shape is: " + shape);
        System.out.println("The price is: " + price);
        System.out.println("The quantity is: " + quantity);
	}
	
}