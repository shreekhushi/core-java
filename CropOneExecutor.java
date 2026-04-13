class CropOneExecutor{
	public static void main(String[] c){
		Crop crop = new Crop();
		crop.cropId = 1901;
		crop.cropName = "Rice";
		crop.yield = 2000;
		
		Season season = new Season();
		season.seasonId = 2001;
		season.seasonName = "Kharif";
		season.duration = "4 months";
		
		crop.season = season;
		
		crop.getCropDetails();
	}
}