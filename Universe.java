class Universe{

    String galaxies[] = new String[11];
    int index;

    public boolean addGalaxy(String galaxy){
        System.out.println("Invoked addGalaxy");
        boolean isGalaxyAdded = false;

        if (index < galaxies.length) {

            if (galaxy != null && !galaxy.isEmpty()){
                galaxies[index++] = galaxy;
                isGalaxyAdded = true;
            } else System.out.println("Invalid Galaxy Name");
            

        } else  System.out.println("Cannot add more galaxies");
        

        return isGalaxyAdded;
    }

    public void getGalaxies(){
        System.out.println("The list of galaxies are:");
        for (String galaxy : galaxies)
            System.out.println(galaxy);
        
    }
	
	public String getGalaxysByName(String nameOfGalaxy){
		System.out.println("invoked getGalaxysByName");
		String name = null;
		for(String galaxie : galaxies){
			if(galaxie == nameOfGalaxy){
				name = galaxie;
				break;
			}
		}
		
		if(name == null){
			System.out.println(nameOfGalaxy +" not found");
		}
		
		return name;
	}
	
	public boolean updateGalaxy(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateGalaxy");
		boolean isGalaxyUpdated = false;
		for(int index = 0; index < galaxies.length; index++){
			if(galaxies[index] == oldName){
				galaxies[index] = newName;
				isGalaxyUpdated = true;
			}
		}
		
		if(isGalaxyUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isGalaxyUpdated;
	}
	
	public boolean deleteGalaxy(String nameOfGalaxy){
		System.out.println("-----------------------------");
		System.out.println("invoked deletegalaxy");
		boolean isGalaxyDeleted = false;
		for(int index = 0; index < galaxies.length; index++){
			if(galaxies[index] == nameOfGalaxy){	
				galaxies[index] = null;
				isGalaxyDeleted = true;
			}
		}
		
		if(isGalaxyDeleted == false){
			System.out.println(nameOfGalaxy + " not found");
		}
		
		return isGalaxyDeleted;
	}
}