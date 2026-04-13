class Voter{
	int voterId;
	String name;
	int age;
	
	public void getVoterDetails(){
		System.out.println("getVoterDetails invoked");
		System.out.println("the voter id is: " +voterId);
		System.out.println("the voter name is: " +name);
		System.out.println("the voter age is: " +age);
		System.out.println("getVoterDetails ended");
	}
}