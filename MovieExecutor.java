class MovieExecutor{
	
	public static void main(String[] m){
		
		Movie movieOne = new Movie();
		movieOne.movieId = 1;
		movieOne.title = "Inception";
		movieOne.director = "Christopher Nolan";
		movieOne.duration = 148;
		movieOne.rating = 4.8;
		
		Movie movieTwo = new Movie();
		movieTwo.movieId = 2;
		movieTwo.title = "Interstellar";
		movieTwo.director = "Christopher Nolan";
		movieTwo.duration = 169;
		movieTwo.rating = 4.9;
		
		Movie movieThree = new Movie();
		movieThree.movieId = 3;
		movieThree.title = "Avatar";
		movieThree.director = "James Cameron";
		movieThree.duration = 162;
		movieThree.rating = 4.7;
		
		Movie movieFour = new Movie();
		movieFour.movieId = 4;
		movieFour.title = "Titanic";
		movieFour.director = "James Cameron";
		movieFour.duration = 195;
		movieFour.rating = 4.8;
		
		Movie movieFive = new Movie();
		movieFive.movieId = 5;
		movieFive.title = "RRR";
		movieFive.director = "S.S. Rajamouli";
		movieFive.duration = 182;
		movieFive.rating = 4.6;
		
		Movie movieSix = new Movie();
		movieSix.movieId = 6;
		movieSix.title = "KGF";
		movieSix.director = "Prashanth Neel";
		movieSix.duration = 168;
		movieSix.rating = 4.5;
		
		Movie movieSeven = new Movie();
		movieSeven.movieId = 7;
		movieSeven.title = "Bahubali";
		movieSeven.director = "S.S. Rajamouli";
		movieSeven.duration = 159;
		movieSeven.rating = 4.7;
		
		Movie movieEight = new Movie();
		movieEight.movieId = 8;
		movieEight.title = "Dangal";
		movieEight.director = "Nitesh Tiwari";
		movieEight.duration = 161;
		movieEight.rating = 4.6;
		
		Movie movieNine = new Movie();
		movieNine.movieId = 9;
		movieNine.title = "3 Idiots";
		movieNine.director = "Rajkumar Hirani";
		movieNine.duration = 170;
		movieNine.rating = 4.8;
		
		Movie movieTen = new Movie();
		movieTen.movieId = 10;
		movieTen.title = "Drishyam";
		movieTen.director = "Jeethu Joseph";
		movieTen.duration = 160;
		movieTen.rating = 4.7;
		
		Movie movieEleven = new Movie();
		movieEleven.movieId = 11;
		movieEleven.title = "Joker";
		movieEleven.director = "Todd Phillips";
		movieEleven.duration = 122;
		movieEleven.rating = 4.5;
		
		Movie movieTwelve = new Movie();
		movieTwelve.movieId = 12;
		movieTwelve.title = "Avengers";
		movieTwelve.director = "Joss Whedon";
		movieTwelve.duration = 143;
		movieTwelve.rating = 4.6;
		
		Movie movieThirteen = new Movie();
		movieThirteen.movieId = 13;
		movieThirteen.title = "Spider-Man";
		movieThirteen.director = "Jon Watts";
		movieThirteen.duration = 148;
		movieThirteen.rating = 4.5;
		
		Movie movieFourteen = new Movie();
		movieFourteen.movieId = 14;
		movieFourteen.title = "Pushpa";
		movieFourteen.director = "Sukumar";
		movieFourteen.duration = 179;
		movieFourteen.rating = 4.4;
		
		Movie movieFifteen = new Movie();
		movieFifteen.movieId = 15;
		movieFifteen.title = "Leo";
		movieFifteen.director = "Lokesh Kanagaraj";
		movieFifteen.duration = 165;
		movieFifteen.rating = 4.3;
		
		
		Movie movie[] = new Movie[15];
		movie[0] = movieOne;
		movie[1] = movieTwo;
		movie[2] = movieThree;
		movie[3] = movieFour;
		movie[4] = movieFive;
		movie[5] = movieSix;
		movie[6] = movieSeven;
		movie[7] = movieEight;
		movie[8] = movieNine;
		movie[9] = movieTen;
		movie[10] = movieEleven;
		movie[11] = movieTwelve;
		movie[12] = movieThirteen;
		movie[13] = movieFourteen;
		movie[14] = movieFifteen;
		
		
		for(Movie details : movie){
			System.out.println(details.movieId);
			System.out.println(details.title);
			System.out.println(details.director);
			System.out.println(details.duration);
			System.out.println(details.rating);
			System.out.println("---------------");
		}
	}
}