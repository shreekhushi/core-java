class Prison{
	int prisonId;
	String location;
	int capacity;
	Criminal criminal;
	
	public void getPrisonDetails(){
		System.out.println("getPrisonDetails invoked");
		System.out.println("the prison id is: " +prisonId);
		System.out.println("the location is: " +location);
		System.out.println("the capacity is: " +capacity);
		criminal.getCriminalDetails();
		System.out.println("getPrisonDetails ended");
	}
	
	Prison(int prisonId, String location, int capacity, Criminal criminal){
		this.prisonId = prisonId;
		this.location = location;
		this.capacity = capacity;
		this.criminal = criminal;
	}
	
	Prison(){
		
	}
	
	public boolean createCriminal(Criminal criminal){
		this.criminal = criminal;
		return true;
	}
}