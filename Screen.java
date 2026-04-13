class Screen{
	int screenId;
	String screenType;
	int seatingCapacity;
	
	public void getScreenDetails(){
		System.out.println("getScreenDetails invoked");
		System.out.println("the screen id is: " +screenId);
		System.out.println("the screen type is: " +screenType);
		System.out.println("the seating capacity is: " +seatingCapacity);
		System.out.println("getScreenDetails ended");
	}
}