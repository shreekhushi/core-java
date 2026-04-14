class DanceExecutor{
	
	public static void main(String[] d){
		
		Dance danceOne = new Dance();
		danceOne.studentId = 1;
		danceOne.studentName = "Rahul";
		danceOne.danceType = "Hip Hop";
		danceOne.age = 12;
		danceOne.instructorName = "Ravi";
		
		Dance danceTwo = new Dance();
		danceTwo.studentId = 2;
		danceTwo.studentName = "Amit";
		danceTwo.danceType = "Classical";
		danceTwo.age = 14;
		danceTwo.instructorName = "Meena";
		
		Dance danceThree = new Dance();
		danceThree.studentId = 3;
		danceThree.studentName = "Sneha";
		danceThree.danceType = "Bharatanatyam";
		danceThree.age = 13;
		danceThree.instructorName = "Anjali";
		
		Dance danceFour = new Dance();
		danceFour.studentId = 4;
		danceFour.studentName = "Kiran";
		danceFour.danceType = "Western";
		danceFour.age = 15;
		danceFour.instructorName = "Arjun";
		
		Dance danceFive = new Dance();
		danceFive.studentId = 5;
		danceFive.studentName = "Anjali";
		danceFive.danceType = "Kathak";
		danceFive.age = 16;
		danceFive.instructorName = "Meena";
		
		Dance danceSix = new Dance();
		danceSix.studentId = 6;
		danceSix.studentName = "Ravi";
		danceSix.danceType = "Folk";
		danceSix.age = 11;
		danceSix.instructorName = "Ravi";
		
		Dance danceSeven = new Dance();
		danceSeven.studentId = 7;
		danceSeven.studentName = "Priya";
		danceSeven.danceType = "Hip Hop";
		danceSeven.age = 10;
		danceSeven.instructorName = "Arjun";
		
		Dance danceEight = new Dance();
		danceEight.studentId = 8;
		danceEight.studentName = "Arjun";
		danceEight.danceType = "Contemporary";
		danceEight.age = 14;
		danceEight.instructorName = "Anjali";
		
		Dance danceNine = new Dance();
		danceNine.studentId = 9;
		danceNine.studentName = "Meena";
		danceNine.danceType = "Classical";
		danceNine.age = 13;
		danceNine.instructorName = "Meena";
		
		Dance danceTen = new Dance();
		danceTen.studentId = 10;
		danceTen.studentName = "Sanjay";
		danceTen.danceType = "Western";
		danceTen.age = 15;
		danceTen.instructorName = "Ravi";
		
		Dance danceEleven = new Dance();
		danceEleven.studentId = 11;
		danceEleven.studentName = "Kavya";
		danceEleven.danceType = "Bharatanatyam";
		danceEleven.age = 12;
		danceEleven.instructorName = "Anjali";
		
		Dance danceTwelve = new Dance();
		danceTwelve.studentId = 12;
		danceTwelve.studentName = "Ramesh";
		danceTwelve.danceType = "Folk";
		danceTwelve.age = 11;
		danceTwelve.instructorName = "Arjun";
		
		Dance danceThirteen = new Dance();
		danceThirteen.studentId = 13;
		danceThirteen.studentName = "Pooja";
		danceThirteen.danceType = "Kathak";
		danceThirteen.age = 14;
		danceThirteen.instructorName = "Meena";
		
		Dance danceFourteen = new Dance();
		danceFourteen.studentId = 14;
		danceFourteen.studentName = "Vikram";
		danceFourteen.danceType = "Contemporary";
		danceFourteen.age = 16;
		danceFourteen.instructorName = "Ravi";
		
		Dance danceFifteen = new Dance();
		danceFifteen.studentId = 15;
		danceFifteen.studentName = "Neha";
		danceFifteen.danceType = "Hip Hop";
		danceFifteen.age = 10;
		danceFifteen.instructorName = "Anjali";
		
		
		Dance dance[] = new Dance[15];
		dance[0] = danceOne;
		dance[1] = danceTwo;
		dance[2] = danceThree;
		dance[3] = danceFour;
		dance[4] = danceFive;
		dance[5] = danceSix;
		dance[6] = danceSeven;
		dance[7] = danceEight;
		dance[8] = danceNine;
		dance[9] = danceTen;
		dance[10] = danceEleven;
		dance[11] = danceTwelve;
		dance[12] = danceThirteen;
		dance[13] = danceFourteen;
		dance[14] = danceFifteen;
		
		
		for(Dance details : dance){
			System.out.println(details.studentId);
			System.out.println(details.studentName);
			System.out.println(details.danceType);
			System.out.println(details.age);
			System.out.println(details.instructorName);
			System.out.println("---------------");
		}
	}
}