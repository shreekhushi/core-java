class TrafficSignalTwoExecutor{
	public static void main(String[] t){
		TrafficSignal signal = new TrafficSignal();
		signal.signalId = 901;
		signal.signalType = "Automatic";
		signal.location = "MG Road";
		
		Cop cop = new Cop();
		cop.copId = 1001;
		cop.name = "Ravi";
		cop.badgeNumber = "KA1234";
		
		boolean create = signal.createCop(cop);
		System.out.println(create);
		
		signal.getTrafficSignalDetails();
	}
}