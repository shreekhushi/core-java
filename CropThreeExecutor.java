class CropThreeExecutor{
	public static void main(String[] c){
		Season season = new Season();
		Crop crop = new Crop(1901,"Rice",2000,season);
		crop.getCropDetails();
	}
}