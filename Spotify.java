class Spotify{
   static String songs[] = { "Shape of You - Ed Sheeran", "Blinding Lights - The Weeknd", "Levitating - Dua Lipa",
            "Kesariya - Arijit Singh","Perfect - Ed Sheeran","Believer - Imagine Dragons","Senorita - Shawn Mendes & Camila Cabello",
            "Calm Down - Rema","Dance Monkey - Tones and I","As It Was - Harry Styles"};
	public static void getSongs(){
	System.out.println("getSongs invoked");
	for(String song : songs){
	System.out.println(song);
	}
	System.out.println("end of getSongs");		
	}
}