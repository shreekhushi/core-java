class Steel{
    String steelTypes[] = new String[10];
	int index;
	
	
	public boolean addSteel(String steelType){
		System.out.println("invoked addSteel");
		boolean isSteelAdded = false;
		if(index < steelTypes.length){
			
		if(steelType != null && !steelType.isEmpty()){
			 steelTypes[index++] = steelType;
			 isSteelAdded = true;
			 System.out.println("added steel");
			 
		}else System.out.println("no steel");
		
		
	}else System.out.println("contact later................");
		
		return isSteelAdded;
		
	}
	
	public void getSteels(){
		System.out.println("invoked getSteels");
		for(String steel : steelTypes)
			System.out.println(steel);
	}
	
	public String getSteelByName(String steelType){
		String name = null;
		
		for(String steel : steelTypes){
			if(steel == steelType){
				name = steel;
				break;
			}
		}
		if(name == null){
			System.out.println(steelType + " is not found");
		}
		
		return name;
	}
	
	public boolean updateSteel(String oldSteelType , String newSteelType){
		System.out.println("---------------");
		System.out.println("invoked updateSteel");
		boolean isSteelUpdated = false;
		
		for(int index = 0; index < steelTypes.length ; index++){
			if(steelTypes[index] == oldSteelType){
				steelTypes[index] = newSteelType;
				isSteelUpdated = true;
				break;
			}
		}
		if(isSteelUpdated == false){
			System.out.println(oldSteelType + " not fund in list");
		}
		
		return isSteelUpdated;
	}
	
	public boolean deleteSteel(String steelType){
		System.out.println("invoked deleteSteel");
		boolean isSteelDeleted = false;
		
		for(int index = 0; index < steelTypes.length ; index++){
			if(steelTypes[index] == steelType ){
				steelTypes[index] = null;
				isSteelDeleted = true;
			}
		}
		
		if(isSteelDeleted == false){
			System.out.println(steelType + " deleted");
		}
		
		 return isSteelDeleted;
	}
	
}