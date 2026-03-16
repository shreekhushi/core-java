class ZeeFive{
	
	    static String webSeries[] = { "Abhay","Rangbaaz","Sunflower","Kaafir","Poison","State of Siege 26/11","The Final Call","Naxalbari",
        "Broken But Beautiful","Code M","Mafia","Lalbazaar","Karenjit Kaur","Never Kiss Your Best Friend","Bicchoo Ka Khel","Taish","Jeet Ki Zid","Cubicles",
        "The Chargesheet","Duranga","Mukhbir","ATM","Recce","Dharavi Bank","Pitchers","Auto Shankar","Gods of Dharmapuri","High Priestess",
        "Vyavastha","Abar Proloy"};

        static String serials[] = {"Kumkum Bhagya","Kundali Bhagya","Bhagya Lakshmi","Meet","Rabb Se Hai Dua","Jamai Raja","Jodha Akbar","Kasamh Se","Punar Vivaah",
        "Saat Phere","Ek Tha Raja Ek Thi Rani","Guddan Tumse Na Ho Payega","Ishq Subhan Allah","Zindagi Ki Mehek","Kaala Teeka","Agnifera",
        "Brahmarakshas","Dil Dhoondta Hai","Maharakshak Devi","Banoo Main Teri Dulhann","Fear Files","Qurbaan Hua","Yeh Teri Galiyan","Tujhse Hai Raabta",
        "Kyun Rishton Mein Katti Batti","Piyaa Albela","Radhamma Kuthuru","Trinayani","Sathya","Mithai"};

        static String realityShows[] = {"Dance India Dance","Sa Re Ga Ma Pa","India's Best Dramebaaz","DID Super Moms","DID Little Masters","Sa Re Ga Ma Pa Lil Champs",
        "Zee Comedy Show","India's Got Talent","Zee Cine Awards","Zee Rishtey Awards","Dance Karnataka Dance","Dance Maharashtra Dance","Comedy Khiladigalu","Drama Juniors",
        "Sa Re Ga Ma Pa Telugu","Sa Re Ga Ma Pa Tamil","Sa Re Ga Ma Pa Malayalam","Dance Kerala Dance","Dance Bangla Dance","Indian Pro Music League",
        "Zee Heroes","Zee Mahotsavam","DID Battle of Champions","High Fever","Bollywood Life","Pro Music Countdown","Super Mom","Lockdown Special",
        "Zee Music Originals","Zee Grand Awards"};

        static String zee5Movies[] = {"Uri: The Surgical Strike","The Kashmir Files","Rashmi Rocket","Dial 100","Silence","Haseen Dillruba","Radhe","Jhund",
        "Mrs Undercover","Forensic","The Tashkent Files","Mulk","Article 15","Veer","Samrat Prithviraj","Raksha Bandhan","Khuda Haafiz","Uunchai","Bhediya","Dream Girl 2",
        "Gadar 2","The Kerala Story","RRR","Sita Ramam","Bimbisara","Karthikeya 2","Valimai","Bangarraju", "The Ghost","Salaar"};

        static String zee5TeluguMovies[] = {"ATM","Recce","Vyavastha","Dhootha","Gaalivaana","Kudi Yedamaithe","Unheard","Jhansi","Newsense","Parampara",
        "Modern Love Hyderabad","Bimbisara","Bangarraju","Karthikeya 2","The Ghost","RRR","Sita Ramam","Salaar","Abhay","Rangbaaz","Duranga","Sunflower","Poison",
        "Mukhbir","Dharavi Bank","Auto Shankar","Gods of Dharmapuri","High Priestess","Pitchers","Cubicles"};

        static String zee5TamilMovies[] = {"Auto Shankar","Gods of Dharmapuri","High Priestess","Thiravam","November Story","Queen","Live Telecast","Paper Rocket",
        "Irai","Vilangu","Anantham","Ayali","Sengalam","Vadhandhi","Suzhal","Inspector Rishi","Time Enna Boss","Navarasa","Triples","Parampara",
        "Abhay","Sunflower","Duranga","ATM","Recce","Dharavi Bank","Pitchers","Cubicles","Kaafir","Poison"};
		
  public static void main(String[] args){
        String ottName = "Zee5";
		System.out.println("The OTT platform is :" + ottName);
		
		getMovies();
		System.out.println("\n");
		getRealityShows();
		System.out.println("\n");
		getSerials();
		System.out.println("\n");
		getTamilMovies();
		System.out.println("\n");
		getTeluguMovies();
		System.out.println("\n");
		getWebSeries();
		
		
        // System.out.println("The Web Series on ZEE5 are :");
        // System.out.println(webSeries[0]+","+webSeries[1]+","+webSeries[2]+","+webSeries[3]+","+webSeries[4]+","+webSeries[5]+","+webSeries[6]+","
		// +webSeries[7]+","+webSeries[8]+","+webSeries[9]+","+webSeries[10]+","+webSeries[11]+","+webSeries[12]+","+webSeries[13]+","+webSeries[14]+","
		// +webSeries[15]+","+webSeries[16]+","+webSeries[17]+","+webSeries[18]+","+webSeries[19]+","+webSeries[20]+","+webSeries[21]+","+webSeries[22]+
		// ","+webSeries[23]+","+webSeries[24]+","+webSeries[25]+","+webSeries[26]+","+webSeries[27]+","+webSeries[28]+","+webSeries[29]+"\n");


        // System.out.println("The Serials on ZEE5 are :");
        // System.out.println(serials[0]+","+serials[1]+","+serials[2]+","+serials[3]+","+serials[4]+","+serials[5]+","+serials[6]+","+serials[7]+","+
		// serials[8]+","+serials[9]+","+serials[10]+","+serials[11]+","+serials[12]+","+serials[13]+","+serials[14]+","+serials[15]+","+serials[16]+","+
        // serials[17]+","+serials[18]+","+serials[19]+","+serials[20]+","+serials[21]+","+serials[22]+","+serials[23]+","+serials[24]+","+serials[25]+","+serials[26]+","+serials[27]+","+serials[28]+","+
        // serials[29]+"\n");

        // System.out.println("The Reality Shows on ZEE5 are :");
        // System.out.println(realityShows[0]+","+realityShows[1]+","+realityShows[2]+","+realityShows[3]+","+realityShows[4]+","+realityShows[5]+","+
		// realityShows[6]+","+realityShows[7]+","+realityShows[8]+","+realityShows[9]+","+realityShows[10]+","+realityShows[11]+","+realityShows[12]+","
		// +realityShows[13]+","+realityShows[14]+","+realityShows[15]+","+realityShows[16]+","+realityShows[17]+","+realityShows[18]+","+realityShows[19]+","+realityShows[20]+","+realityShows[21]+","+realityShows[22]+","+
        // realityShows[23]+","+realityShows[24]+","+realityShows[25]+","+realityShows[26]+","+realityShows[27]+","+realityShows[28]+","+realityShows[29]+"\n");
		
        // System.out.println("The Movies on ZEE5 are :");
        // System.out.println(zee5Movies[0]+","+zee5Movies[1]+","+zee5Movies[2]+","+zee5Movies[3]+","+zee5Movies[4]+","+zee5Movies[5]+","+zee5Movies[6]+
		// ","+zee5Movies[7]+","+zee5Movies[8]+","+zee5Movies[9]+","+zee5Movies[10]+","+zee5Movies[11]+","+zee5Movies[12]+","+zee5Movies[13]+","+
		// zee5Movies[14]+","+zee5Movies[15]+","+zee5Movies[16]+","+zee5Movies[17]+","+zee5Movies[18]+","+zee5Movies[19]+","+zee5Movies[20]+","+zee5Movies[21]+","+zee5Movies[22]+","+
        // zee5Movies[23]+","+zee5Movies[24]+","+zee5Movies[25]+","+zee5Movies[26]+","+zee5Movies[27]+","+zee5Movies[28]+","+zee5Movies[29]+"\n");
		
        // System.out.println("The Telugu Content on ZEE5 are :");
        // System.out.println(zee5Telugu[0]+","+zee5Telugu[1]+","+zee5Telugu[2]+","+zee5Telugu[3]+","+zee5Telugu[4]+","+zee5Telugu[5]+","+zee5Telugu[6]+","+zee5Telugu[7]+","+zee5Telugu[8]+","+zee5Telugu[9]+","+zee5Telugu[10]+","+
        // zee5Telugu[11]+","+zee5Telugu[12]+","+zee5Telugu[13]+","+zee5Telugu[14]+","+zee5Telugu[15]+","+zee5Telugu[16]+","+zee5Telugu[17]+","+zee5Telugu[18]+","+zee5Telugu[19]+","+zee5Telugu[20]+","+zee5Telugu[21]+","+zee5Telugu[22]+","+
        // zee5Telugu[23]+","+zee5Telugu[24]+","+zee5Telugu[25]+","+zee5Telugu[26]+","+zee5Telugu[27]+","+zee5Telugu[28]+","+zee5Telugu[29]+"\n");
        // System.out.println("The Tamil Content on ZEE5 are :");
        // System.out.println(zee5Tamil[0]+","+zee5Tamil[1]+","+zee5Tamil[2]+","+zee5Tamil[3]+","+zee5Tamil[4]+","+zee5Tamil[5]+","+zee5Tamil[6]+","+
		// zee5Tamil[7]+","+zee5Tamil[8]+","+zee5Tamil[9]+","+zee5Tamil[10]+","+zee5Tamil[11]+","+zee5Tamil[12]+","+zee5Tamil[13]+","+zee5Tamil[14]+","
		// +zee5Tamil[15]+","+zee5Tamil[16]+","+zee5Tamil[17]+","+zee5Tamil[18]+","+zee5Tamil[19]+","+zee5Tamil[20]+","+zee5Tamil[21]+","+zee5Tamil[22]
		// +","+zee5Tamil[23]+","+zee5Tamil[24]+","+zee5Tamil[25]+","+zee5Tamil[26]+","+zee5Tamil[27]+","+zee5Tamil[28]+","+zee5Tamil[29]+"\n");
	}
	
	static void getWebSeries(){
		System.out.println("The web series on Zee5 are:");
		for (String webSerie : webSeries){
			System.out.println(webSerie);
		}
	}
	
	static void getSerials(){
		System.out.println("The  series on Zee5 are:");
		for (String serial : serials){
			System.out.println(serial);
		}
	}
	
	static void getRealityShows(){
		System.out.println("The reality shows on Zee5 are:");
		for (String realityShow : realityShows){
			System.out.println(realityShow);
		}
	}
	
	static void getMovies(){
		System.out.println("The movies on Zee5 are:");
		for (String zee5Movie : zee5Movies){
			System.out.println(zee5Movie);
		}
	}
	
	static void getTeluguMovies(){
		System.out.println("The telugu movies on Zee5 are:");
		for (String zee5TeluguMovie : zee5TeluguMovies){
			System.out.println(zee5TeluguMovie);
		}
	}
	
	static void getTamilMovies(){
		System.out.println("The tamil movies on Zee5 are:");
		for (String zee5TamilMovie : zee5TamilMovies){
			System.out.println(zee5TamilMovie);
		}
	}
}