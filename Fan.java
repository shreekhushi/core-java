class Fan{
	int fanId;
	String brand;
	int speed;
	
	Capacitor capacitor;
	
	public void getFanDetails(){
		System.out.println("getFanDetails invoked");
		System.out.println("the fan id is: " + fanId);
		System.out.println("the fan brand is: " + brand);
		System.out.println("the fan speed is: " + speed);
		capacitor.getCapacitorDetails();
		System.out.println("getFanDetails ended");
	}
	
	Fan(int fanId, String brand, int speed, Capacitor capacitor){
		this.fanId = fanId;
		this.brand = brand;
		this.speed = speed;
		this.capacitor = capacitor;
	}
	
	Fan(){
		
	}
	
	// public boolean createCapacitor(Capacitor capacitor){
		// System.out.println("createCapacitor invoked");
		// this.capacitor = capacitor;
		// return true;
	// }
}