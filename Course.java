class Course{

    String technologyNames[] = new String[15];
    int index;

    public boolean addTechnology(String tech){
        System.out.println("Invoked addTechnology");
        boolean isTechnologyAdded = false;

        if (index < technologyNames.length){

            if (tech != null && !tech.isEmpty()){
                technologyNames[index++] = tech;
                isTechnologyAdded = true;
            } else  System.out.println("Invalid Technology Name");
            

        } else System.out.println("Cannot add more technologies");
        

        return isTechnologyAdded;
    }

    public void getTechnologies() {
        System.out.println("The list of technology names are:");
        for (String tech : technologyNames) 
            System.out.println(tech);
        
    }
	
	public String getTechnologyByName(String technologyName){
		String name = null;
		for(String technology : technologyNames){
			if(technology == technologyName){
				name = technology;
				break;
			}
		}
		if(name == null){
			System.out.println(name + " not found");
		}
		return name;
	}
	
	public boolean updateTechnologyName(String oldTechnology, String newTechnology){
		System.out.println("---------------------");
		boolean isTechnologyUpdated = false;
		
		for(int index=0; index < technologyNames.length; index++){
			if(technologyNames[index] == oldTechnology){
				technologyNames[index] = newTechnology;
				isTechnologyUpdated = true;
			}
		}
		
		if(isTechnologyUpdated==false){
			System.out.println(oldTechnology + " not found");
		}
		
		return isTechnologyUpdated;
	}
	
	public boolean deleteTechnology(String technologyName){
		System.out.println("---------------------");
		boolean isTechnologydeleted = false;
		
		for(int index=0; index < technologyNames.length; index++){
			if(technologyNames[index] == technologyName){
				technologyNames[index] = null;
				isTechnologydeleted = true;
			}
		}
		
		if(isTechnologydeleted==false){
			System.out.println(technologyName + " not found");
		}
		
		return isTechnologydeleted;
	}
}