class Flower{
	int flowerId;
	String flowerName;
	String color;
	
	public void getFlowerDetails(){
		System.out.println("getFlowerDetails invoked");
		System.out.println("the flower id is: " +flowerId);
		System.out.println("the flower name is: " +flowerName);
		System.out.println("the flower color is: " +color);
		System.out.println("getFlowerDetails ended");
	}
}