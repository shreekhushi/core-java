class WeatherStationExecutor{

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        boolean added = station.addTemperature(28.5);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(30.2);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(27.8);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(29.1);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(31.0);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(32.3);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(26.7);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(25.9);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(33.4);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(34.2);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(28.9);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(27.5);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(29.8);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(30.7);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(31.5);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(26.3);
        System.out.println(added);
        System.out.println("---------------");

        added = station.addTemperature(24.8);
        System.out.println(added);
        System.out.println("---------------");

        station.getTemperatures();
		
		double value = station.getTemperatureByReadings(31.5);
		System.out.println(value);
		
		boolean update = station.updateReading(26.3, 26.6);
		System.out.println(update);
		
		station.getTemperatures();
		
		boolean delete = station.deleteReading(27.5);
		System.out.println(delete);
		
		station.getTemperatures();
    }
}