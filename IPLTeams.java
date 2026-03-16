class IPLTeams{
	static String teamNames[] = {"Royal Challengers Bengaluru","Chennai Super Kings","Delhi Capitals","Gujarat Titan",
  "Kolkata Knight Riders","Lucknow Super Giants","Mumbai Indians","Punjab Kings","Rajasthan Royals",
  "Sunrisers Hyderabad"};

  public static void main(String[] ipl){
     getteamNames();
  // System.out.println(teamNames[0]+"\n"+teamNames[1]+"\n"+teamNames[2]+"\n"+teamNames[3]+"\n"+teamNames[4]+"\n"+teamNames[5]
  // +"\n"+teamNames[6]+"\n"+teamNames[7]+"\n"+teamNames[8]+"\n"+teamNames[9]);
  
  }
  
  static void getteamNames(){
	  System.out.println("the IPL teams are:");
	  for(String teamName:teamNames){
		  System.out.println(teamName);
	  }
  }




}