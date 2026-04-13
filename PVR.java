class PVR{
	int pvrId;
	String location;
	int totalScreens;
	Screen screen;
	
	public void getPVRDetails(){
		System.out.println("getPVRDetails invoked");
		System.out.println("the pvr id is: " +pvrId);
		System.out.println("the pvr location is: " +location);
		System.out.println("the total screens are: " +totalScreens);
		screen.getScreenDetails();
		System.out.println("getPVRDetails ended");
	}
	
	PVR(int pvrId, String location, int totalScreens, Screen screen){
		this.pvrId = pvrId;
		this.location = location;
		this.totalScreens = totalScreens;
		this.screen = screen;
	}
	
	PVR(){
		
	}
	
	public boolean createScreen(Screen screen){
		this.screen = screen;
		return true;
	}
}