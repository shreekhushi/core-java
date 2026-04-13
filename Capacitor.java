class Capacitor{
	int capacitorId;
	int voltage;
	double capacity;
	
	public void getCapacitorDetails(){
		System.out.println("getCapacitorDetails invoked");
		System.out.println("capacitor is is: " +capacitorId);
		System.out.println("capacitor voltage is: " + voltage);
		System.out.println("capacitor capacity is: " + capacity);
		System.out.println("getCapacitorDetails ended");
	}
}