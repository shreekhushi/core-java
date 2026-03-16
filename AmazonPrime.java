class AmazonPrime{
	
	   static String hindiSeries[] = {"Mirzapur","Panchayat","The Family Man","Breathe","Breathe: Into the Shadows","Made In Heaven","Paatal Lok","Bandish Bandits","Jee Karda","Tandav",
        "Mumbai Diaries 26/11","Crash Course","Pushpavalli","Inside Edge","Four More Shots Please!","One Mic Stand","Hostel Daze","Comicstaan",
        "Laakhon Mein Ek","Rasbhari","Modern Love: Mumbai","Dahaad","Farzi","Jubilee","Call Me Bae","Shehar Lakhot","Indian Police Force",
        "Hush Hush","The Last Hour","Chacha Vidhayak Hain Humare"
        };

        static String englishSeries[] = {"The Boys","Gen V","Reacher","Tom Clancy's Jack Ryan", "The Lord of the Rings: The Rings of Power","Good Omens", "The Marvelous Mrs. Maisel","Fleabag","Upload","Invincible",
        "The Terminal List","Bosch","Bosch: Legacy","The Expanse","Goliath","Outer Range","Homecoming","Hanna","The Man in the High Castle","Daisy Jones & The Six",
        "The Devil's Hour","Dead Ringers","The Summer I Turned Pretty","Harlem","Poldark","The Wheel of Time","Citadel","Modern Love","Carnival Row","The Tick"
        };

        static String tamilSeries[] = {"Suzhal: The Vortex","Inspector Rishi","Modern Love Chennai","Vadhandhi","November Story","The Village","Auto Shankar",
        "Paper Rocket","Irai","Time Enna Boss","Navarasa","Queen","Triples","Live Telecast","Anantham","Parampara","The Family Man","Mirzapur","Paatal Lok","The Boys",
        "Reacher","Farzi","Dahaad","Hostel Daze","Inside Edge","Breathe","Tandav","Made In Heaven","Citadel","Gen V"
        };

        static String teluguSeries[] = {"Modern Love Hyderabad","Parampara","Dhootha","Gaalivaana","Kudi Yedamaithe","Unheard","ATM","Anger Tales","Newsense",
        "Jhansi","Dead Pixels","The Family Man","Mirzapur","Paatal Lok","The Boys","Reacher","Farzi","Dahaad","Suzhal","Inspector Rishi","Citadel","Gen V",
        "Made In Heaven","Breathe","Tandav","Hostel Daze","Inside Edge","Modern Love","The Terminal List","The Wheel of Time"
        };

        static String kannadaSeries[] = {"Parampara","Modern Love","The Family Man","Mirzapur","Paatal Lok","The Boys","Reacher","Farzi","Dahaad",
        "Suzhal","Inspector Rishi","Citadel","Gen V","Made In Heaven","Breathe","Tandav","Hostel Daze","Inside Edge","The Terminal List","The Wheel of Time",
        "Upload","Invincible","Jack Ryan","Goliath","Outer Range","Hanna","Homecoming","Carnival Row","Good Omens","The Expanse"
        };

        static String malayalamSeries[] = {"Kerala Crime Files","The Family Man","Mirzapur","Paatal Lok","The Boys","Reacher","Farzi","Dahaad",
        "Suzhal","Inspector Rishi","Citadel","Gen V","Made In Heaven","Breathe","Tandav","Hostel Daze","Inside Edge","Modern Love","The Terminal List",
        "The Wheel of Time","Upload","Invincible","Jack Ryan","Goliath","Outer Range","Hanna","Homecoming","Carnival Row","Good Omens","The Expanse"
        };
		
		
  public static void main(String[] args){
  
  
    String ottName = "Amazon Prime";
	System.out.println("The OTT platform is :" + ottName);
	getHindiSeries();
	System.out.println("\n");
	getEnglishSeries();
	System.out.println("\n");
	getKannadaSeries();
	System.out.println("\n");
	getMalayalamSeries();
	System.out.println("\n");
	getTamilSeries();
	System.out.println("\n");
	getTeluguSeries();
		
		// System.out.println("The Hindi series on Amazon Prime are :");
        // System.out.println(hindiSeries[0]+","+hindiSeries[1]+","+hindiSeries[2]+","+hindiSeries[3]+","+hindiSeries[4]+","+hindiSeries[5]+","+hindiSeries[6]+","+hindiSeries[7]+","+hindiSeries[8]+","+hindiSeries[9]+","+hindiSeries[10]+","+
        // hindiSeries[11]+","+hindiSeries[12]+","+hindiSeries[13]+","+hindiSeries[14]+","+hindiSeries[15]+","+hindiSeries[16]+","+hindiSeries[17]+","+hindiSeries[18]+","+hindiSeries[19]+","+hindiSeries[20]+","+hindiSeries[21]+","+hindiSeries[22]+","+
        // hindiSeries[23]+","+hindiSeries[24]+","+hindiSeries[25]+","+hindiSeries[26]+","+hindiSeries[27]+","+hindiSeries[28]+","+hindiSeries[29]+"\n");
		
		// System.out.println("The English series on Amazon Prime are :");
        // System.out.println(englishSeries[0]+","+englishSeries[1]+","+englishSeries[2]+","+englishSeries[3]+","+englishSeries[4]+","+englishSeries[5]+","+englishSeries[6]+","+englishSeries[7]+","+englishSeries[8]+","+englishSeries[9]+","+englishSeries[10]+","+
         // englishSeries[11]+","+englishSeries[12]+","+englishSeries[13]+","+englishSeries[14]+","+englishSeries[15]+","+englishSeries[16]+","+
        // englishSeries[17]+","+englishSeries[18]+","+englishSeries[19]+","+englishSeries[20]+","+englishSeries[21]+","+englishSeries[22]+","+
        // englishSeries[23]+","+englishSeries[24]+","+englishSeries[25]+","+englishSeries[26]+","+englishSeries[27]+","+englishSeries[28]+","+
         // englishSeries[29]+"\n");
		 
		// System.out.println("The Tamil series on Amazon Prime are :");
        // System.out.println(tamilSeries[0]+","+tamilSeries[1]+","+tamilSeries[2]+","+tamilSeries[3]+","+tamilSeries[4]+","+tamilSeries[5]+","+tamilSeries[6]+","+tamilSeries[7]+","+tamilSeries[8]+","+tamilSeries[9]+","+tamilSeries[10]+","+
        // tamilSeries[11]+","+tamilSeries[12]+","+tamilSeries[13]+","+tamilSeries[14]+","+tamilSeries[15]+","+tamilSeries[16]+","+tamilSeries[17]+","+
		// tamilSeries[18]+","+tamilSeries[19]+","+tamilSeries[20]+","+tamilSeries[21]+","+tamilSeries[22]+","+tamilSeries[23]+","+tamilSeries[24]+","+
		// tamilSeries[25]+","+tamilSeries[26]+","+tamilSeries[27]+","+tamilSeries[28]+","+tamilSeries[29]+"\n");


        // System.out.println("The Telugu series on Amazon Prime are :");
        // System.out.println(teluguSeries[0]+","+teluguSeries[1]+","+teluguSeries[2]+","+teluguSeries[3]+","+teluguSeries[4]+","+teluguSeries[5]+","+
		// teluguSeries[6]+","+teluguSeries[7]+","+teluguSeries[8]+","+teluguSeries[9]+","+teluguSeries[10]+","+teluguSeries[11]+","+teluguSeries[12]+","
		// +teluguSeries[13]+","+teluguSeries[14]+","+teluguSeries[15]+","+teluguSeries[16]+","+teluguSeries[17]+","+teluguSeries[18]+","+
		// teluguSeries[19]+","+teluguSeries[20]+","+teluguSeries[21]+","+teluguSeries[22]+","+teluguSeries[23]+","+teluguSeries[24]+","+
		// teluguSeries[25]+","+teluguSeries[26]+","+teluguSeries[27]+","+teluguSeries[28]+","+teluguSeries[29]+"\n");
		
		
		// System.out.println("The Kannada series on Amazon Prime are :");
        // System.out.println(kannadaSeries[0]+","+kannadaSeries[1]+","+kannadaSeries[2]+","+kannadaSeries[3]+","+kannadaSeries[4]+","+kannadaSeries[5]+
		// ","+kannadaSeries[6]+","+kannadaSeries[7]+","+kannadaSeries[8]+","+kannadaSeries[9]+","+kannadaSeries[10]+","+kannadaSeries[11]+","+
		// kannadaSeries[12]+","+kannadaSeries[13]+","+kannadaSeries[14]+","+kannadaSeries[15]+","+kannadaSeries[16]+","+kannadaSeries[17]+","
		// +kannadaSeries[18]+","+kannadaSeries[19]+","+kannadaSeries[20]+","+kannadaSeries[21]+","+kannadaSeries[22]+","+kannadaSeries[23]+","+
		// kannadaSeries[24]+","+kannadaSeries[25]+","+kannadaSeries[26]+","+kannadaSeries[27]+","+kannadaSeries[28]+","+kannadaSeries[29]+"\n");
		
		// System.out.println("The Malayalam series on Amazon Prime are :");
        // System.out.println(malayalamSeries[0]+","+malayalamSeries[1]+","+malayalamSeries[2]+","+malayalamSeries[3]+","+malayalamSeries[4]+","+
		// malayalamSeries[5]+","+malayalamSeries[6]+","+malayalamSeries[7]+","+malayalamSeries[8]+","+malayalamSeries[9]+","+malayalamSeries[10]+","+
        // malayalamSeries[11]+","+malayalamSeries[12]+","+malayalamSeries[13]+","+malayalamSeries[14]+","+malayalamSeries[15]+","+malayalamSeries[16]+","+
        // malayalamSeries[17]+","+malayalamSeries[18]+","+malayalamSeries[19]+","+malayalamSeries[20]+","+malayalamSeries[21]+","+malayalamSeries[22]+","+
        // malayalamSeries[23]+","+malayalamSeries[24]+","+malayalamSeries[25]+","+malayalamSeries[26]+","+malayalamSeries[27]+","+malayalamSeries[28]+","+
        // malayalamSeries[29]+"\n");
		
	}
	
	static void getHindiSeries(){
		System.out.println("The available hindi series are :");
		for (String hindiSerie:hindiSeries){
			System.out.println(hindiSerie);
		}
	}
	
	static void getEnglishSeries(){
		System.out.println("The available english series are :");
		for (String englishSerie:englishSeries){
			System.out.println(englishSerie);
		}
	}
	
	static void getTamilSeries(){
		System.out.println("The available tamil series are :");
		for (String tamilSerie:tamilSeries){
			System.out.println(tamilSerie);
		}
	}
	
	static void getTeluguSeries(){
		System.out.println("The available telugu series are :");
		for (String teluguSerie:teluguSeries){
			System.out.println(teluguSerie);
		}
	}
	
	static void getKannadaSeries(){
		System.out.println("The available kannada series are :");
		for (String kannadaSerie:kannadaSeries){
			System.out.println(kannadaSerie);
		}
	}
	
	static void getMalayalamSeries(){
		System.out.println("The available malayalam series are :");
		for (String malayalamSerie:malayalamSeries){
			System.out.println(malayalamSerie);
		}
	}
	
	
}