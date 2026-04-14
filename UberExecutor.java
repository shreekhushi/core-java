class UberExecutor{
	
	public static void main(String[] u){
		
		Uber uberOne = new Uber();
		uberOne.bookingId = 1;
		uberOne.customerName = "Rahul";
		uberOne.pickupLocation = "Bangalore";
		uberOne.dropLocation = "Whitefield";
		uberOne.fare = 250;
		
		Uber uberTwo = new Uber();
		uberTwo.bookingId = 2;
		uberTwo.customerName = "Amit";
		uberTwo.pickupLocation = "Chennai";
		uberTwo.dropLocation = "T Nagar";
		uberTwo.fare = 180;
		
		Uber uberThree = new Uber();
		uberThree.bookingId = 3;
		uberThree.customerName = "Sneha";
		uberThree.pickupLocation = "Mumbai";
		uberThree.dropLocation = "Andheri";
		uberThree.fare = 300;
		
		Uber uberFour = new Uber();
		uberFour.bookingId = 4;
		uberFour.customerName = "Kiran";
		uberFour.pickupLocation = "Delhi";
		uberFour.dropLocation = "Noida";
		uberFour.fare = 220;
		
		Uber uberFive = new Uber();
		uberFive.bookingId = 5;
		uberFive.customerName = "Anjali";
		uberFive.pickupLocation = "Hyderabad";
		uberFive.dropLocation = "Gachibowli";
		uberFive.fare = 200;
		
		Uber uberSix = new Uber();
		uberSix.bookingId = 6;
		uberSix.customerName = "Ravi";
		uberSix.pickupLocation = "Pune";
		uberSix.dropLocation = "Hinjewadi";
		uberSix.fare = 260;
		
		Uber uberSeven = new Uber();
		uberSeven.bookingId = 7;
		uberSeven.customerName = "Priya";
		uberSeven.pickupLocation = "Kolkata";
		uberSeven.dropLocation = "Salt Lake";
		uberSeven.fare = 190;
		
		Uber uberEight = new Uber();
		uberEight.bookingId = 8;
		uberEight.customerName = "Arjun";
		uberEight.pickupLocation = "Mysore";
		uberEight.dropLocation = "City Center";
		uberEight.fare = 150;
		
		Uber uberNine = new Uber();
		uberNine.bookingId = 9;
		uberNine.customerName = "Meena";
		uberNine.pickupLocation = "Coimbatore";
		uberNine.dropLocation = "Gandhipuram";
		uberNine.fare = 170;
		
		Uber uberTen = new Uber();
		uberTen.bookingId = 10;
		uberTen.customerName = "Sanjay";
		uberTen.pickupLocation = "Ahmedabad";
		uberTen.dropLocation = "Satellite";
		uberTen.fare = 210;
		
		Uber uberEleven = new Uber();
		uberEleven.bookingId = 11;
		uberEleven.customerName = "Kavya";
		uberEleven.pickupLocation = "Jaipur";
		uberEleven.dropLocation = "Malviya Nagar";
		uberEleven.fare = 230;
		
		Uber uberTwelve = new Uber();
		uberTwelve.bookingId = 12;
		uberTwelve.customerName = "Ramesh";
		uberTwelve.pickupLocation = "Lucknow";
		uberTwelve.dropLocation = "Hazratganj";
		uberTwelve.fare = 180;
		
		Uber uberThirteen = new Uber();
		uberThirteen.bookingId = 13;
		uberThirteen.customerName = "Pooja";
		uberThirteen.pickupLocation = "Indore";
		uberThirteen.dropLocation = "Vijay Nagar";
		uberThirteen.fare = 160;
		
		Uber uberFourteen = new Uber();
		uberFourteen.bookingId = 14;
		uberFourteen.customerName = "Vikram";
		uberFourteen.pickupLocation = "Bhopal";
		uberFourteen.dropLocation = "MP Nagar";
		uberFourteen.fare = 190;
		
		Uber uberFifteen = new Uber();
		uberFifteen.bookingId = 15;
		uberFifteen.customerName = "Neha";
		uberFifteen.pickupLocation = "Nagpur";
		uberFifteen.dropLocation = "Sitabuldi";
		uberFifteen.fare = 175;
		
		
		Uber uber[] = new Uber[15];
		uber[0] = uberOne;
		uber[1] = uberTwo;
		uber[2] = uberThree;
		uber[3] = uberFour;
		uber[4] = uberFive;
		uber[5] = uberSix;
		uber[6] = uberSeven;
		uber[7] = uberEight;
		uber[8] = uberNine;
		uber[9] = uberTen;
		uber[10] = uberEleven;
		uber[11] = uberTwelve;
		uber[12] = uberThirteen;
		uber[13] = uberFourteen;
		uber[14] = uberFifteen;
		
		
		for(Uber details : uber){
			System.out.println(details.bookingId);
			System.out.println(details.customerName);
			System.out.println(details.pickupLocation);
			System.out.println(details.dropLocation);
			System.out.println(details.fare);
			System.out.println("---------------");
		}
	}
}