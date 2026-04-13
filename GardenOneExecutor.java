class GardenOneExecutor{
	public static void main(String[] g){
		Garden garden = new Garden();
		garden.gardenId = 301;
		garden.gardenName = "Lalbagh";
		garden.area = 240;
		
		Flower flower = new Flower();
		flower.flowerId = 401;
		flower.flowerName = "Rose";
		flower.color = "Red";
		
		garden.flower = flower;
		
		garden.getGardenDetails();
	}
}