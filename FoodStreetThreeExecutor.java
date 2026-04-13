class FoodStreetThreeExecutor{
	public static void main(String[] f){
		Stall stall = new Stall();
		FoodStreet foodStreet = new FoodStreet(701,"VV Puram","Bangalore",stall);
		foodStreet.getFoodStreetDetails();
	}
}