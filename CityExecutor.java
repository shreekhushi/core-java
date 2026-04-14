class CityExecutor{
	
	public static void main(String[] c){
		
		City cityOne = new City();
		cityOne.cityId = 1;
		cityOne.name = "Bangalore";
		cityOne.state = "Karnataka";
		cityOne.population = 12000000;
		cityOne.area = 741.0;
		
		City cityTwo = new City();
		cityTwo.cityId = 2;
		cityTwo.name = "Mumbai";
		cityTwo.state = "Maharashtra";
		cityTwo.population = 20000000;
		cityTwo.area = 603.4;
		
		City cityThree = new City();
		cityThree.cityId = 3;
		cityThree.name = "Delhi";
		cityThree.state = "Delhi";
		cityThree.population = 19000000;
		cityThree.area = 1484.0;
		
		City cityFour = new City();
		cityFour.cityId = 4;
		cityFour.name = "Chennai";
		cityFour.state = "Tamil Nadu";
		cityFour.population = 11000000;
		cityFour.area = 426.0;
		
		City cityFive = new City();
		cityFive.cityId = 5;
		cityFive.name = "Hyderabad";
		cityFive.state = "Telangana";
		cityFive.population = 10000000;
		cityFive.area = 650.0;
		
		City citySix = new City();
		citySix.cityId = 6;
		citySix.name = "Pune";
		citySix.state = "Maharashtra";
		citySix.population = 7000000;
		citySix.area = 516.0;
		
		City citySeven = new City();
		citySeven.cityId = 7;
		citySeven.name = "Kolkata";
		citySeven.state = "West Bengal";
		citySeven.population = 14000000;
		citySeven.area = 205.0;
		
		City cityEight = new City();
		cityEight.cityId = 8;
		cityEight.name = "Ahmedabad";
		cityEight.state = "Gujarat";
		cityEight.population = 8000000;
		cityEight.area = 464.0;
		
		City cityNine = new City();
		cityNine.cityId = 9;
		cityNine.name = "Jaipur";
		cityNine.state = "Rajasthan";
		cityNine.population = 4000000;
		cityNine.area = 467.0;
		
		City cityTen = new City();
		cityTen.cityId = 10;
		cityTen.name = "Lucknow";
		cityTen.state = "Uttar Pradesh";
		cityTen.population = 3500000;
		cityTen.area = 631.0;
		
		City cityEleven = new City();
		cityEleven.cityId = 11;
		cityEleven.name = "Bhopal";
		cityEleven.state = "Madhya Pradesh";
		cityEleven.population = 2500000;
		cityEleven.area = 285.0;
		
		City cityTwelve = new City();
		cityTwelve.cityId = 12;
		cityTwelve.name = "Indore";
		cityTwelve.state = "Madhya Pradesh";
		cityTwelve.population = 3000000;
		cityTwelve.area = 530.0;
		
		City cityThirteen = new City();
		cityThirteen.cityId = 13;
		cityThirteen.name = "Nagpur";
		cityThirteen.state = "Maharashtra";
		cityThirteen.population = 2800000;
		cityThirteen.area = 227.0;
		
		City cityFourteen = new City();
		cityFourteen.cityId = 14;
		cityFourteen.name = "Mysore";
		cityFourteen.state = "Karnataka";
		cityFourteen.population = 1000000;
		cityFourteen.area = 156.0;
		
		City cityFifteen = new City();
		cityFifteen.cityId = 15;
		cityFifteen.name = "Coimbatore";
		cityFifteen.state = "Tamil Nadu";
		cityFifteen.population = 2200000;
		cityFifteen.area = 246.0;
		
		
		City city[] = new City[15];
		city[0] = cityOne;
		city[1] = cityTwo;
		city[2] = cityThree;
		city[3] = cityFour;
		city[4] = cityFive;
		city[5] = citySix;
		city[6] = citySeven;
		city[7] = cityEight;
		city[8] = cityNine;
		city[9] = cityTen;
		city[10] = cityEleven;
		city[11] = cityTwelve;
		city[12] = cityThirteen;
		city[13] = cityFourteen;
		city[14] = cityFifteen;
		
		
		for(City details : city){
			System.out.println(details.cityId);
			System.out.println(details.name);
			System.out.println(details.state);
			System.out.println(details.population);
			System.out.println(details.area);
			System.out.println("---------------");
		}
	}
}