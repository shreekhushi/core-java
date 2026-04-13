class GardenThreeExecutor{
	public static void main(String[] g){
		Flower flower = new Flower();
		Garden garden = new Garden(301,"Lalbagh",240,flower);
		garden.getGardenDetails();
	}
}