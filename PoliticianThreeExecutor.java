class PoliticianThreeExecutor{
	public static void main(String[] p){
		Voter voter = new Voter();
		Politician politician = new Politician(1301,"Raj Kumar","ABC Party",voter);
		politician.getPoliticianDetails();
	}
}