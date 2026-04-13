class IceCreamTwoExecutor{
	public static void main(String[] i){
		IceCream iceCream = new IceCream();
		iceCream.iceCreamId = 2601;
		iceCream.brand = "Amul";
		iceCream.price = 50;
		
		Flavour flavour = new Flavour();
		flavour.flavourId = 2701;
		flavour.flavourName = "Chocolate";
		flavour.sweetnessLevel = "High";
		
		boolean create = iceCream.createFlavour(flavour);
		System.out.println(create);
		
		iceCream.getIceCreamDetails();
	}
}