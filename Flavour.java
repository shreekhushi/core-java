class Flavour{
	int flavourId;
	String flavourName;
	String sweetnessLevel;
	
	public void getFlavourDetails(){
		System.out.println("getFlavourDetails invoked");
		System.out.println("the flavour id is: " +flavourId);
		System.out.println("the flavour name is: " +flavourName);
		System.out.println("the sweetness level is: " +sweetnessLevel);
		System.out.println("getFlavourDetails ended");
	}
}