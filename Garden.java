class Garden{
	int gardenId;
	String gardenName;
	int area;
	Flower flower;
	
	public void getGardenDetails(){
		System.out.println("getGardenDetails invoked");
		System.out.println("the garden id is: " +gardenId);
		System.out.println("the garden name is: " +gardenName);
		System.out.println("the garden area is: " +area);
		flower.getFlowerDetails();
		System.out.println("getGardenDetails ended");
	}
	
	Garden(int gardenId, String gardenName, int area, Flower flower){
		this.gardenId = gardenId;
		this.gardenName = gardenName;
		this.area = area;
		this.flower = flower;
	}
	
	Garden(){
		
	}
	
	public boolean createFlower(Flower flower){
		this.flower = flower;
		return true;
	}
}