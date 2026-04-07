class Olympic{

    String sportNames[] = new String[11];
    int index;

    public boolean addSport(String sport) {
        System.out.println("invoked addSport");
        boolean isSportAdded = false;

        if (index < sportNames.length) {

            if (sport != null && !sport.isEmpty()) {
                sportNames[index++] = sport;
                isSportAdded = true;
                System.out.println("added sport");
            } else {
                System.out.println("no sport");
            }

        } else  System.out.println("contact later................");
        

        return isSportAdded;
    }

    public void getSports() {
        System.out.println("invoked getSports");
        for (String sport : sportNames) {
            System.out.println(sport);
        }
    }
	
	public String getSportByName(String sportName){
		System.out.println("invoked getSportByName");
		String name = null;
		for(String sport : sportNames){
			if(sport == sportName){
				name = sport;
				break;
			}
		}
		
		if(name == null){
			System.out.println(sportName +" not found");
		}
		
		return name;
	}
	
	public boolean updateSport(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateSport");
		boolean isSportUpdated = false;
		for(int index = 0; index < sportNames.length; index++){
			if(sportNames[index] == oldName){
				sportNames[index] = newName;
				isSportUpdated = true;
			}
		}
		
		if(isSportUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isSportUpdated;
	}
	
	public boolean deleteSport(String sportName){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteCast");
		boolean isSportDeleted = false;
		for(int index = 0; index < sportNames.length; index++){
			if(sportNames[index] == sportName){
				sportNames[index] = null;
				isSportDeleted = true;
			}
		}
		
		if(isSportDeleted == false){
			System.out.println(sportName + " not found");
		}
		
		return isSportDeleted;
	}
}