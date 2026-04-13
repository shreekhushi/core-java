class FreeBusTravelTwoExecutor{
	public static void main(String[] f){
		FreeBusTravel travel = new FreeBusTravel();
		travel.travelId = 2101;
		travel.eligibility = "Women";
		travel.route = "City Bus";
		
		Aadhaar aadhaar = new Aadhaar();
		aadhaar.aadhaarNumber = 123456789012L;
		aadhaar.holderName = "Priya";
		aadhaar.address = "Bangalore";
		
		boolean create = travel.createAadhaar(aadhaar);
		System.out.println(create);
		
		travel.getFreeBusTravelDetails();
	}
}