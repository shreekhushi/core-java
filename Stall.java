class Stall{
	int stallId;
	String stallName;
	String cuisineType;
	
	public void getStallDetails(){
		System.out.println("getStallDetails invoked");
		System.out.println("the stall id is: " +stallId);
		System.out.println("the stall name is: " +stallName);
		System.out.println("the cuisine type is: " +cuisineType);
		System.out.println("getStallDetails ended");
	}
}