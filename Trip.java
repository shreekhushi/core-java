class Trip{

    String places[] = new String[13];
    int index;

    public boolean addPlace(String place) {
        System.out.println("invoked addPlace");
        boolean isPlaceAdded = false;

        if (index < places.length){

            if (place != null && !place.isEmpty()){
                places[index++] = place;
                isPlaceAdded = true;
                System.out.println("added place");
            } else System.out.println("no place");
            

        } else System.out.println("contact later................");
        

        return isPlaceAdded;
    }

    public void getPlaces() {
        System.out.println("invoked getPlaces");
        for (String place : places) 
            System.out.println(place);
        
    }
	
	public String getPlaceByName(String nameOfPlace){
		System.out.println("invoked getPlaceByName");
		String name = null;
		for(String place : places){
			if(place == nameOfPlace){
				name = place;
				break;
			}
		}
		
		if(name == null){
			System.out.println(nameOfPlace +" not found");
		}
		
		return name;
	}
	
	public boolean updatePlace(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updatePlace");
		boolean isPlaceUpdated = false;
		for(int index = 0; index < places.length; index++){
			if(places[index] == oldName){
				places[index] = newName;
				isPlaceUpdated = true;
			}
		}
		
		if(isPlaceUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isPlaceUpdated;
	}
	
	public boolean deletePlace(String nameOfPlace){
		System.out.println("-----------------------------");
		System.out.println("invoked deletePlace");
		boolean isPlaceDeleted = false;
		for(int index = 0; index < places.length; index++){
			if(places[index] == nameOfPlace){	
				places[index] = null;
				isPlaceDeleted = true;
			}
		}
		
		if(isPlaceDeleted == false){
			System.out.println(nameOfPlace + " not found");
		}
		
		return isPlaceDeleted;
	}
}