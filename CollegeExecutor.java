class CollegeExecutor{
	
	public static void main(String[] c){
		
		College collegeOne = new College();
		collegeOne.collegeId = 1;
		collegeOne.name = "IIT Delhi";
		collegeOne.location = "Delhi";
		collegeOne.numberOfStudents = 10000;
		collegeOne.ranking = 1;
		
		College collegeTwo = new College();
		collegeTwo.collegeId = 2;
		collegeTwo.name = "IIT Bombay";
		collegeTwo.location = "Mumbai";
		collegeTwo.numberOfStudents = 9000;
		collegeTwo.ranking = 2;
		
		College collegeThree = new College();
		collegeThree.collegeId = 3;
		collegeThree.name = "IIT Madras";
		collegeThree.location = "Chennai";
		collegeThree.numberOfStudents = 8500;
		collegeThree.ranking = 3;
		
		College collegeFour = new College();
		collegeFour.collegeId = 4;
		collegeFour.name = "IIT Kanpur";
		collegeFour.location = "Kanpur";
		collegeFour.numberOfStudents = 8000;
		collegeFour.ranking = 4;
		
		College collegeFive = new College();
		collegeFive.collegeId = 5;
		collegeFive.name = "IIT Kharagpur";
		collegeFive.location = "Kharagpur";
		collegeFive.numberOfStudents = 9500;
		collegeFive.ranking = 5;
		
		College collegeSix = new College();
		collegeSix.collegeId = 6;
		collegeSix.name = "NIT Trichy";
		collegeSix.location = "Trichy";
		collegeSix.numberOfStudents = 7000;
		collegeSix.ranking = 6;
		
		College collegeSeven = new College();
		collegeSeven.collegeId = 7;
		collegeSeven.name = "NIT Surathkal";
		collegeSeven.location = "Mangalore";
		collegeSeven.numberOfStudents = 6500;
		collegeSeven.ranking = 7;
		
		College collegeEight = new College();
		collegeEight.collegeId = 8;
		collegeEight.name = "BITS Pilani";
		collegeEight.location = "Pilani";
		collegeEight.numberOfStudents = 6000;
		collegeEight.ranking = 8;
		
		College collegeNine = new College();
		collegeNine.collegeId = 9;
		collegeNine.name = "VIT";
		collegeNine.location = "Vellore";
		collegeNine.numberOfStudents = 15000;
		collegeNine.ranking = 9;
		
		College collegeTen = new College();
		collegeTen.collegeId = 10;
		collegeTen.name = "SRM";
		collegeTen.location = "Chennai";
		collegeTen.numberOfStudents = 14000;
		collegeTen.ranking = 10;
		
		College collegeEleven = new College();
		collegeEleven.collegeId = 11;
		collegeEleven.name = "Christ University";
		collegeEleven.location = "Bangalore";
		collegeEleven.numberOfStudents = 12000;
		collegeEleven.ranking = 11;
		
		College collegeTwelve = new College();
		collegeTwelve.collegeId = 12;
		collegeTwelve.name = "Jain University";
		collegeTwelve.location = "Bangalore";
		collegeTwelve.numberOfStudents = 11000;
		collegeTwelve.ranking = 12;
		
		College collegeThirteen = new College();
		collegeThirteen.collegeId = 13;
		collegeThirteen.name = "Delhi University";
		collegeThirteen.location = "Delhi";
		collegeThirteen.numberOfStudents = 20000;
		collegeThirteen.ranking = 13;
		
		College collegeFourteen = new College();
		collegeFourteen.collegeId = 14;
		collegeFourteen.name = "Anna University";
		collegeFourteen.location = "Chennai";
		collegeFourteen.numberOfStudents = 18000;
		collegeFourteen.ranking = 14;
		
		College collegeFifteen = new College();
		collegeFifteen.collegeId = 15;
		collegeFifteen.name = "Osmania University";
		collegeFifteen.location = "Hyderabad";
		collegeFifteen.numberOfStudents = 16000;
		collegeFifteen.ranking = 15;
		
		
		College college[] = new College[15];
		college[0] = collegeOne;
		college[1] = collegeTwo;
		college[2] = collegeThree;
		college[3] = collegeFour;
		college[4] = collegeFive;
		college[5] = collegeSix;
		college[6] = collegeSeven;
		college[7] = collegeEight;
		college[8] = collegeNine;
		college[9] = collegeTen;
		college[10] = collegeEleven;
		college[11] = collegeTwelve;
		college[12] = collegeThirteen;
		college[13] = collegeFourteen;
		college[14] = collegeFifteen;
		
		
		for(College details : college){
			System.out.println(details.collegeId);
			System.out.println(details.name);
			System.out.println(details.location);
			System.out.println(details.numberOfStudents);
			System.out.println(details.ranking);
			System.out.println("---------------");
		}
	}
}