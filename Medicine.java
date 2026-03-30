class Medicine {

    String name;
    String brand;
    String type;          
    int dosageMg;
    boolean isPrescriptionRequired;
    double price;
    String expiryDate;
	
	Medicine(String n, String b, String t, int d, boolean pr, double p, String ed){
		name = n;
		brand = b;
		type = t;
		dosageMg = d;
		isPrescriptionRequired = pr;
		price = p;
		expiryDate = ed;
	}
	
	public void displayDetails(){
		System.out.println("Namedicinee: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Dosage: " + dosageMg + "medicineg");
        System.out.println("Prescription Required: " + isPrescriptionRequired);
        System.out.println("Price: " + price);
        System.out.println("Expiry Date: " + expiryDate);
	}
	
}
