class Location{
	int locationId;
	String name;
	String coordinates;
	
	public void getLocationDetails(){
		System.out.println("getLocationDetails invoked");
		System.out.println("the location id is: " + locationId);
		System.out.println("the location name is: " +name);
		System.out.println("the location coordinates is: " +coordinates);
		System.out.println("getLocationDetails ended");
	}
}