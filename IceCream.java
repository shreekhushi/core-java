class IceCream{
	int iceCreamId;
	String brand;
	int price;
	Flavour flavour;
	
	public void getIceCreamDetails(){
		System.out.println("getIceCreamDetails invoked");
		System.out.println("the ice cream id is: " +iceCreamId);
		System.out.println("the brand is: " +brand);
		System.out.println("the price is: " +price);
		flavour.getFlavourDetails();
		System.out.println("getIceCreamDetails ended");
	}
	
	IceCream(int iceCreamId, String brand, int price, Flavour flavour){
		this.iceCreamId = iceCreamId;
		this.brand = brand;
		this.price = price;
		this.flavour = flavour;
	}
	
	IceCream(){
		
	}
	
	public boolean createFlavour(Flavour flavour){
		this.flavour = flavour;
		return true;
	}
}