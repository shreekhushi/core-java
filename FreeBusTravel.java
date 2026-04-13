class FreeBusTravel{
	int travelId;
	String eligibility;
	String route;
	Aadhaar aadhaar;
	
	public void getFreeBusTravelDetails(){
		System.out.println("getFreeBusTravelDetails invoked");
		System.out.println("the travel id is: " +travelId);
		System.out.println("the eligibility is: " +eligibility);
		System.out.println("the route is: " +route);
		aadhaar.getAadhaarDetails();
		System.out.println("getFreeBusTravelDetails ended");
	}
	
	FreeBusTravel(int travelId, String eligibility, String route, Aadhaar aadhaar){
		this.travelId = travelId;
		this.eligibility = eligibility;
		this.route = route;
		this.aadhaar = aadhaar;
	}
	
	FreeBusTravel(){
		
	}
	
	public boolean createAadhaar(Aadhaar aadhaar){
		this.aadhaar = aadhaar;
		return true;
	}
}