class FoodStreet{
	int streetId;
	String name;
	String location;
	Stall stall;
	
	public void getFoodStreetDetails(){
		System.out.println("getFoodStreetDetails invoked");
		System.out.println("the street id is: " +streetId);
		System.out.println("the street name is: " +name);
		System.out.println("the location is: " +location);
		stall.getStallDetails();
		System.out.println("getFoodStreetDetails ended");
	}
	
	FoodStreet(int streetId, String name, String location, Stall stall){
		this.streetId = streetId;
		this.name = name;
		this.location = location;
		this.stall = stall;
	}
	
	FoodStreet(){
		
	}
	
	public boolean createStall(Stall stall){
		this.stall = stall;
		return true;
	}
}