class Petroleum{
    String petroleumNames[] = new String[10];
	int index;
	
	
	public boolean addPetroleum(String petroleumName){
		System.out.println("invoked addPetroleum");
		boolean isPetroleumAdded = false;
		if(index < petroleumNames.length){
			
		if(petroleumName != null && !petroleumName.isEmpty()){
			 petroleumNames[index++] = petroleumName;
			 isPetroleumAdded = true;
			 System.out.println("added petroleum");
			 
		}else System.out.println("no petroleum");
		
		
	}else System.out.println("contact later................");
		
		return isPetroleumAdded;
		
	}
	
	public void getPetroleums(){
		System.out.println("invoked getPetroleums");
		for(String petroleum : petroleumNames)
			System.out.println(petroleum);
	}
	
	public String getPetroleumByName(String petroleumName){
		String name = null;
		
		for(String petroleum : petroleumNames){
			if(petroleum == petroleumName){
				name = petroleum;
				break;
			}
		}
		if(name == null){
			System.out.println(petroleumName + " is not found");
		}
		
		return name;
	}
	
	public boolean updatePetroleum(String oldPetroleumName , String newPetroleumName){
		System.out.println("---------------");
		System.out.println("invoked updatePetroleum");
		boolean isPetroleumUpdated = false;
		
		for(int index = 0; index < petroleumNames.length ; index++){
			if(petroleumNames[index] == oldPetroleumName){
				petroleumNames[index] = newPetroleumName;
				isPetroleumUpdated = true;
				break;
			}
		}
		if(isPetroleumUpdated == false){
			System.out.println(oldPetroleumName + " not fund in list");
		}
		
		return isPetroleumUpdated;
	}
	
	public boolean deletePetroleum(String petroleumName){
		System.out.println("invoked deletePetroleum");
		boolean isPetroleumDeleted = false;
		
		for(int index = 0; index < petroleumNames.length ; index++){
			if(petroleumNames[index] == petroleumName ){
				petroleumNames[index] = null;
				isPetroleumDeleted = true;
			}
		}
		
		if(isPetroleumDeleted == false){
			System.out.println(petroleumName + " deleted");
		}
		 return isPetroleumDeleted;
	}
	
}