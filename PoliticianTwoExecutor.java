class PoliticianTwoExecutor{
	public static void main(String[] p){
		Politician politician = new Politician();
		politician.politicianId = 1301;
		politician.name = "Raj Kumar";
		politician.party = "ABC Party";
		
		Voter voter = new Voter();
		voter.voterId = 1401;
		voter.name = "khushi";
		voter.age = 22;
		
		boolean create = politician.createVoter(voter);
		System.out.println(create);
		
		politician.getPoliticianDetails();
	}
}