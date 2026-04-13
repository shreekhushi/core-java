class IceCreamOneExecutor{
	public static void main(String[] i){
		IceCream iceCream = new IceCream();
		iceCream.iceCreamId = 2601;
		iceCream.brand = "Amul";
		iceCream.price = 50;
		
		Flavour flavour = new Flavour();
		flavour.flavourId = 2701;
		flavour.flavourName = "Chocolate";
		flavour.sweetnessLevel = "High";
		
		iceCream.flavour = flavour;
		
		iceCream.getIceCreamDetails();
	}
}