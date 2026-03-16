class AirConditionerExecutor{
	public static void main(String[] args){
		
	AirConditioner.power();
		
	int temperature = AirConditioner.getTemperature();
    System.out.println("Current Temperature: " + temperature);

    AirConditioner.increaseTemperature();
    AirConditioner.increaseTemperature();
    temperature = AirConditioner.getTemperature();
    System.out.println("Temperature after increase: " + temperature);

    AirConditioner.decreaseTemperature();
    temperature = AirConditioner.getTemperature();
    System.out.println("Temperature after decrease: " + temperature);
	
	AirConditioner.increaseTemperature();
    AirConditioner.increaseTemperature();
	AirConditioner.power();
	AirConditioner.increaseTemperature();
	AirConditioner.increaseTemperature();
    temperature = AirConditioner.getTemperature();
    System.out.println("Temperature after increase: " + temperature);
	
	System.out.println("Current Temperature: " + temperature);
	AirConditioner.power();
	}
   
}