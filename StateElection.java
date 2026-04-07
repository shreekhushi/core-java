class StateElection{

    String partyNames[] = new String[7];
    int index;

    public boolean addParty(String party) {
        System.out.println("invoked addParty");
        boolean isPartyAdded = false;

        if (index < partyNames.length) {

            if (party != null && !party.isEmpty()) {
                partyNames[index++] = party;
                isPartyAdded = true;
                System.out.println("added party");
            } else  System.out.println("no party");
            

        } else System.out.println("contact later................");
        

        return isPartyAdded;
    }

    public void getParties() {
        System.out.println("invoked getParties");
        for (String party : partyNames) 
            System.out.println(party);
        
    }
	
	public String getPartyByName(String nameOfParty){
		System.out.println("invoked getPartyByName");
		String name = null;
		for(String partyName : partyNames){
			if(partyName == nameOfParty){
				name = partyName;
				break;
			}
		}
		
		if(name == null){
			System.out.println(nameOfParty +" not found");
		}
		
		return name;
	}
	
	public boolean updatePartyName(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updatePartyName");
		boolean isPartyUpdated = false;
		for(int index = 0; index < partyNames.length; index++){
			if(partyNames[index] == oldName){
				partyNames[index] = newName;
				isPartyUpdated = true;
			}
		}
		
		if(isPartyUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isPartyUpdated;
	}
	
	public boolean deletePartyName(String nameOfParty){
		System.out.println("-----------------------------");
		System.out.println("invoked deletePartyName");
		boolean isPartyDeleted = false;
		for(int index = 0; index < partyNames.length; index++){
			if(partyNames[index] == nameOfParty){
				partyNames[index] = null;
				isPartyDeleted = true;
			}
		}
		
		if(isPartyDeleted == false){
			System.out.println(nameOfParty + " not found");
		}
		
		return isPartyDeleted;
	}
}