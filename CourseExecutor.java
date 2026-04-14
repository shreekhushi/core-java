class CourseExecutor{
	
	public static void main(String[] c){
		
		Course courseOne = new Course();
		courseOne.courseId = 1;
		courseOne.title = "Java Programming";
		courseOne.duration = 60;
		courseOne.fee = 5000;
		courseOne.instructorName = "Rahul";
		
		Course courseTwo = new Course();
		courseTwo.courseId = 2;
		courseTwo.title = "Python Basics";
		courseTwo.duration = 45;
		courseTwo.fee = 4000;
		courseTwo.instructorName = "Amit";
		
		Course courseThree = new Course();
		courseThree.courseId = 3;
		courseThree.title = "Web Development";
		courseThree.duration = 90;
		courseThree.fee = 8000;
		courseThree.instructorName = "Sneha";
		
		Course courseFour = new Course();
		courseFour.courseId = 4;
		courseFour.title = "Data Structures";
		courseFour.duration = 75;
		courseFour.fee = 6000;
		courseFour.instructorName = "Kiran";
		
		Course courseFive = new Course();
		courseFive.courseId = 5;
		courseFive.title = "Machine Learning";
		courseFive.duration = 120;
		courseFive.fee = 10000;
		courseFive.instructorName = "Anjali";
		
		Course courseSix = new Course();
		courseSix.courseId = 6;
		courseSix.title = "Cyber Security";
		courseSix.duration = 80;
		courseSix.fee = 7000;
		courseSix.instructorName = "Ravi";
		
		Course courseSeven = new Course();
		courseSeven.courseId = 7;
		courseSeven.title = "Cloud Computing";
		courseSeven.duration = 85;
		courseSeven.fee = 7500;
		courseSeven.instructorName = "Priya";
		
		Course courseEight = new Course();
		courseEight.courseId = 8;
		courseEight.title = "Android Development";
		courseEight.duration = 95;
		courseEight.fee = 8500;
		courseEight.instructorName = "Arjun";
		
		Course courseNine = new Course();
		courseNine.courseId = 9;
		courseNine.title = "AI Fundamentals";
		courseNine.duration = 110;
		courseNine.fee = 9500;
		courseNine.instructorName = "Meena";
		
		Course courseTen = new Course();
		courseTen.courseId = 10;
		courseTen.title = "React JS";
		courseTen.duration = 70;
		courseTen.fee = 6500;
		courseTen.instructorName = "Sanjay";
		
		Course courseEleven = new Course();
		courseEleven.courseId = 11;
		courseEleven.title = "Node JS";
		courseEleven.duration = 65;
		courseEleven.fee = 6000;
		courseEleven.instructorName = "Kavya";
		
		Course courseTwelve = new Course();
		courseTwelve.courseId = 12;
		courseTwelve.title = "SQL";
		courseTwelve.duration = 40;
		courseTwelve.fee = 3000;
		courseTwelve.instructorName = "Ramesh";
		
		Course courseThirteen = new Course();
		courseThirteen.courseId = 13;
		courseThirteen.title = "UI/UX Design";
		courseThirteen.duration = 55;
		courseThirteen.fee = 5000;
		courseThirteen.instructorName = "Pooja";
		
		Course courseFourteen = new Course();
		courseFourteen.courseId = 14;
		courseFourteen.title = "DevOps";
		courseFourteen.duration = 100;
		courseFourteen.fee = 9000;
		courseFourteen.instructorName = "Vikram";
		
		Course courseFifteen = new Course();
		courseFifteen.courseId = 15;
		courseFifteen.title = "Data Science";
		courseFifteen.duration = 130;
		courseFifteen.fee = 11000;
		courseFifteen.instructorName = "Neha";
		
		
		Course course[] = new Course[15];
		course[0] = courseOne;
		course[1] = courseTwo;
		course[2] = courseThree;
		course[3] = courseFour;
		course[4] = courseFive;
		course[5] = courseSix;
		course[6] = courseSeven;
		course[7] = courseEight;
		course[8] = courseNine;
		course[9] = courseTen;
		course[10] = courseEleven;
		course[11] = courseTwelve;
		course[12] = courseThirteen;
		course[13] = courseFourteen;
		course[14] = courseFifteen;
		
		
		for(Course details : course){
			System.out.println(details.courseId);
			System.out.println(details.title);
			System.out.println(details.duration);
			System.out.println(details.fee);
			System.out.println(details.instructorName);
			System.out.println("---------------");
		}
	}
}