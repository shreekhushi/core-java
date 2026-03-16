class Netflix{
	static String hindiMovies[] = {"Dhurandhar", "Tere Ishk Mein","Raat Akeli Hai: The Bansal Murders","Sector 36",
	 "Do patti","Amar singh chamkila","12th fail","gungubai kathiawadi" , "laapataa ladies","jaane jaan",
	 "qola","jawan","animal","RRR", "Dangal","3idiots","Dilwale Dulhania Le Jayenge","Kabhi Khushi Kabhie Gham",
	 "Zindagi Na Milegi Dobara","Kal ho Naa ho","Chak de ","Main Hoon Na","Kabhi Khushi Kabhie Gham","Yeh Jawaani Hai Deewani","Swades"
	 ,"Andhadhun","Monica","O My Darling","Raazi","Rocky Aur Rani Kii Prem Kahaan"};
  
    static String englishMovies[] = {"The Rip","Joe’s College Road Trip","Happy Gilmore 2","Wake Up Dead Man ","Carry On","KPop Demon Hunters","The Iron Claw",  
	"Rebel Ridge","The Wild Robot","Priscilla","The Irishman","Marriage Story","Roma","Maestro","The Power of the Dog","Glass Onion","Hit Man","Extraction 2","All Quiet on theWestern Front","Society of the Snow","The Wolf of Wall Street","Forrest Gump", "Pulp Fiction","Crazy, Stupid, Love",
    "Ex Machina","Zero Dark Thirty","How to Train Your Dragon","Mrs. Doubtfire","Independence Day","The Bucket List"};
	
    static String kannadaMovies[] = {"Salaar","Bagheera","Mahavatar Narsimha","Champion", "Leo ", "Kantara",
    "Honeymoon ","U-Turn","Thunivu ","Etharkkum Thunindhavan ", "Dasara","Kurup", "Guntur Kaaram","Hi Nanna","The Ghost ",
    "Wild Dog ","Beast", "Jana", "Doctor", "Iraivan","Saripodhaa Sanivaaram","Lucky Baskhar","Amaran ","Kondal",
    "Devara", "Thangalaan ","GOAT - The Greatest of All Time","Indian 2","SU from SO","Saptha sagarada Ache"};
  
    static String teluguMovies[] = {"Devara: Part 1","Guntur Kaaram","Hi Nanna","Dasara", "Lucky Baskhar","Saripodhaa Sanivaaram", "Miss Shetty Mr Polishetty","Major","Wild Dog","The Ghost","Buddy","Tillu Square","Pushpa:The Rise","RRR","Shyam Singha Roy","Virupaksha", "Kushi","GodFather","Bheemla Nayak","Ante Sundaraniki",
    "Bro","Aravinda Sametha Veera Raghava","Ala Vaikunthapurramuloo","C/o Kancharapalem","Win It All","Sivaji: The Boss",
    "Uma Maheswara Ugra Roopasya","Cinema Bandi","Tharagathi Gadhi Daati","Ee Nagaraniki Emaindi"};

    static String tamilMovies[] = {"Thalaivar Thambi Thalaimaiyil","Amaran","Maharaja","Meiyazhagan","GOAT - The Greatest of All Time",
    "Leo","Jagame Thandhiram","Doctor","Don","Love Today","Irugapatru","Thangalaan","Vaathi","Indian 2","Jigarthanda DoubleX",
    "Kannum Kannum Kollaiyadithaal","Mandela","Paava Kadhaigal","Navarasa","Andhaghaaram","Etharkkum Thunindhavan",
    "Gatta Kusthi","Thunivu","Beast","Annaatthe","Iraivan","Thambi","Sillu Karuppatti","Nitham Oru Vaanam", "Theera Kadhal"};

    static String malayalamMovies[] = {"Kondal","ARM (Ajayante Randam Moshanam)","Adios Amigo","Vaazha – Biologic Boys",
    "Manjummel Boys","The Goat Life (Aadujeevitham)","Minnal Murali","Thallumaala","Kurup", "Bramayugam","Premalu",
    "Anweshippin Kandethum","Abraham Ozler","Garudan","Kannur Squad","Christopher","Nanpakal Nerathu Mayakkam",
    "Arikyil Oraal","Nayaattu","Irul","Kappela","Varane Avashyamund","Maniyarayile Ashokan","Vikruthi","Thottappan",
    "Lilli","Angamaly Diaries","Grandmaster","Ee Ma Yau","Carbon"};
	
	
  public static void main(String[] args){
  
  
    String ottName = "Netflix";
    System.out.println("The OTT platform is :" + ottName);
	
	getHindiMovies();
	System.out.println("\n");
	getenglishMovies();
	System.out.println("\n");
	getkannadaMovies();
	System.out.println("\n");
	getmalayalamMovies();
	System.out.println("\n");
	gettamilMovies();
	System.out.println("\n");
	getteluguMovies();
	
	// System.out.println("The hindi movies on netflix are :");
	// System.out.println(hindiMovies[0]+","+hindiMovies[1]+","+hindiMovies[2]+","+hindiMovies[3]+","+hindiMovies[4]+","+
	// hindiMovies[5]+","+hindiMovies[6]+","+hindiMovies[7]+","+hindiMovies[8]+","+hindiMovies[9]+","+hindiMovies[10]+","
	// +hindiMovies[11]+","+hindiMovies[12]+","+hindiMovies[13]+","+hindiMovies[14]+","+hindiMovies[15]+","+hindiMovies[16]+","+
	// hindiMovies[17]+","+hindiMovies[18]+","+hindiMovies[17]+","+hindiMovies[18]+","+hindiMovies[19]+","+hindiMovies[20]+","
	// +hindiMovies[21]+","+hindiMovies[22]+","+hindiMovies[23]+","+hindiMovies[24]+","+hindiMovies[25]+","+hindiMovies[26]+","+
	// hindiMovies[27]+hindiMovies[28]+""+hindiMovies[29]+"\n");
	
	// System.out.println("The english movies on netflix are :");
	// System.out.println(englishMovies[0]+","+englishMovies[1]+","+englishMovies[2]+","+englishMovies[3]+","+englishMovies[4]+","+
	// englishMovies[5]+","+englishMovies[6]+","+englishMovies[7]+","+englishMovies[8]+","+englishMovies[9]+","+englishMovies[10]+","
	// +englishMovies[11]+","+englishMovies[12]+","+englishMovies[13]+","+englishMovies[14]+","+englishMovies[15]+","+englishMovies[16]+","+
	// englishMovies[17]+","+englishMovies[18]+","+englishMovies[19]+","+englishMovies[20]+","+englishMovies[21]+","+englishMovies[22]+","
	// +englishMovies[23]+","+englishMovies[24]+","+englishMovies[25]+","+englishMovies[26]+","+englishMovies[27]+","+englishMovies[28]+","+
	// englishMovies[29]+"\n");
	
	// System.out.println("The kannada movies on netflix are :");
	// System.out.println(kannadaMovies[0]+","+kannadaMovies[1]+","+kannadaMovies[2]+","+kannadaMovies[3]+","+kannadaMovies[4]+","+
	// kannadaMovies[5]+","+kannadaMovies[6]+","+kannadaMovies[7]+","+kannadaMovies[8]+","+kannadaMovies[9]+","+kannadaMovies[10]+","
	// +kannadaMovies[11]+","+kannadaMovies[12]+","+kannadaMovies[13]+","+kannadaMovies[14]+","+kannadaMovies[15]+","+kannadaMovies[16]+","+
	// kannadaMovies[17]+","+kannadaMovies[18]+","+kannadaMovies[19]+","+kannadaMovies[20]+","+kannadaMovies[21]+","+kannadaMovies[22]+","
	// +kannadaMovies[23]+","+kannadaMovies[24]+","+kannadaMovies[25]+","+kannadaMovies[26]+","+kannadaMovies[27]+","+kannadaMovies[28]+","+
	// kannadaMovies[29]+"\n");
	
	// System.out.println("The telugu movies on netflix are :");
	// System.out.println(teluguMovies[0]+","+teluguMovies[1]+","+teluguMovies[2]+","+teluguMovies[3]+","+teluguMovies[4]+","+
	// teluguMovies[5]+","+teluguMovies[6]+","+teluguMovies[7]+","+teluguMovies[8]+","+teluguMovies[9]+","+teluguMovies[10]+","
	// +teluguMovies[11]+","+teluguMovies[12]+","+teluguMovies[13]+","+teluguMovies[14]+","+teluguMovies[15]+","+teluguMovies[16]+","+
	// teluguMovies[17]+","+teluguMovies[18]+","+teluguMovies[19]+","+teluguMovies[20]+","+teluguMovies[21]+","+teluguMovies[22]+","
	// +teluguMovies[23]+","+teluguMovies[24]+","+teluguMovies[25]+","+teluguMovies[26]+","+teluguMovies[27]+","+teluguMovies[28]+","+
	// teluguMovies[29]+"\n");
	
	// System.out.println("The tamil movies on netflix are :");
	// System.out.println(tamilMovies[0]+","+tamilMovies[1]+","+tamilMovies[2]+","+tamilMovies[3]+","+tamilMovies[4]+","+
	// tamilMovies[5]+","+tamilMovies[6]+","+tamilMovies[7]+","+tamilMovies[8]+","+tamilMovies[9]+","+tamilMovies[10]+","
	// +tamilMovies[11]+","+tamilMovies[12]+","+tamilMovies[13]+","+tamilMovies[14]+","+tamilMovies[15]+","+tamilMovies[16]+","+
	// tamilMovies[17]+","+tamilMovies[18]+","+tamilMovies[19]+","+tamilMovies[20]+","+tamilMovies[21]+","+tamilMovies[22]+","
	// +tamilMovies[23]+","+tamilMovies[24]+","+tamilMovies[25]+","+tamilMovies[26]+","+tamilMovies[27]+","+tamilMovies[28]+","+
	// tamilMovies[29]+"\n");
	
	// System.out.println("The malayalam movies on netflix are :");
	// System.out.println(malayalamMovies[0]+","+malayalamMovies[1]+","+malayalamMovies[2]+","+malayalamMovies[3]+","+malayalamMovies[4]+","+
	// malayalamMovies[5]+","+malayalamMovies[6]+","+malayalamMovies[7]+","+malayalamMovies[8]+","+malayalamMovies[9]+","+malayalamMovies[10]+","
	// +malayalamMovies[11]+","+malayalamMovies[12]+","+malayalamMovies[13]+","+malayalamMovies[14]+","+malayalamMovies[15]+","+malayalamMovies[16]+","+
	// malayalamMovies[17]+","+malayalamMovies[18]+","+malayalamMovies[19]+","+malayalamMovies[20]+","+malayalamMovies[21]+","+malayalamMovies[22]+","
	// +malayalamMovies[23]+","+malayalamMovies[24]+","+malayalamMovies[25]+","+malayalamMovies[26]+","+malayalamMovies[27]+","+malayalamMovies[28]+","+
	// malayalamMovies[29]+"\n");
  
  }
  
  static void getHindiMovies(){
	  System.out.println("the hindi movies available on netflix are:");
	  for(String hindiMovie : hindiMovies ){
		  System.out.println(hindiMovie);
	  }
  }
  
  static void getenglishMovies(){
	  System.out.println("the english movies available on netflix are:");
	  for(String englishMovie : englishMovies ){
		  System.out.println(englishMovie);
	  }
  }
  
  static void getmalayalamMovies(){
	  System.out.println("the malayalam movies available on netflix are:");
	  for(String malayalamMovie : malayalamMovies ){
		  System.out.println(malayalamMovie);
	  }
  }
  
  static void getkannadaMovies(){
	  System.out.println("the kannada movies available on netflix are:");
	  for(String kannadaMovie : kannadaMovies ){
		  System.out.println(kannadaMovie);
	  }
  }
  
  static void getteluguMovies(){
	  System.out.println("the telugu movies available on netflix are:");
	  for(String teluguMovie : teluguMovies ){
		  System.out.println(teluguMovie);
	  }
  }
  
  static void gettamilMovies(){
	  System.out.println("the tamil movies available on netflix are:");
	  for(String tamilMovie : tamilMovies ){
		  System.out.println(tamilMovie);
	  }
  }

}