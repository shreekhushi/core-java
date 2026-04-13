class MapOneExecutor{
	public static void main(String[] m){
		Map map = new Map();
		map.mapId = 1;
		map.mapType = "Physical";
		map.scale = "1:50000";
		
		Location location = new Location();
		location.locationId = 10;
		location.name = "bengaluru";
		location.coordinates = "12.97N, 77.59E";
		
		map.location = location;
		
		map.getMapDetails();
	}
}