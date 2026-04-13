class PVRThreeExecutor{
	public static void main(String[] p){
		Screen screen = new Screen();
		PVR pvr = new PVR(501,"Orion Mall",10,screen);
		pvr.getPVRDetails();
	}
}