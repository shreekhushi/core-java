class Politician{
	int politicianId;
	String name;
	String party;
	Voter voter;
	
	public void getPoliticianDetails(){
		System.out.println("getPoliticianDetails invoked");
		System.out.println("the politician id is: " +politicianId);
		System.out.println("the politician name is: " +name);
		System.out.println("the party is: " +party);
		voter.getVoterDetails();
		System.out.println("getPoliticianDetails ended");
	}
	
	Politician(int politicianId, String name, String party, Voter voter){
		this.politicianId = politicianId;
		this.name = name;
		this.party = party;
		this.voter = voter;
	}
	
	Politician(){
		
	}
	
	public boolean createVoter(Voter voter){
		this.voter = voter;
		return true;
	}
}