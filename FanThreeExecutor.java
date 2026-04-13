class FanThreeExecutor{
	public static void main(String[] f){
		Capacitor capacitor = new Capacitor();
		Fan fan = new Fan(101 , "Usha", 3, capacitor);
		fan.getFanDetails();
	}
}