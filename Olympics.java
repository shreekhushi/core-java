class Olympics{
    static String sportNames[]= {"Swimming", "Karate", "Cricket","volley","tennis","Relay"};
	
	public static void getSportNames(){
		System.out.println("getSportNames invoked");
		for(String sportName : sportNames){
			System.out.println(sportName);
		}
		System.out.println("end of getSportNames");
	}
}