class PrisonTwoExecutor{
	public static void main(String[] p){
		Prison prison = new Prison();
		prison.prisonId = 1701;
		prison.location = "Central Jail";
		prison.capacity = 500;
		
		Criminal criminal = new Criminal();
		criminal.criminalId = 1801;
		criminal.name = "Suresh";
		criminal.crimeType = "Robbery";
		
		boolean create = prison.createCriminal(criminal);
		System.out.println(create);
		
		prison.getPrisonDetails();
	}
}