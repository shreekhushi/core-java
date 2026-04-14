class RestaurantExecutor{
	
	public static void main(String[] r){
		
		Restaurant restaurantOne = new Restaurant();
		restaurantOne.restaurantId = 1;
		restaurantOne.name = "Spice Garden";
		restaurantOne.cuisine = "Indian";
		restaurantOne.rating = 4.5;
		restaurantOne.location = "Bangalore";
		
		Restaurant restaurantTwo = new Restaurant();
		restaurantTwo.restaurantId = 2;
		restaurantTwo.name = "Dragon Palace";
		restaurantTwo.cuisine = "Chinese";
		restaurantTwo.rating = 4.2;
		restaurantTwo.location = "Chennai";
		
		Restaurant restaurantThree = new Restaurant();
		restaurantThree.restaurantId = 3;
		restaurantThree.name = "Pizza Hub";
		restaurantThree.cuisine = "Italian";
		restaurantThree.rating = 4.3;
		restaurantThree.location = "Mumbai";
		
		Restaurant restaurantFour = new Restaurant();
		restaurantFour.restaurantId = 4;
		restaurantFour.name = "Burger Town";
		restaurantFour.cuisine = "Fast Food";
		restaurantFour.rating = 4.1;
		restaurantFour.location = "Delhi";
		
		Restaurant restaurantFive = new Restaurant();
		restaurantFive.restaurantId = 5;
		restaurantFive.name = "Biryani House";
		restaurantFive.cuisine = "Hyderabadi";
		restaurantFive.rating = 4.6;
		restaurantFive.location = "Hyderabad";
		
		Restaurant restaurantSix = new Restaurant();
		restaurantSix.restaurantId = 6;
		restaurantSix.name = "Tandoori Treat";
		restaurantSix.cuisine = "North Indian";
		restaurantSix.rating = 4.4;
		restaurantSix.location = "Pune";
		
		Restaurant restaurantSeven = new Restaurant();
		restaurantSeven.restaurantId = 7;
		restaurantSeven.name = "Sea Food Bay";
		restaurantSeven.cuisine = "Seafood";
		restaurantSeven.rating = 4.2;
		restaurantSeven.location = "Kolkata";
		
		Restaurant restaurantEight = new Restaurant();
		restaurantEight.restaurantId = 8;
		restaurantEight.name = "Green Bowl";
		restaurantEight.cuisine = "Vegetarian";
		restaurantEight.rating = 4.3;
		restaurantEight.location = "Mysore";
		
		Restaurant restaurantNine = new Restaurant();
		restaurantNine.restaurantId = 9;
		restaurantNine.name = "BBQ Nation";
		restaurantNine.cuisine = "Barbecue";
		restaurantNine.rating = 4.7;
		restaurantNine.location = "Ahmedabad";
		
		Restaurant restaurantTen = new Restaurant();
		restaurantTen.restaurantId = 10;
		restaurantTen.name = "Cafe Delight";
		restaurantTen.cuisine = "Cafe";
		restaurantTen.rating = 4.0;
		restaurantTen.location = "Jaipur";
		
		Restaurant restaurantEleven = new Restaurant();
		restaurantEleven.restaurantId = 11;
		restaurantEleven.name = "Royal Dine";
		restaurantEleven.cuisine = "Mughlai";
		restaurantEleven.rating = 4.5;
		restaurantEleven.location = "Lucknow";
		
		Restaurant restaurantTwelve = new Restaurant();
		restaurantTwelve.restaurantId = 12;
		restaurantTwelve.name = "South Spice";
		restaurantTwelve.cuisine = "South Indian";
		restaurantTwelve.rating = 4.4;
		restaurantTwelve.location = "Indore";
		
		Restaurant restaurantThirteen = new Restaurant();
		restaurantThirteen.restaurantId = 13;
		restaurantThirteen.name = "Urban Kitchen";
		restaurantThirteen.cuisine = "Continental";
		restaurantThirteen.rating = 4.3;
		restaurantThirteen.location = "Bhopal";
		
		Restaurant restaurantFourteen = new Restaurant();
		restaurantFourteen.restaurantId = 14;
		restaurantFourteen.name = "Food Fiesta";
		restaurantFourteen.cuisine = "Multi-Cuisine";
		restaurantFourteen.rating = 4.6;
		restaurantFourteen.location = "Nagpur";
		
		Restaurant restaurantFifteen = new Restaurant();
		restaurantFifteen.restaurantId = 15;
		restaurantFifteen.name = "Taste Corner";
		restaurantFifteen.cuisine = "Street Food";
		restaurantFifteen.rating = 4.2;
		restaurantFifteen.location = "Coimbatore";
		
		
		Restaurant restaurant[] = new Restaurant[15];
		restaurant[0] = restaurantOne;
		restaurant[1] = restaurantTwo;
		restaurant[2] = restaurantThree;
		restaurant[3] = restaurantFour;
		restaurant[4] = restaurantFive;
		restaurant[5] = restaurantSix;
		restaurant[6] = restaurantSeven;
		restaurant[7] = restaurantEight;
		restaurant[8] = restaurantNine;
		restaurant[9] = restaurantTen;
		restaurant[10] = restaurantEleven;
		restaurant[11] = restaurantTwelve;
		restaurant[12] = restaurantThirteen;
		restaurant[13] = restaurantFourteen;
		restaurant[14] = restaurantFifteen;
		
		
		for(Restaurant details : restaurant){
			System.out.println(details.restaurantId);
			System.out.println(details.name);
			System.out.println(details.cuisine);
			System.out.println(details.rating);
			System.out.println(details.location);
			System.out.println("---------------");
		}
	}
}