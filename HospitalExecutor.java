class HospitalExecutor{
	
	public static void main(String[] h){
		
		Hospital hospitalOne = new Hospital();
		hospitalOne.hospitalId = 1;
		hospitalOne.name = "City Hospital";
		hospitalOne.location = "Bangalore";
		hospitalOne.numberOfBeds = 100;
		hospitalOne.rating = 4.5;
		
		Hospital hospitalTwo = new Hospital();
		hospitalTwo.hospitalId = 2;
		hospitalTwo.name = "Apollo Hospital";
		hospitalTwo.location = "Chennai";
		hospitalTwo.numberOfBeds = 200;
		hospitalTwo.rating = 4.7;
		
		Hospital hospitalThree = new Hospital();
		hospitalThree.hospitalId = 3;
		hospitalThree.name = "Fortis Hospital";
		hospitalThree.location = "Delhi";
		hospitalThree.numberOfBeds = 150;
		hospitalThree.rating = 4.6;
		
		Hospital hospitalFour = new Hospital();
		hospitalFour.hospitalId = 4;
		hospitalFour.name = "Care Hospital";
		hospitalFour.location = "Hyderabad";
		hospitalFour.numberOfBeds = 180;
		hospitalFour.rating = 4.4;
		
		Hospital hospitalFive = new Hospital();
		hospitalFive.hospitalId = 5;
		hospitalFive.name = "Global Hospital";
		hospitalFive.location = "Mumbai";
		hospitalFive.numberOfBeds = 220;
		hospitalFive.rating = 4.3;
		
		Hospital hospitalSix = new Hospital();
		hospitalSix.hospitalId = 6;
		hospitalSix.name = "Sunrise Hospital";
		hospitalSix.location = "Pune";
		hospitalSix.numberOfBeds = 120;
		hospitalSix.rating = 4.2;
		
		Hospital hospitalSeven = new Hospital();
		hospitalSeven.hospitalId = 7;
		hospitalSeven.name = "Rainbow Hospital";
		hospitalSeven.location = "Kolkata";
		hospitalSeven.numberOfBeds = 140;
		hospitalSeven.rating = 4.1;
		
		Hospital hospitalEight = new Hospital();
		hospitalEight.hospitalId = 8;
		hospitalEight.name = "Metro Hospital";
		hospitalEight.location = "Mysore";
		hospitalEight.numberOfBeds = 110;
		hospitalEight.rating = 4.0;
		
		Hospital hospitalNine = new Hospital();
		hospitalNine.hospitalId = 9;
		hospitalNine.name = "LifeCare Hospital";
		hospitalNine.location = "Coimbatore";
		hospitalNine.numberOfBeds = 130;
		hospitalNine.rating = 4.2;
		
		Hospital hospitalTen = new Hospital();
		hospitalTen.hospitalId = 10;
		hospitalTen.name = "Healing Touch Hospital";
		hospitalTen.location = "Ahmedabad";
		hospitalTen.numberOfBeds = 160;
		hospitalTen.rating = 4.3;
		
		Hospital hospitalEleven = new Hospital();
		hospitalEleven.hospitalId = 11;
		hospitalEleven.name = "Green Valley Hospital";
		hospitalEleven.location = "Jaipur";
		hospitalEleven.numberOfBeds = 125;
		hospitalEleven.rating = 4.1;
		
		Hospital hospitalTwelve = new Hospital();
		hospitalTwelve.hospitalId = 12;
		hospitalTwelve.name = "Prime Hospital";
		hospitalTwelve.location = "Lucknow";
		hospitalTwelve.numberOfBeds = 170;
		hospitalTwelve.rating = 4.4;
		
		Hospital hospitalThirteen = new Hospital();
		hospitalThirteen.hospitalId = 13;
		hospitalThirteen.name = "Wellness Hospital";
		hospitalThirteen.location = "Indore";
		hospitalThirteen.numberOfBeds = 140;
		hospitalThirteen.rating = 4.2;
		
		Hospital hospitalFourteen = new Hospital();
		hospitalFourteen.hospitalId = 14;
		hospitalFourteen.name = "Medicare Hospital";
		hospitalFourteen.location = "Bhopal";
		hospitalFourteen.numberOfBeds = 150;
		hospitalFourteen.rating = 4.3;
		
		Hospital hospitalFifteen = new Hospital();
		hospitalFifteen.hospitalId = 15;
		hospitalFifteen.name = "Trust Hospital";
		hospitalFifteen.location = "Nagpur";
		hospitalFifteen.numberOfBeds = 180;
		hospitalFifteen.rating = 4.5;
		
		
		Hospital hospital[] = new Hospital[15];
		hospital[0] = hospitalOne;
		hospital[1] = hospitalTwo;
		hospital[2] = hospitalThree;
		hospital[3] = hospitalFour;
		hospital[4] = hospitalFive;
		hospital[5] = hospitalSix;
		hospital[6] = hospitalSeven;
		hospital[7] = hospitalEight;
		hospital[8] = hospitalNine;
		hospital[9] = hospitalTen;
		hospital[10] = hospitalEleven;
		hospital[11] = hospitalTwelve;
		hospital[12] = hospitalThirteen;
		hospital[13] = hospitalFourteen;
		hospital[14] = hospitalFifteen;
		
		
		for(Hospital details : hospital){
			System.out.println(details.hospitalId);
			System.out.println(details.name);
			System.out.println(details.location);
			System.out.println(details.numberOfBeds);
			System.out.println(details.rating);
			System.out.println("---------------");
		}
	}
}