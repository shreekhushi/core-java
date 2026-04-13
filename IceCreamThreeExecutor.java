class IceCreamThreeExecutor{
	public static void main(String[] i){
		Flavour flavour = new Flavour();
		IceCream iceCream = new IceCream(2601,"Amul",50,flavour);
		iceCream.getIceCreamDetails();
	}
}