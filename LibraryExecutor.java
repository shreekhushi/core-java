class LibraryExecutor{
	
	public static void main(String[] l){
		
		Library libraryOne = new Library();
		libraryOne.libraryId = 1;
		libraryOne.name = "Central Library";
		libraryOne.location = "Bangalore";
		libraryOne.numberOfBooks = 500 ;
		libraryOne.openingHours = "8 AM to 5 PM";
		
		Library libraryTwo = new Library();
		libraryTwo.libraryId = 2;
		libraryTwo.name = "City Knowledge Hub";
		libraryTwo.location = "Pune";
		libraryTwo.numberOfBooks = 3000 ;
		libraryTwo.openingHours = "5 AM to 5 PM";
		
		Library libraryThree = new Library();
		libraryThree.libraryId = 3;
		libraryThree.name = "Readers Point";
		libraryThree.location = "Mysore";
		libraryThree.numberOfBooks = 5100 ;
		libraryThree.openingHours = "8 AM to 4 PM";
		
		Library libraryFour = new Library();
		libraryFour.libraryId = 4;
		libraryFour.name = "Wisdom Library";
		libraryFour.location = "Hyderabad";
		libraryFour.numberOfBooks = 5200 ;
		libraryFour.openingHours = "7AM to 5 PM";
		
		Library libraryFive = new Library();
		libraryFive.libraryId = 1;
		libraryFive.name = "Book Haven";
		libraryFive.location = "Delhi";
		libraryFive.numberOfBooks = 5300 ;
		libraryFive.openingHours = "4 AM to 6 PM";
		
		Library librarySix = new Library();
		librarySix.libraryId = 1;
		librarySix.name = "Infinity Library";
		librarySix.location = "Mumbai";
		librarySix.numberOfBooks = 5400 ;
		librarySix.openingHours = "8 AM to 5 PM";
		
		Library librarySeven = new Library();
		librarySeven.libraryId = 1;
		librarySeven.name = "Elite Reading Room";
		librarySeven.location = "Pune";
		librarySeven.numberOfBooks = 5500 ;
		librarySeven.openingHours = "4 AM to 5 PM";
		
		Library libraryEight = new Library();
		libraryEight.libraryId = 1;
		libraryEight.name = "Public Study Center";
		libraryEight.location = "Kolkata";
		libraryEight.numberOfBooks = 5600 ;
		libraryEight.openingHours = "5 AM to 6 PM";
		
		Library libraryNine = new Library();
		libraryNine.libraryId = 1;
		libraryNine.name = "Scholars Library";
		libraryNine.location = "Coimbatore";
		libraryNine.numberOfBooks = 5700 ;
		libraryNine.openingHours = "6 AM to 7 PM";
		
		Library libraryTen = new Library();
		libraryTen.libraryId = 1;
		libraryTen.name = "Bright Minds Library";
		libraryTen.location = "Ahmedabad";
		libraryTen.numberOfBooks = 5800 ;
		libraryTen.openingHours = "7 AM to 8 PM";
		
		Library libraryEleven = new Library();
		libraryEleven.libraryId = 1;
		libraryEleven.name = "Urban Library";
		libraryEleven.location = "Jaipur";
		libraryEleven.numberOfBooks = 5900 ;
		libraryEleven.openingHours = "8 AM to 9 PM";
		
		Library libraryTwelve = new Library();
		libraryTwelve.libraryId = 1;
		libraryTwelve.name = "Heritage Library";
		libraryTwelve.location = "Lucknow";
		libraryTwelve.numberOfBooks = 4200 ;
		libraryTwelve.openingHours = "8 AM to  4 PM";
		
		Library libraryThirteen = new Library();
		libraryThirteen.libraryId = 1;
		libraryThirteen.name = "Digital Library Hub";
		libraryThirteen.location = "Bhopal";
		libraryThirteen.numberOfBooks = 15000 ;
		libraryThirteen.openingHours = "6 AM to 6 PM";
		
		Library libraryFourteen = new Library();
		libraryFourteen.libraryId = 14;
		libraryFourteen.name = "Community Library";
		libraryFourteen.location = "Indore";
		libraryFourteen.numberOfBooks = 5050 ;
		libraryFourteen.openingHours = "8 AM to 8 PM";
		
		Library libraryFifteen = new Library();
		libraryFifteen.libraryId = 15;
		libraryFifteen.name = "Open Books Library";
		libraryFifteen.location = "Nagpur";
		libraryFifteen.numberOfBooks = 7500 ;
		libraryFifteen.openingHours = "9 AM to 6 PM";
		
		
		Library library[] = new Library[15];
		library[0] = libraryOne;
		library[1] = libraryTwo;
		library[2] = libraryThree;
		library[3] = libraryFour;
		library[4] = libraryFive;
		library[5] = librarySix;
		library[6] = librarySeven;
		library[7] = libraryEight;
		library[8] = libraryNine;
		library[9] = libraryTen;
		library[10] = libraryEleven;
		library[11] = libraryTwelve;
		library[12] = libraryThirteen;
		library[13] = libraryFourteen;
		library[14] = libraryFifteen;
		
		
		for(Library lib : library){
			System.out.println(lib.libraryId);
			System.out.println(lib.name);
			System.out.println(lib.location);
			System.out.println(lib.numberOfBooks);
			System.out.println(lib.openingHours);
			System.out.println("---------------");
		}
	}
}