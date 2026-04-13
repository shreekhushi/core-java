class TrafficSignalThreeExecutor{
	public static void main(String[] t){
		Cop cop = new Cop();
		TrafficSignal signal = new TrafficSignal(901,"Automatic","MG Road",cop);
		signal.getTrafficSignalDetails();
	}
}