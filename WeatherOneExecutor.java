class WeatherOneExecutor{
	public static void main(String[] w){
		Weather weather = new Weather();
		weather.weatherId = 1501;
		weather.temperature = 30;
		weather.humidity = 65;
		
		Climate climate = new Climate();
		climate.climateId = 1601;
		climate.type = "Tropical";
		climate.region = "South India";
		
		weather.climate = climate;
		
		weather.getWeatherDetails();
	}
}