class Climate{
	int climateId;
	String type;
	String region;
	
	public void getClimateDetails(){
		System.out.println("getClimateDetails invoked");
		System.out.println("the climate id is: " +climateId);
		System.out.println("the climate type is: " +type);
		System.out.println("the region is: " +region);
		System.out.println("getClimateDetails ended");
	}
}