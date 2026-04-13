class IPL{
	int tournamentId;
	int year;
	String sponsor;
	RCB rcb;
	
	public void getIPLDetails(){
		System.out.println("getIPLDetails invoked");
		System.out.println("the tournament id is: " +tournamentId);
		System.out.println("the year is: " +year);
		System.out.println("the sponsor is: " +sponsor);
		rcb.getRCBDetails();
		System.out.println("getIPLDetails ended");
	}
	
	IPL(int tournamentId, int year, String sponsor, RCB rcb){
		this.tournamentId = tournamentId;
		this.year = year;
		this.sponsor = sponsor;
		this.rcb = rcb;
	}
	
	IPL(){
		
	}
	
	public boolean createRCB(RCB rcb){
		this.rcb = rcb;
		return true;
	}
}