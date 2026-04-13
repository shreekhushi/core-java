class Map{
	int mapId;
	String mapType;
	String scale;
	Location location;
	
	public void getMapDetails(){
		System.out.println("getMapDetails invoked");
		System.out.println("the map id is: " +mapId);
		System.out.println("the map type is: " +mapType);
		System.out.println("the map scale is: " +scale);
		location.getLocationDetails();
		System.out.println("getMapDetails ended");
	}
	
	Map(int mapId, String mapType, String scale, Location location){
		this.mapId = mapId;
		this.mapType = mapType;
		this.scale = scale;
		this.location = location;
	}
	Map(){
		
	}
	
	// public boolean createLocation(Location location){
		// this.location = location;
		// return true;
	// }

}