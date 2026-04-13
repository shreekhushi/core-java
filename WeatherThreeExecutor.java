class WeatherThreeExecutor{
	public static void main(String[] w){
		Climate climate = new Climate();
		Weather weather = new Weather(1501,30,65,climate);
		weather.getWeatherDetails();
	}
}