class MapThreeExecutor{
	public static void main(String[] m){
		Location location = new Location();
		Map map = new Map(1,"Physical", "1:50000", location);
		map.getMapDetails();
	}
}