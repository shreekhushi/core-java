class DoctorExecutor{
	
	public static void main(String[] d){
		
		Doctor doctorOne = new Doctor();
		doctorOne.doctorId = 1;
		doctorOne.name = "Dr. Rahul";
		doctorOne.specialization = "Cardiologist";
		doctorOne.experience = 10;
		doctorOne.salary = 120000;
		
		Doctor doctorTwo = new Doctor();
		doctorTwo.doctorId = 2;
		doctorTwo.name = "Dr. Amit";
		doctorTwo.specialization = "Dermatologist";
		doctorTwo.experience = 8;
		doctorTwo.salary = 90000;
		
		Doctor doctorThree = new Doctor();
		doctorThree.doctorId = 3;
		doctorThree.name = "Dr. Sneha";
		doctorThree.specialization = "Neurologist";
		doctorThree.experience = 12;
		doctorThree.salary = 150000;
		
		Doctor doctorFour = new Doctor();
		doctorFour.doctorId = 4;
		doctorFour.name = "Dr. Kiran";
		doctorFour.specialization = "Pediatrician";
		doctorFour.experience = 6;
		doctorFour.salary = 80000;
		
		Doctor doctorFive = new Doctor();
		doctorFive.doctorId = 5;
		doctorFive.name = "Dr. Anjali";
		doctorFive.specialization = "Gynecologist";
		doctorFive.experience = 9;
		doctorFive.salary = 110000;
		
		Doctor doctorSix = new Doctor();
		doctorSix.doctorId = 6;
		doctorSix.name = "Dr. Ravi";
		doctorSix.specialization = "Orthopedic";
		doctorSix.experience = 11;
		doctorSix.salary = 130000;
		
		Doctor doctorSeven = new Doctor();
		doctorSeven.doctorId = 7;
		doctorSeven.name = "Dr. Priya";
		doctorSeven.specialization = "ENT Specialist";
		doctorSeven.experience = 7;
		doctorSeven.salary = 85000;
		
		Doctor doctorEight = new Doctor();
		doctorEight.doctorId = 8;
		doctorEight.name = "Dr. Arjun";
		doctorEight.specialization = "Psychiatrist";
		doctorEight.experience = 10;
		doctorEight.salary = 100000;
		
		Doctor doctorNine = new Doctor();
		doctorNine.doctorId = 9;
		doctorNine.name = "Dr. Meena";
		doctorNine.specialization = "Ophthalmologist";
		doctorNine.experience = 5;
		doctorNine.salary = 75000;
		
		Doctor doctorTen = new Doctor();
		doctorTen.doctorId = 10;
		doctorTen.name = "Dr. Sanjay";
		doctorTen.specialization = "General Physician";
		doctorTen.experience = 15;
		doctorTen.salary = 140000;
		
		Doctor doctorEleven = new Doctor();
		doctorEleven.doctorId = 11;
		doctorEleven.name = "Dr. Kavya";
		doctorEleven.specialization = "Oncologist";
		doctorEleven.experience = 13;
		doctorEleven.salary = 160000;
		
		Doctor doctorTwelve = new Doctor();
		doctorTwelve.doctorId = 12;
		doctorTwelve.name = "Dr. Ramesh";
		doctorTwelve.specialization = "Urologist";
		doctorTwelve.experience = 9;
		doctorTwelve.salary = 115000;
		
		Doctor doctorThirteen = new Doctor();
		doctorThirteen.doctorId = 13;
		doctorThirteen.name = "Dr. Pooja";
		doctorThirteen.specialization = "Radiologist";
		doctorThirteen.experience = 8;
		doctorThirteen.salary = 105000;
		
		Doctor doctorFourteen = new Doctor();
		doctorFourteen.doctorId = 14;
		doctorFourteen.name = "Dr. Vikram";
		doctorFourteen.specialization = "Anesthesiologist";
		doctorFourteen.experience = 11;
		doctorFourteen.salary = 125000;
		
		Doctor doctorFifteen = new Doctor();
		doctorFifteen.doctorId = 15;
		doctorFifteen.name = "Dr. Neha";
		doctorFifteen.specialization = "Endocrinologist";
		doctorFifteen.experience = 10;
		doctorFifteen.salary = 135000;
		
		
		Doctor doctor[] = new Doctor[15];
		doctor[0] = doctorOne;
		doctor[1] = doctorTwo;
		doctor[2] = doctorThree;
		doctor[3] = doctorFour;
		doctor[4] = doctorFive;
		doctor[5] = doctorSix;
		doctor[6] = doctorSeven;
		doctor[7] = doctorEight;
		doctor[8] = doctorNine;
		doctor[9] = doctorTen;
		doctor[10] = doctorEleven;
		doctor[11] = doctorTwelve;
		doctor[12] = doctorThirteen;
		doctor[13] = doctorFourteen;
		doctor[14] = doctorFifteen;
		
		
		for(Doctor details : doctor){
			System.out.println(details.doctorId);
			System.out.println(details.name);
			System.out.println(details.specialization);
			System.out.println(details.experience);
			System.out.println(details.salary);
			System.out.println("---------------");
		}
	}
}