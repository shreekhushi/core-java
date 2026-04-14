class FlightExecutor{
	
	public static void main(String[] f){
		
		Flight flightOne = new Flight();
		flightOne.flightId = 1;
		flightOne.airline = "IndiGo";
		flightOne.source = "Bangalore";
		flightOne.destination = "Delhi";
		flightOne.duration = 150;
		
		Flight flightTwo = new Flight();
		flightTwo.flightId = 2;
		flightTwo.airline = "Air India";
		flightTwo.source = "Mumbai";
		flightTwo.destination = "Chennai";
		flightTwo.duration = 120;
		
		Flight flightThree = new Flight();
		flightThree.flightId = 3;
		flightThree.airline = "SpiceJet";
		flightThree.source = "Hyderabad";
		flightThree.destination = "Kolkata";
		flightThree.duration = 140;
		
		Flight flightFour = new Flight();
		flightFour.flightId = 4;
		flightFour.airline = "Vistara";
		flightFour.source = "Delhi";
		flightFour.destination = "Pune";
		flightFour.duration = 130;
		
		Flight flightFive = new Flight();
		flightFive.flightId = 5;
		flightFive.airline = "GoAir";
		flightFive.source = "Chennai";
		flightFive.destination = "Ahmedabad";
		flightFive.duration = 160;
		
		Flight flightSix = new Flight();
		flightSix.flightId = 6;
		flightSix.airline = "IndiGo";
		flightSix.source = "Jaipur";
		flightSix.destination = "Bangalore";
		flightSix.duration = 155;
		
		Flight flightSeven = new Flight();
		flightSeven.flightId = 7;
		flightSeven.airline = "Air India";
		flightSeven.source = "Lucknow";
		flightSeven.destination = "Mumbai";
		flightSeven.duration = 135;
		
		Flight flightEight = new Flight();
		flightEight.flightId = 8;
		flightEight.airline = "SpiceJet";
		flightEight.source = "Nagpur";
		flightEight.destination = "Delhi";
		flightEight.duration = 110;
		
		Flight flightNine = new Flight();
		flightNine.flightId = 9;
		flightNine.airline = "Vistara";
		flightNine.source = "Bhopal";
		flightNine.destination = "Hyderabad";
		flightNine.duration = 125;
		
		Flight flightTen = new Flight();
		flightTen.flightId = 10;
		flightTen.airline = "GoAir";
		flightTen.source = "Indore";
		flightTen.destination = "Chennai";
		flightTen.duration = 145;
		
		Flight flightEleven = new Flight();
		flightEleven.flightId = 11;
		flightEleven.airline = "IndiGo";
		flightEleven.source = "Mysore";
		flightEleven.destination = "Pune";
		flightEleven.duration = 100;
		
		Flight flightTwelve = new Flight();
		flightTwelve.flightId = 12;
		flightTwelve.airline = "Air India";
		flightTwelve.source = "Coimbatore";
		flightTwelve.destination = "Delhi";
		flightTwelve.duration = 170;
		
		Flight flightThirteen = new Flight();
		flightThirteen.flightId = 13;
		flightThirteen.airline = "SpiceJet";
		flightThirteen.source = "Kolkata";
		flightThirteen.destination = "Jaipur";
		flightThirteen.duration = 165;
		
		Flight flightFourteen = new Flight();
		flightFourteen.flightId = 14;
		flightFourteen.airline = "Vistara";
		flightFourteen.source = "Ahmedabad";
		flightFourteen.destination = "Mumbai";
		flightFourteen.duration = 90;
		
		Flight flightFifteen = new Flight();
		flightFifteen.flightId = 15;
		flightFifteen.airline = "GoAir";
		flightFifteen.source = "Delhi";
		flightFifteen.destination = "Bangalore";
		flightFifteen.duration = 150;
		
		
		Flight flight[] = new Flight[15];
		flight[0] = flightOne;
		flight[1] = flightTwo;
		flight[2] = flightThree;
		flight[3] = flightFour;
		flight[4] = flightFive;
		flight[5] = flightSix;
		flight[6] = flightSeven;
		flight[7] = flightEight;
		flight[8] = flightNine;
		flight[9] = flightTen;
		flight[10] = flightEleven;
		flight[11] = flightTwelve;
		flight[12] = flightThirteen;
		flight[13] = flightFourteen;
		flight[14] = flightFifteen;
		
		
		for(Flight details : flight){
			System.out.println(details.flightId);
			System.out.println(details.airline);
			System.out.println(details.source);
			System.out.println(details.destination);
			System.out.println(details.duration);
			System.out.println("---------------");
		}
	}
}