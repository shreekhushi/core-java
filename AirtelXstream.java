class AirtelXstream{
	    static String xstreamLiveTVChannels[] = {"Zee TV","Star Plus","Colors TV","Sony TV","Sun TV","Star Vijay","Gemini TV","ETV Kannada","Asianet",
        "Zee Cinema","Star Gold","Sony Max","Colors Cineplex","Zee Telugu","Star Maa","Sun Music","KTV","Nickelodeon","Cartoon Network","Pogo",
        "Discovery Channel","National Geographic","History TV18","Animal Planet","CNN","Times Now","NDTV India","Republic TV","Aaj Tak","India Today"};

        
        static String xstreamRegionalNews[] = {"TV9 Telugu","Public TV Kannada","Asianet News","News18 Tamil","ABP Majha","Zee 24 Taas","ETV Andhra Pradesh","TV5 Telugu","Suvarna News",
        "News7 Tamil","Polimer News","Kairali News","Janam TV","Raj News Kannada","Sathiyam TV","ETV Telangana","ABP Ananda","Zee News Hindi",
        "NDTV 24x7","Times Now Navbharat","News Nation","Republic Bharat","India TV","News18 India","TV9 Bharatvarsh","Mathrubhumi News",
        "Manorama News","Captain TV","Kalaignar News","V6 News" };

        static String xstreamDevotionalContents[] = {"Mahabharat","Ramayan","Shiv Puran","Sai Baba Bhajans","Vishnu Sahasranamam","Hanuman Chalisa","Bhagavad Gita",
        "Shirdi Live Darshan","Tirupati Live","Sabarimala Special","Durga Aarti", "Krishna Leela","Shani Dev Katha","Navratri Special",
		"Ganesh Chaturthi Special","Bhakti Sangeet","Suprabhatam","Om Namah Shivaya","Devi Mahatmyam","Sri Venkateswara Kalyanam","Murugan Devotional","Ayyappa Swamy Songs",
        "Lakshmi Ashtakam","Vishnu Puran", "Sai Satcharitra","Bhagavatam","Gayatri Mantra","Rudram Chamakam","Krishna Janmashtami Special","Diwali Bhakti Special"};

        
        static String xstreamEducationalShows[] = {"Discovery Science","Cosmos Series","Planet Earth","Wild India","Mega Structures","Brain Games",
        "Science of Stupid","Ancient Aliens","Engineering Marvels","Space Explorers","History Mysteries","India From Above","Wild Karnataka","Secrets of Oceans",
        "World War Archives","Medical Amazing Stories", "Tech Innovations","Future Cities","Deep Sea Creatures","Animal Kingdom","Volcano Live","Solar System Explained",
        "Human Body Secrets","Machine Giants","Great Inventions","Nature Wonders","Wildlife Safari","Archaeology Discoveries","Space Missions","Underwater World","Planet Dinosaurs"
        };

       
        static String xstreamMusicConcerts[] = {"Arijit Singh Live","A R Rahman Concert","Sunburn Festival","MTV Unplugged","Coke Studio","Rolling Loud",
        "Yo Yo Honey Singh Live","Shreya Ghoshal Live","Indian Idol Finale","Diljit Dosanjh Tour","Coldplay Concert","Taylor Swift Live",
        "Justin Bieber Live","One Direction Tour","BTS World Tour","Ed Sheeran Live","Sufi Night Special","Bollywood Retro Night",
        "Punjabi Beats Live","Rock On Festival","Jazz Evening","Classical Carnatic Concert","Fusion Fiesta","Indie Music Fest","Hip Hop India",
		"Desi DJ Night","New Year Live Concert","Zee Music Awards","Global Music Awards","Summer Fest Live"};

        
        static String xstreamFitnessLifestyles[] = {"Yoga for Beginners","Power Yoga","Home Workout","HIIT Training","Meditation Guide","Healthy Cooking",
        "Weight Loss Journey","Zumba Dance","Pilates Basics","Cardio Burn","Mindfulness Sessions","Healthy Recipes","Diet Planning","Fitness Challenge",
        "Morning Stretch","Evening Relaxation","Gym Training","Body Transformation","Healthy Living Tips","Mental Health Awareness","Stress Management"
		,"Nutrition Guide","Strength Training","Daily Wellness","Skin Care Routine","Hair Care Guide","Fashion Trends","Travel Diaries","Minimalist Living","Self Improvement"};

  public static void main(String[] args){
    String ottName = "Airtel Xstream";
	System.out.println("The OTT platform is :" + ottName);
	
	getxstreamRegionalNews();
	System.out.println("\n");
	getxstreamMusicConcerts();
	System.out.println("\n");
	getxstreamLiveTVChannels();
	System.out.println("\n");
	getxstreamFitnessLifestyles();
	System.out.println("\n");
	getxstreamEducationalShows();
	System.out.println("\n");
	getxstreamDevotionalContent();
		
        // System.out.println("Live TV Channels on Airtel Xstream:");
        // System.out.println(xstreamLiveTVChannels[0]+","+xstreamLiveTVChannels[1]+","+xstreamLiveTVChannels[2]+","+xstreamLiveTVChannels[3]+","+xstreamLiveTVChannels[4]+","+
        // xstreamLiveTVChannels[5]+","+xstreamLiveTVChannels[6]+","+xstreamLiveTVChannels[7]+","+xstreamLiveTVChannels[8]+","+xstreamLiveTVChannels[9]+","+
        // xstreamLiveTVChannels[10]+","+xstreamLiveTVChannels[11]+","+xstreamLiveTVChannels[12]+","+xstreamLiveTVChannels[13]+","+xstreamLiveTVChannels[14]+","+
        // xstreamLiveTVChannels[15]+","+xstreamLiveTVChannels[16]+","+xstreamLiveTVChannels[17]+","+xstreamLiveTVChannels[18]+","+xstreamLiveTVChannels[19]+","+
        // xstreamLiveTVChannels[20]+","+xstreamLiveTVChannels[21]+","+xstreamLiveTVChannels[22]+","+xstreamLiveTVChannels[23]+","+xstreamLiveTVChannels[24]+","+
        // xstreamLiveTVChannels[25]+","+xstreamLiveTVChannels[26]+","+xstreamLiveTVChannels[27]+","+xstreamLiveTVChannels[28]+","+xstreamLiveTVChannels[29]+"\n");

		// System.out.println("Regional News Channels on Airtel Xstream:");
        // System.out.println(xstreamRegionalNews[0]+","+xstreamRegionalNews[1]+","+xstreamRegionalNews[2]+","+xstreamRegionalNews[3]+","+xstreamRegionalNews[4]+","+
        // xstreamRegionalNews[5]+","+xstreamRegionalNews[6]+","+xstreamRegionalNews[7]+","+xstreamRegionalNews[8]+","+xstreamRegionalNews[9]+","+
        // xstreamRegionalNews[10]+","+xstreamRegionalNews[11]+","+xstreamRegionalNews[12]+","+xstreamRegionalNews[13]+","+xstreamRegionalNews[14]+","+
        // xstreamRegionalNews[15]+","+xstreamRegionalNews[16]+","+xstreamRegionalNews[17]+","+xstreamRegionalNews[18]+","+xstreamRegionalNews[19]+","+
        // xstreamRegionalNews[20]+","+xstreamRegionalNews[21]+","+xstreamRegionalNews[22]+","+xstreamRegionalNews[23]+","+xstreamRegionalNews[24]+","+
        // xstreamRegionalNews[25]+","+xstreamRegionalNews[26]+","+xstreamRegionalNews[27]+","+xstreamRegionalNews[28]+","+xstreamRegionalNews[29]+"\n");
		
		// System.out.println("Devotional Content on Airtel Xstream:");
        // System.out.println(xstreamDevotionalContent[0]+","+xstreamDevotionalContent[1]+","+xstreamDevotionalContent[2]+","+xstreamDevotionalContent[3]+","+xstreamDevotionalContent[4]+","+
        // xstreamDevotionalContent[5]+","+xstreamDevotionalContent[6]+","+xstreamDevotionalContent[7]+","+xstreamDevotionalContent[8]+","+xstreamDevotionalContent[9]+","+
        // xstreamDevotionalContent[10]+","+xstreamDevotionalContent[11]+","+xstreamDevotionalContent[12]+","+xstreamDevotionalContent[13]+","+xstreamDevotionalContent[14]+","+
        // xstreamDevotionalContent[15]+","+xstreamDevotionalContent[16]+","+xstreamDevotionalContent[17]+","+xstreamDevotionalContent[18]+","+xstreamDevotionalContent[19]+","+
        // xstreamDevotionalContent[20]+","+xstreamDevotionalContent[21]+","+xstreamDevotionalContent[22]+","+xstreamDevotionalContent[23]+","+xstreamDevotionalContent[24]+","+
        // xstreamDevotionalContent[25]+","+xstreamDevotionalContent[26]+","+xstreamDevotionalContent[27]+","+xstreamDevotionalContent[28]+","+xstreamDevotionalContent[29]+"\n");


        // System.out.println("Educational Shows on Airtel Xstream:");
        // System.out.println(xstreamEducationalShows[0]+","+xstreamEducationalShows[1]+","+xstreamEducationalShows[2]+","+xstreamEducationalShows[3]+","+xstreamEducationalShows[4]+","+
        // xstreamEducationalShows[5]+","+xstreamEducationalShows[6]+","+xstreamEducationalShows[7]+","+xstreamEducationalShows[8]+","+xstreamEducationalShows[9]+","+
        // xstreamEducationalShows[10]+","+xstreamEducationalShows[11]+","+xstreamEducationalShows[12]+","+xstreamEducationalShows[13]+","+xstreamEducationalShows[14]+","+
         // xstreamEducationalShows[15]+","+xstreamEducationalShows[16]+","+xstreamEducationalShows[17]+","+xstreamEducationalShows[18]+","+xstreamEducationalShows[19]+","+
        // xstreamEducationalShows[20]+","+xstreamEducationalShows[21]+","+xstreamEducationalShows[22]+","+xstreamEducationalShows[23]+","+xstreamEducationalShows[24]+","+
         // xstreamEducationalShows[25]+","+xstreamEducationalShows[26]+","+xstreamEducationalShows[27]+","+xstreamEducationalShows[28]+","+xstreamEducationalShows[29]+"\n");

        // System.out.println("Music & Concerts on Airtel Xstream:");
        // System.out.println(xstreamMusicConcerts[0]+","+xstreamMusicConcerts[1]+","+xstreamMusicConcerts[2]+","+xstreamMusicConcerts[3]+","+xstreamMusicConcerts[4]+","+
         // xstreamMusicConcerts[5]+","+xstreamMusicConcerts[6]+","+xstreamMusicConcerts[7]+","+xstreamMusicConcerts[8]+","+xstreamMusicConcerts[9]+","+
        // xstreamMusicConcerts[10]+","+xstreamMusicConcerts[11]+","+xstreamMusicConcerts[12]+","+xstreamMusicConcerts[13]+","+xstreamMusicConcerts[14]+","+
         // xstreamMusicConcerts[15]+","+xstreamMusicConcerts[16]+","+xstreamMusicConcerts[17]+","+xstreamMusicConcerts[18]+","+xstreamMusicConcerts[19]+","+
        // xstreamMusicConcerts[20]+","+xstreamMusicConcerts[21]+","+xstreamMusicConcerts[22]+","+xstreamMusicConcerts[23]+","+xstreamMusicConcerts[24]+","+
         // xstreamMusicConcerts[25]+","+xstreamMusicConcerts[26]+","+xstreamMusicConcerts[27]+","+xstreamMusicConcerts[28]+","+xstreamMusicConcerts[29]+"\n");
        
		
		// System.out.println("Fitness & Lifestyle on Airtel Xstream:");
        // System.out.println(xstreamFitnessLifestyle[0]+","+xstreamFitnessLifestyle[1]+","+xstreamFitnessLifestyle[2]+","+xstreamFitnessLifestyle[3]+","+xstreamFitnessLifestyle[4]+","+
        // xstreamFitnessLifestyle[5]+","+xstreamFitnessLifestyle[6]+","+xstreamFitnessLifestyle[7]+","+xstreamFitnessLifestyle[8]+","+xstreamFitnessLifestyle[9]+","+
        // xstreamFitnessLifestyle[10]+","+xstreamFitnessLifestyle[11]+","+xstreamFitnessLifestyle[12]+","+xstreamFitnessLifestyle[13]+","+xstreamFitnessLifestyle[14]+","+
        // xstreamFitnessLifestyle[15]+","+xstreamFitnessLifestyle[16]+","+xstreamFitnessLifestyle[17]+","+xstreamFitnessLifestyle[18]+","+xstreamFitnessLifestyle[19]+","+
        // xstreamFitnessLifestyle[20]+","+xstreamFitnessLifestyle[21]+","+xstreamFitnessLifestyle[22]+","+xstreamFitnessLifestyle[23]+","+xstreamFitnessLifestyle[24]+","+
         // xstreamFitnessLifestyle[25]+","+xstreamFitnessLifestyle[26]+","+xstreamFitnessLifestyle[27]+","+xstreamFitnessLifestyle[28]+","+xstreamFitnessLifestyle[29]+"\n");

  } 
  
  static void getxstreamLiveTVChannels(){
	  System.out.println("The available live channels on xstream are:");
	  for (String xstreamLiveTVChannel : xstreamLiveTVChannels){
		  System.out.println(xstreamLiveTVChannel);
	  }
  }
  
  static void getxstreamRegionalNews(){
	  System.out.println("The available regional news on xstream are:");
	  for (String xstreamRegionalNew : xstreamRegionalNews){
		  System.out.println(xstreamRegionalNew);
	  }
  }
  
  
  static void getxstreamDevotionalContent(){
	  System.out.println("The available devotional contents on xstream are:");
	  for (String xstreamDevotionalContent : xstreamDevotionalContents){
		  System.out.println(xstreamDevotionalContent);
	  }
  }
  
  static void getxstreamEducationalShows(){
	  System.out.println("The available educational shows on xstream are:");
	  for (String xstreamEducationalShow : xstreamEducationalShows){
		  System.out.println(xstreamEducationalShow);
	  }
  }
  
  static void getxstreamMusicConcerts(){
	  System.out.println("The available music concerts on xstream are:");
	  for (String xstreamMusicConcert : xstreamMusicConcerts){
		  System.out.println(xstreamMusicConcert);
	  }
  }
  
  static void getxstreamFitnessLifestyles(){
	  System.out.println("The available fitness lifestyle on xstream are:");
	  for (String xstreamFitnessLifestyle : xstreamFitnessLifestyles){
		  System.out.println(xstreamFitnessLifestyle);
	  }
  }
}