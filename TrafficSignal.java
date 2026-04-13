class TrafficSignal{
	int signalId;
	String signalType;
	String location;
	Cop cop;
	
	public void getTrafficSignalDetails(){
		System.out.println("getTrafficSignalDetails invoked");
		System.out.println("the signal id is: " +signalId);
		System.out.println("the signal type is: " +signalType);
		System.out.println("the location is: " +location);
		cop.getCopDetails();
		System.out.println("getTrafficSignalDetails ended");
	}
	
	TrafficSignal(int signalId, String signalType, String location, Cop cop){
		this.signalId = signalId;
		this.signalType = signalType;
		this.location = location;
		this.cop = cop;
	}
	
	TrafficSignal(){
		
	}
	
	public boolean createCop(Cop cop){
		this.cop = cop;
		return true;
	}
}