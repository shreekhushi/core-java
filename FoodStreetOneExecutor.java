class FoodStreetOneExecutor{
	public static void main(String[] f){
		FoodStreet foodStreet = new FoodStreet();
		foodStreet.streetId = 701;
		foodStreet.name = "VV Puram";
		foodStreet.location = "Bangalore";
		
		Stall stall = new Stall();
		stall.stallId = 801;
		stall.stallName = "Dosa Corner";
		stall.cuisineType = "South Indian";
		
		foodStreet.stall = stall;
		
		foodStreet.getFoodStreetDetails();
	}
}