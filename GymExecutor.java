class GymExecutor{
	
	public static void main(String[] g){
		
		Gym gymOne = new Gym();
		gymOne.gymId = 1;
		gymOne.name = "Power Hous Gym";
		gymOne.location = "Bangalore";
		gymOne.membershipFee = 500 ;
		gymOne.trainerName = "mokshitha";
		
		Gym gymTwo = new Gym();
		gymTwo.gymId = 2;
		gymTwo.name = "FitZone Hub";
		gymTwo.location = "Pune";
		gymTwo.membershipFee = 3000 ;
		gymTwo.trainerName = "priya";
		
		Gym gymThree = new Gym();
		gymThree.gymId = 3;
		gymThree.name = "Muscle Factory";
		gymThree.location = "Mysore";
		gymThree.membershipFee = 5100 ;
		gymThree.trainerName = "pooja";
		
		Gym gymFour = new Gym();
		gymFour.gymId = 4;
		gymFour.name = "Iron Paradise";
		gymFour.location = "Hyderabad";
		gymFour.membershipFee = 5200 ;
		gymFour.trainerName = "kavana";
		
		Gym gymFive = new Gym();
		gymFive.gymId = 1;
		gymFive.name = "Fitness Hub";
		gymFive.location = "Delhi";
		gymFive.membershipFee = 5300 ;
		gymFive.trainerName = "jeevan";
		
		Gym gymSix = new Gym();
		gymSix.gymId = 1;
		gymSix.name = "Beast Mode Gym";
		gymSix.location = "Mumbai";
		gymSix.membershipFee = 5400 ;
		gymSix.trainerName = "sahal";
		
		Gym gymSeven = new Gym();
		gymSeven.gymId = 1;
		gymSeven.name = "StrongLife Gym";
		gymSeven.location = "Pune";
		gymSeven.membershipFee = 5500 ;
		gymSeven.trainerName = "monika";
		
		Gym gymEight = new Gym();
		gymEight.gymId = 1;
		gymEight.name = "Elite Fitness Center";
		gymEight.location = "Kolkata";
		gymEight.membershipFee = 5600 ;
		gymEight.trainerName = "siri";
		
		Gym gymNine = new Gym();
		gymNine.gymId = 1;
		gymNine.name = "ShapeUp Gym";
		gymNine.location = "Coimbatore";
		gymNine.membershipFee = 5700 ;
		gymNine.trainerName = "shreyaa";
		
		Gym gymTen = new Gym();
		gymTen.gymId = 1;
		gymTen.name = "Core Fitness";
		gymTen.location = "Ahmedabad";
		gymTen.membershipFee = 5800 ;
		gymTen.trainerName = "shradha";
		
		Gym gymEleven = new Gym();
		gymEleven.gymId = 1;
		gymEleven.name = "Flex Gym";
		gymEleven.location = "Jaipur";
		gymEleven.membershipFee = 5900 ;
		gymEleven.trainerName = "jyothi";
		
		Gym gymTwelve = new Gym();
		gymTwelve.gymId = 1;
		gymTwelve.name = "ProFit Gym";
		gymTwelve.location = "Lucknow";
		gymTwelve.membershipFee = 4200 ;
		gymTwelve.trainerName = "shree";
		
		Gym gymThirteen = new Gym();
		gymThirteen.gymId = 1;
		gymThirteen.name = "Titan Fitness";
		gymThirteen.location = "Bhopal";
		gymThirteen.membershipFee = 15000 ;
		gymThirteen.trainerName = "mallikarjun";
		
		Gym gymFourteen = new Gym();
		gymFourteen.gymId = 14;
		gymFourteen.name = "Active Life Gym";
		gymFourteen.location = "Indore";
		gymFourteen.membershipFee = 5050 ;
		gymFourteen.trainerName = "vivek";
		
		Gym gymFifteen = new Gym();
		gymFifteen.gymId = 15;
		gymFifteen.name = "Ultimate Fitness Club";
		gymFifteen.location = "Nagpur";
		gymFifteen.membershipFee = 7500 ;
		gymFifteen.trainerName = "Misha";
		
		
		Gym gym[] = new Gym[15];
		gym[0] = gymOne;
		gym[1] = gymTwo;
		gym[2] = gymThree;
		gym[3] = gymFour;
		gym[4] = gymFive;
		gym[5] = gymSix;
		gym[6] = gymSeven;
		gym[7] = gymEight;
		gym[8] = gymNine;
		gym[9] = gymTen;
		gym[10] = gymEleven;
		gym[11] = gymTwelve;
		gym[12] = gymThirteen;
		gym[13] = gymFourteen;
		gym[14] = gymFifteen;
		
		
		for(Gym details : gym){
			System.out.println(details.gymId);
			System.out.println(details.name);
			System.out.println(details.location);
			System.out.println(details.membershipFee);
			System.out.println(details.trainerName);
			System.out.println("---------------");
		}
	}
}