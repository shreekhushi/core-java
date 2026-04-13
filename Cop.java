class Cop{
	int copId;
	String name;
	String badgeNumber;
	
	public void getCopDetails(){
		System.out.println("getCopDetails invoked");
		System.out.println("the cop id is: " +copId);
		System.out.println("the cop name is: " +name);
		System.out.println("the badge number is: " +badgeNumber);
		System.out.println("getCopDetails ended");
	}
}