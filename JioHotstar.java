class JioHotstar{
	
	    static String hotstarSportsEvents[] = {"IPL 2024","ICC Cricket World Cup","Asia Cup","Champions League","Premier League",
        "ISL","Pro Kabaddi League","Wimbledon","US Open","French Open","Australian Open","Formula 1","MotoGP","NBA Finals","FIFA World Cup","Durand Cup",
        "Ranji Trophy","Vijay Hazare Trophy","Syed Mushtaq Ali Trophy","T20 World Cup","SA20 League","Big Bash League","Carabao Cup","FA Cup",
        "La Liga","Serie A","Bundesliga","Copa America","Olympics","Commonwealth Games"};

        
        static String hotstarRealityShows[] = {"Bigg Boss","MasterChef India","Dance Plus","India's Got Talent","Nach Baliye","Kaun Banega Crorepati","Super Singer",
        "Indian Idol","The Voice India","Smart Jodi","Dance Deewane","Fear Factor","Roadies","Splitsvilla","MTV Hustle","Rising Star","Super Dancer",
        "India’s Best Dancer","Sa Re Ga Ma Pa", "Dance India Dance","Superstar Singer","India’s Next Top Model","High Fever","DID Super Moms",
		"Khatron Ke Khiladi","Comedy Nights","Indian Pro Music League","The Great Indian Laughter Challenge","Love School","Lock Upp"};

        
       static  String hotstarKidsShows[] = {"Doraemon","Shinchan","Pokemon","Oggy and the Cockroaches","Chhota Bheem","Motu Patlu","Ben 10","Power Rangers",
		"Peppa Pig","Tom and Jerry","The Lion Guard","Frozen Adventures","Cars Toons","DuckTales","Mickey Mouse Clubhouse","Phineas and Ferb","Gravity Falls",
        "Sofia the First","Paw Patrol","PJ Masks","Bluey","Kung Fu Panda","Miraculous Ladybug","Teen Titans Go","Avatar The Last Airbender",
        "SpongeBob SquarePants","The Jungle Book","Aladdin Series","Dragon Tales","Little Krishna"};

        static String hotstarInternationalSeries[] = {"Game of Thrones","House of the Dragon","The Last of Us","Chernobyl","Westworld","The Walking Dead",
        "Modern Family","The Simpsons","How I Met Your Mother","Grey's Anatomy","The Office","Friends","Loki","WandaVision","Moon Knight","The Mandalorian","Breaking Bad",
        "Better Call Saul","Sherlock","Prison Break","The Crown","Stranger Things","The Witcher","Vikings","Peaky Blinders","Suits","The Boys",
        "True Detective","The Sopranos","The Big Bang Theory"};

       
        static String hotstarDocumentaries[] = {"The Elephant Whisperers","Free Solo","The Social Dilemma","Our Planet","Planet Earth","India From Above",
        "The Last Dance","Inside Bill's Brain","Cosmos","The Tinder Swindler","Tiger King","The Blue Planet","Wild Karnataka","Secrets of the Whales",
        "Apollo 11","The Rescue","Becoming","Man vs Wild","The Game Changers","My Octopus Teacher","Formula 1 Drive to Survive","Making a Murderer","Night Stalker",
        "The Inventor","Blackfish","The Dawn Wall","Jiro Dreams of Sushi","The Cove","Icarus","Inside Pixar"};

        static String hotstarComedyShows[] = {"Sarabhai vs Sarabhai","Khichdi","The Kapil Sharma Show","Taarak Mehta Ka Ooltah Chashmah","Office Office",
		"Baa Bahoo Aur Baby", "Sumit Sambhal Lega","Hum Paanch","Wagle Ki Duniya","Comedy Circus","FIR","Yes Minister","Mind Your Language",
        "Friends Reunion","Brooklyn Nine-Nine","Modern Love","Panchayat","The Office India","The IT Crowd","The Marvelous Mrs. Maisel",
        "Two and a Half Men","Full House","Fresh Prince of Bel-Air","Young Sheldon","Malcolm in the Middle","Community","The Middle","The Big Bang Theory",
        "Blackadder","The Good Place"};  
		
  public static void main(String[] args){
    String ottName = "Jio Hotstar";
	System.out.println("The OTT platform is :" + ottName);
	
	gethotstarSportsEvents();
	System.out.println("\n");
	gethotstarRealityShows();
	System.out.println("\n");
	gethotstarKidsShows();
	System.out.println("\n");
	gethotstarInternationalSeries();
	System.out.println("\n");
	gethotstarDocumentaries();
	System.out.println("\n");
	gethotstarComedyShows();
		
		
        // System.out.println("Sports Content on JioHotstar:");
        // System.out.println(hotstarSportsEvents[0]+","+hotstarSportsEvents[1]+","+hotstarSportsEvents[2]+","+hotstarSportsEvents[3]+","+hotstarSportsEvents[4]+","+
        // hotstarSportsEvents[5]+","+hotstarSportsEvents[6]+","+hotstarSportsEvents[7]+","+hotstarSportsEvents[8]+","+hotstarSportsEvents[9]+","+
        // hotstarSportsEvents[10]+","+hotstarSportsEvents[11]+","+hotstarSportsEvents[12]+","+hotstarSportsEvents[13]+","+hotstarSportsEvents[14]+","+
        // hotstarSportsEvents[15]+","+hotstarSportsEvents[16]+","+hotstarSportsEvents[17]+","+hotstarSportsEvents[18]+","+hotstarSportsEvents[19]+","+
        // hotstarSportsEvents[20]+","+hotstarSportsEvents[21]+","+hotstarSportsEvents[22]+","+hotstarSportsEvents[23]+","+hotstarSportsEvents[24]+","+
        // hotstarSportsEvents[25]+","+hotstarSportsEvents[26]+","+hotstarSportsEvents[27]+","+hotstarSportsEvents[28]+","+hotstarSportsEvents[29]+"\n");
		
        // System.out.println("Reality Shows on JioHotstar:");
        // System.out.println(hotstarRealityShows[0]+","+hotstarRealityShows[1]+","+hotstarRealityShows[2]+","+hotstarRealityShows[3]+","+hotstarRealityShows[4]+","+
        // hotstarRealityShows[5]+","+hotstarRealityShows[6]+","+hotstarRealityShows[7]+","+hotstarRealityShows[8]+","+hotstarRealityShows[9]+","+
        // hotstarRealityShows[10]+","+hotstarRealityShows[11]+","+hotstarRealityShows[12]+","+hotstarRealityShows[13]+","+hotstarRealityShows[14]+","+
        // hotstarRealityShows[15]+","+hotstarRealityShows[16]+","+hotstarRealityShows[17]+","+hotstarRealityShows[18]+","+hotstarRealityShows[19]+","+
        // hotstarRealityShows[20]+","+hotstarRealityShows[21]+","+hotstarRealityShows[22]+","+hotstarRealityShows[23]+","+hotstarRealityShows[24]+","+
        // hotstarRealityShows[25]+","+hotstarRealityShows[26]+","+hotstarRealityShows[27]+","+hotstarRealityShows[28]+","+hotstarRealityShows[29]+"\n");
		
        // System.out.println("Kids Shows on JioHotstar:");
        // System.out.println(hotstarKidsShows[0]+","+hotstarKidsShows[1]+","+hotstarKidsShows[2]+","+hotstarKidsShows[3]+","+hotstarKidsShows[4]+","+
        // hotstarKidsShows[5]+","+hotstarKidsShows[6]+","+hotstarKidsShows[7]+","+hotstarKidsShows[8]+","+hotstarKidsShows[9]+","+hotstarKidsShows[10]+","+hotstarKidsShows[11]+","+hotstarKidsShows[12]+","+hotstarKidsShows[13]+","+hotstarKidsShows[14]+","+
        // hotstarKidsShows[15]+","+hotstarKidsShows[16]+","+hotstarKidsShows[17]+","+hotstarKidsShows[18]+","+hotstarKidsShows[19]+","+
		// hotstarKidsShows[20]+","+hotstarKidsShows[21]+","+hotstarKidsShows[22]+","+hotstarKidsShows[23]+","+hotstarKidsShows[24]+","+hotstarKidsShows[25]
		// +","+hotstarKidsShows[26]+","+hotstarKidsShows[27]+","+hotstarKidsShows[28]+","+hotstarKidsShows[29]+"\n");

        // System.out.println("International Series on JioHotstar:");
        // System.out.println(hotstarInternationalSeries[0]+","+hotstarInternationalSeries[1]+","+hotstarInternationalSeries[2]+","+hotstarInternationalSeries[3]+","+hotstarInternationalSeries[4]+","+
        // hotstarInternationalSeries[5]+","+hotstarInternationalSeries[6]+","+hotstarInternationalSeries[7]+","+hotstarInternationalSeries[8]+","+hotstarInternationalSeries[9]+","+
        // hotstarInternationalSeries[10]+","+hotstarInternationalSeries[11]+","+hotstarInternationalSeries[12]+","+hotstarInternationalSeries[13]+","+hotstarInternationalSeries[14]+","+
         // hotstarInternationalSeries[15]+","+hotstarInternationalSeries[16]+","+hotstarInternationalSeries[17]+","+hotstarInternationalSeries[18]+","+hotstarInternationalSeries[19]+","+
        // hotstarInternationalSeries[20]+","+hotstarInternationalSeries[21]+","+hotstarInternationalSeries[22]+","+hotstarInternationalSeries[23]+","+hotstarInternationalSeries[24]+","+
        // hotstarInternationalSeries[25]+","+hotstarInternationalSeries[26]+","+hotstarInternationalSeries[27]+","+hotstarInternationalSeries[28]+","+hotstarInternationalSeries[29]+"\n");

        // System.out.println("Documentaries on JioHotstar:");
        // System.out.println(hotstarDocumentaries[0]+","+hotstarDocumentaries[1]+","+hotstarDocumentaries[2]+","+hotstarDocumentaries[3]+","+hotstarDocumentaries[4]+","+
        // hotstarDocumentaries[5]+","+hotstarDocumentaries[6]+","+hotstarDocumentaries[7]+","+hotstarDocumentaries[8]+","+hotstarDocumentaries[9]+","+
        // hotstarDocumentaries[10]+","+hotstarDocumentaries[11]+","+hotstarDocumentaries[12]+","+hotstarDocumentaries[13]+","+hotstarDocumentaries[14]+","+
        // hotstarDocumentaries[15]+","+hotstarDocumentaries[16]+","+hotstarDocumentaries[17]+","+hotstarDocumentaries[18]+","+hotstarDocumentaries[19]+","+
        // hotstarDocumentaries[20]+","+hotstarDocumentaries[21]+","+hotstarDocumentaries[22]+","+hotstarDocumentaries[23]+","+hotstarDocumentaries[24]+","+
        // hotstarDocumentaries[25]+","+hotstarDocumentaries[26]+","+hotstarDocumentaries[27]+","+hotstarDocumentaries[28]+","+hotstarDocumentaries[29]+"\n");
		
        // System.out.println("Comedy Shows on JioHotstar:");
        // System.out.println(hotstarComedyShows[0]+","+hotstarComedyShows[1]+","+hotstarComedyShows[2]+","+hotstarComedyShows[3]+","+hotstarComedyShows[4]+","+
        // hotstarComedyShows[5]+","+hotstarComedyShows[6]+","+hotstarComedyShows[7]+","+hotstarComedyShows[8]+","+hotstarComedyShows[9]+","+
        // hotstarComedyShows[10]+","+hotstarComedyShows[11]+","+hotstarComedyShows[12]+","+hotstarComedyShows[13]+","+hotstarComedyShows[14]+","+
        // hotstarComedyShows[15]+","+hotstarComedyShows[16]+","+hotstarComedyShows[17]+","+hotstarComedyShows[18]+","+hotstarComedyShows[19]+","+
        // hotstarComedyShows[20]+","+hotstarComedyShows[21]+","+hotstarComedyShows[22]+","+hotstarComedyShows[23]+","+hotstarComedyShows[24]+","+
        // hotstarComedyShows[25]+","+hotstarComedyShows[26]+","+hotstarComedyShows[27]+","+hotstarComedyShows[28]+","+hotstarComedyShows[29]+"\n");
	}
	
	static void gethotstarSportsEvents(){
		System.out.println("The available hotstar sports events are :");
		for(String hotstarSportsEvent : hotstarSportsEvents){
			System.out.println(hotstarSportsEvent);
		}
	}
	
	static void gethotstarRealityShows(){
		System.out.println("The available hotstar reality shows are :");
		for(String hotstarRealityShow : hotstarRealityShows){
			System.out.println(hotstarRealityShow);
		}
	}
	
	static void gethotstarKidsShows(){
		System.out.println("The available hotstar kids shows are :");
		for(String hotstarKidsShow : hotstarKidsShows){
			System.out.println(hotstarKidsShow);
		}
	}
	
	static void gethotstarInternationalSeries(){
		System.out.println("The available hotstar international series are :");
		for(String hotstarInternationalSerie : hotstarInternationalSeries){
			System.out.println(hotstarInternationalSerie);
		}
	}
	
	static void gethotstarDocumentaries(){
		System.out.println("The available hotstar documentaries  are :");
		for(String hotstarDocumentarie : hotstarDocumentaries){
			System.out.println(hotstarDocumentarie);
		}
	}
	
	static void gethotstarComedyShows(){
		System.out.println("The available hotstar comedy shows are :");
		for(String hotstarComedyShow : hotstarComedyShows){
			System.out.println(hotstarComedyShow);
		}
	}
}