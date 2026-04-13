class Crop{
	int cropId;
	String cropName;
	int yield;
	Season season;
	
	public void getCropDetails(){
		System.out.println("getCropDetails invoked");
		System.out.println("the crop id is: " +cropId);
		System.out.println("the crop name is: " +cropName);
		System.out.println("the yield is: " +yield);
		season.getSeasonDetails();
		System.out.println("getCropDetails ended");
	}
	
	Crop(int cropId, String cropName, int yield, Season season){
		this.cropId = cropId;
		this.cropName = cropName;
		this.yield = yield;
		this.season = season;
	}
	
	Crop(){
		
	}
	
	public boolean createSeason(Season season){
		this.season = season;
		return true;
	}
}