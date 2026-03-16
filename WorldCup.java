class WorldCup{
	
	static String groupA[] ={ "India", "Namibia", "Netherlands", "Pakistan", "USA"};
	static String groupB[] ={ "Australia", "Ireland", "Oman", "Sri Lanka", "Zimbabwe"};
	static String groupC[] ={ "England", "Italy", "Nepal", "Scotland", "West Indies"};
	static String groupD[] ={ "Afghanistan", "Canada", "New Zealand", "South Africa", "UAE"};
	
 public static void main(String[] args){
	 
	getgroupA();
	System.out.println("\n");
	getgroupB();
	System.out.println("\n");
	getgroupC();
	System.out.println("\n");
	getgroupD();
	
	// System.out.println("The group A includes 5 teams:");
	// System.out.println(groupA[0]+","+groupA[1]+","+groupA[2]+","+groupA[3]+","+groupA[4]);
	
	// System.out.println("The group B includes 5 teams:");
	// System.out.println(groupB[0]+","+groupB[1]+","+groupB[2]+","+groupB[3]+","+groupB[4]);
	
	// System.out.println("The group C includes 5 teams:");
	// System.out.println(groupC[0]+","+groupC[1]+","+groupC[2]+","+groupC[3]+","+groupC[4]);
	
	// System.out.println("The group D includes 5 teams:");
	// System.out.println(groupD[0]+","+groupD[1]+","+groupD[2]+","+groupD[3]+","+groupD[4]);
 }
  
  static void getgroupA(){
	  System.out.println("The teams in group A are : ");
	  for(String teamA : groupA ){
		  System.out.println(teamA);
	  }
  }
  
  static void getgroupB(){
	  System.out.println("The teams in group B are :");
	  for(String teamB: groupB){
		  System.out.println(teamB);
	  }
  }
  
  static void getgroupC(){
	  System.out.println("The teams in group C are:");
	  for(String teamC : groupC){
		  System.out.println(teamC);
	  }
  }
  
  static void getgroupD(){
	  System.out.println("The teams of group D are:");
	  for(String teamD : groupD){
		  System.out.println(teamD);
	  }
  }
}