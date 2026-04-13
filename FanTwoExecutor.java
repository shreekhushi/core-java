class FanTwoExecutor{
	public static void main(String[] f){
		Fan fan = new Fan();
		fan.fanId = 101;
		fan.brand = "usha";
		fan.speed = 3;
		
		Capacitor capacitor = new Capacitor();
		capacitor.capacitorId = 201;
		capacitor.voltage = 230;
		capacitor.capacity = 2.5;
		
		boolean create = fan.createCapacitor(capacitor);
		System.out.println(create);
		
		fan.getFanDetails();
	}
}