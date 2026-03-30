class LipStick{
	
	String brand;
	String color;
	String itemForm;
	String finishType;
	boolean isTransferable;
	int itemWeight;
	int netQuantity;
	String countryOfOrigin;
	
	LipStick(String b, String c, String i, String ft, boolean t, int iw, int nq, String co){
		brand = b;
		color = c;
		itemForm = i;
		finishType = ft;
		isTransferable = t;
		itemWeight = iw;
		netQuantity = nq;
		countryOfOrigin = co;
	}
	
	public void displayDetails(){
		System.out.println("The Brand is: " + brand);
        System.out.println("Color: " + color);
        System.out.println("item form: " + itemForm);
        System.out.println("Finsih Type: " + finishType);
        System.out.println("Is Water Proof: " + isTransferable);
        System.out.println("item Weight: " + itemWeight);
        System.out.println("Net Quantity: " + netQuantity);
        System.out.println("Country of Origin: " + countryOfOrigin);
	}
	
}
