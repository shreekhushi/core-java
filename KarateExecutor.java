class KarateExecutor{
	
	public static void main(String[] k){
		
		Karate karateOne = new Karate();
		karateOne.studentId = 1;
		karateOne.studentName = "Rahul";
		karateOne.beltLevel = "White";
		karateOne.age = 10;
		karateOne.trainerName = "Sensei Raj";
		
		Karate karateTwo = new Karate();
		karateTwo.studentId = 2;
		karateTwo.studentName = "Amit";
		karateTwo.beltLevel = "Yellow";
		karateTwo.age = 12;
		karateTwo.trainerName = "Sensei Raj";
		
		Karate karateThree = new Karate();
		karateThree.studentId = 3;
		karateThree.studentName = "Sneha";
		karateThree.beltLevel = "Orange";
		karateThree.age = 11;
		karateThree.trainerName = "Sensei Arjun";
		
		Karate karateFour = new Karate();
		karateFour.studentId = 4;
		karateFour.studentName = "Kiran";
		karateFour.beltLevel = "Green";
		karateFour.age = 13;
		karateFour.trainerName = "Sensei Arjun";
		
		Karate karateFive = new Karate();
		karateFive.studentId = 5;
		karateFive.studentName = "Anjali";
		karateFive.beltLevel = "Blue";
		karateFive.age = 14;
		karateFive.trainerName = "Sensei Meena";
		
		Karate karateSix = new Karate();
		karateSix.studentId = 6;
		karateSix.studentName = "Ravi";
		karateSix.beltLevel = "Brown";
		karateSix.age = 15;
		karateSix.trainerName = "Sensei Meena";
		
		Karate karateSeven = new Karate();
		karateSeven.studentId = 7;
		karateSeven.studentName = "Priya";
		karateSeven.beltLevel = "Black";
		karateSeven.age = 16;
		karateSeven.trainerName = "Sensei Vikram";
		
		Karate karateEight = new Karate();
		karateEight.studentId = 8;
		karateEight.studentName = "Arjun";
		karateEight.beltLevel = "White";
		karateEight.age = 9;
		karateEight.trainerName = "Sensei Raj";
		
		Karate karateNine = new Karate();
		karateNine.studentId = 9;
		karateNine.studentName = "Meena";
		karateNine.beltLevel = "Yellow";
		karateNine.age = 10;
		karateNine.trainerName = "Sensei Arjun";
		
		Karate karateTen = new Karate();
		karateTen.studentId = 10;
		karateTen.studentName = "Sanjay";
		karateTen.beltLevel = "Orange";
		karateTen.age = 12;
		karateTen.trainerName = "Sensei Meena";
		
		Karate karateEleven = new Karate();
		karateEleven.studentId = 11;
		karateEleven.studentName = "Kavya";
		karateEleven.beltLevel = "Green";
		karateEleven.age = 13;
		karateEleven.trainerName = "Sensei Vikram";
		
		Karate karateTwelve = new Karate();
		karateTwelve.studentId = 12;
		karateTwelve.studentName = "Ramesh";
		karateTwelve.beltLevel = "Blue";
		karateTwelve.age = 14;
		karateTwelve.trainerName = "Sensei Raj";
		
		Karate karateThirteen = new Karate();
		karateThirteen.studentId = 13;
		karateThirteen.studentName = "Pooja";
		karateThirteen.beltLevel = "Brown";
		karateThirteen.age = 15;
		karateThirteen.trainerName = "Sensei Arjun";
		
		Karate karateFourteen = new Karate();
		karateFourteen.studentId = 14;
		karateFourteen.studentName = "Vikram";
		karateFourteen.beltLevel = "Black";
		karateFourteen.age = 17;
		karateFourteen.trainerName = "Sensei Vikram";
		
		Karate karateFifteen = new Karate();
		karateFifteen.studentId = 15;
		karateFifteen.studentName = "Neha";
		karateFifteen.beltLevel = "White";
		karateFifteen.age = 8;
		karateFifteen.trainerName = "Sensei Meena";
		
		
		Karate karate[] = new Karate[15];
		karate[0] = karateOne;
		karate[1] = karateTwo;
		karate[2] = karateThree;
		karate[3] = karateFour;
		karate[4] = karateFive;
		karate[5] = karateSix;
		karate[6] = karateSeven;
		karate[7] = karateEight;
		karate[8] = karateNine;
		karate[9] = karateTen;
		karate[10] = karateEleven;
		karate[11] = karateTwelve;
		karate[12] = karateThirteen;
		karate[13] = karateFourteen;
		karate[14] = karateFifteen;
		
		
		for(Karate details : karate){
			System.out.println(details.studentId);
			System.out.println(details.studentName);
			System.out.println(details.beltLevel);
			System.out.println(details.age);
			System.out.println(details.trainerName);
			System.out.println("---------------");
		}
	}
}