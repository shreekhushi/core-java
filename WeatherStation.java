class WeatherStation{

    double temperatureReadings[] = new double[17];
    int index;

    public boolean addTemperature(double temp){
        System.out.println("invoked addTemperature");
        boolean isAdded = false;

        if (index < temperatureReadings.length){

            temperatureReadings[index++] = temp;
            isAdded = true;
            System.out.println("added temperature");

        } else System.out.println("contact later................");
        

        return isAdded;
    }

    public void getTemperatures() {
        System.out.println("invoked getTemperatures");
        for (double temp : temperatureReadings) 
            System.out.println(temp);
        
    }
	
	public double getTemperatureByReadings(double tempReadings){
		System.out.println("invoked getTemperatureByReadings");
		double value = 0.0;
		for(double temperatureReading : temperatureReadings){
			if(temperatureReading == tempReadings){
				value = temperatureReading;
				break;
			}
		}
		
		if(value == 0.0){
			System.out.println(tempReadings +" not found");
		}
		
		return value;
	}
	
	public boolean updateReading(double oldValue, double newValue){
		System.out.println("-----------------------------");
		System.out.println("invoked updateReading");
		boolean isReadingUpdated = false;
		for(int index = 0; index < temperatureReadings.length; index++){
			if(temperatureReadings[index] == oldValue){
				temperatureReadings[index] = newValue;
				isReadingUpdated = true;
			}
		}
		
		if(isReadingUpdated == false){
			System.out.println(oldValue + " not found");
		}
		
		return isReadingUpdated;
	}
	
	public boolean deleteReading(double tempReadings){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteReading");
		boolean isReadingDeleted = false;
		for(int index = 0; index < temperatureReadings.length; index++){
			if(temperatureReadings[index] == tempReadings){	
				temperatureReadings[index] = 0.0;
				isReadingDeleted = true;
			}
		}
		
		if(isReadingDeleted == false){
			System.out.println(tempReadings + " not found");
		}
		
		return isReadingDeleted;
	}
}