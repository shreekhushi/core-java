class Weather{
	int weatherId;
	int temperature;
	int humidity;
	Climate climate;
	
	public void getWeatherDetails(){
		System.out.println("getWeatherDetails invoked");
		System.out.println("the weather id is: " +weatherId);
		System.out.println("the temperature is: " +temperature);
		System.out.println("the humidity is: " +humidity);
		climate.getClimateDetails();
		System.out.println("getWeatherDetails ended");
	}
	
	Weather(int weatherId, int temperature, int humidity, Climate climate){
		this.weatherId = weatherId;
		this.temperature = temperature;
		this.humidity = humidity;
		this.climate = climate;
	}
	
	Weather(){
		
	}
	
	public boolean createClimate(Climate climate){
		this.climate = climate;
		return true;
	}
}