class PrisonOneExecutor{
	public static void main(String[] p){
		Prison prison = new Prison();
		prison.prisonId = 1701;
		prison.location = "Central Jail";
		prison.capacity = 500;
		
		Criminal criminal = new Criminal();
		criminal.criminalId = 1801;
		criminal.name = "Suresh";
		criminal.crimeType = "Robbery";
		
		prison.criminal = criminal;
		
		prison.getPrisonDetails();
	}
}