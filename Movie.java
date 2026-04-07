class Movie{

    String casts[] = new String[9];
    int index;

    public boolean addCast(String cast){
        System.out.println("invoked addCast");
        boolean isCastAdded = false;

        if (index < casts.length){

            if (cast != null && !cast.isEmpty()){
                casts[index++] = cast;
                isCastAdded = true;
                System.out.println("added cast");
            } else System.out.println("no cast");
            

        } else  System.out.println("contact later................");
        

        return isCastAdded;
    }

    public void getCasts() {
        System.out.println("invoked getCasts");
        for (String cast : casts) 
            System.out.println(cast);
        
    }
	
	public String getCastsByName(String castName){
		System.out.println("invoked getCastsByName");
		String name = null;
		for(String cast : casts){
			if(cast == castName){
				name = cast;
				break;
			}
		}
		
		if(name == null){
			System.out.println(castName +" not found");
		}
		
		return name;
	}
	
	public boolean updateCast(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateCast");
		boolean isCastUpdated = false;
		for(int index = 0; index < casts.length; index++){
			if(casts[index] == oldName){
				casts[index] = newName;
				isCastUpdated = true;
			}
		}
		
		if(isCastUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isCastUpdated;
	}
	
	public boolean deleteCast(String castName){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteCast");
		boolean isCastDeleted = false;
		for(int index = 0; index < casts.length; index++){
			if(casts[index] == castName){	
				casts[index] = null;
				isCastDeleted = true;
			}
		}
		
		if(isCastDeleted == false){
			System.out.println(castName + " not found");
		}
		
		return isCastDeleted;
	}
	
}