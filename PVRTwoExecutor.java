class PVRTwoExecutor{
	public static void main(String[] p){
		PVR pvr = new PVR();
		pvr.pvrId = 501;
		pvr.location = "Orion Mall";
		pvr.totalScreens = 10;
		
		Screen screen = new Screen();
		screen.screenId = 601;
		screen.screenType = "IMAX";
		screen.seatingCapacity = 200;
		
		boolean create = pvr.createScreen(screen);
		System.out.println(create);
		
		pvr.getPVRDetails();
	}
}