class SouthIndia{

    String airportNames[] = new String[9];
    int index;

    public boolean addAirport(String airport){
        System.out.println("Invoked addAirport");
        boolean isAirportAdded = false;

        if (index < airportNames.length){

            if (airport != null && !airport.isEmpty()){
                airportNames[index++] = airport;
                isAirportAdded = true;
            } else System.out.println("Invalid Airport Name");
            

        } else  System.out.println("Cannot add more airports");
        

        return isAirportAdded;
    }

    public void getAirports() {
        System.out.println("The list of airport names are:");
        for (String airport : airportNames)
            System.out.println(airport);
        
    }
	
	public String getAirportByName(String nameOfAirport){
		System.out.println("invoked getAirportByName");
		String name = null;
		for(String airportName : airportNames){
			if(airportName == nameOfAirport){
				name = airportName;
				break;
			}
		}
		
		if(name == null){
			System.out.println(nameOfAirport +" not found");
		}
		
		return name;
	}
	
	public boolean updateAirport(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateAirport");
		boolean isAirportUpdated = false;
		for(int index = 0; index < airportNames.length; index++){
			if(airportNames[index] == oldName){
				airportNames[index] = newName;
				isAirportUpdated = true;
			}
		}
		
		if(isAirportUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isAirportUpdated;
	}
	
	public boolean deleteAirport(String nameOfAirport){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteAirport");
		boolean isAirportDeleted = false;
		for(int index = 0; index < airportNames.length; index++){
			if(airportNames[index] == nameOfAirport){
				airportNames[index] = null;
				isAirportDeleted = true;
			}
		}
		
		if(isAirportDeleted == false){
			System.out.println(nameOfAirport + " not found");
		}
		
		return isAirportDeleted;
	}
}