class Kettle{
    String kettleNames[] = new String[10];
	int index;
	
	
	public boolean addKettle(String kettleName){
		System.out.println("invoked addKettle");
		boolean isKettleAdded = false;
		if(index < kettleNames.length){
			
		if(kettleName != null && !kettleName.isEmpty()){
			 kettleNames[index++] = kettleName;
			 isKettleAdded = true;
			 System.out.println("added kettle");
			 
		}else System.out.println("no kettle");
		
		
	}else System.out.println("contact later................");
		
		return isKettleAdded;
		
	}
	
	public void getKettles(){
		System.out.println("invoked getKettles");
		for(String kettle : kettleNames)
			System.out.println(kettle);
	}
	
	public String getKettleByName(String kettleName){
		String name = null;
		
		for(String kettle : kettleNames){
			if(kettle == kettleName){
				name = kettle;
				break;
			}
		}
		if(name == null){
			System.out.println(kettleName + " is not found");
		}
		
		return name;
	}
	
	public boolean updateKettle(String oldKettleName , String newKettleName){
		System.out.println("---------------");
		System.out.println("invoked updateKettle");
		boolean isKettleUpdated = false;
		
		for(int index = 0; index < kettleNames.length ; index++){
			if(kettleNames[index] == oldKettleName){
				kettleNames[index] = newKettleName;
				isKettleUpdated = true;
				break;
			}
		}
		
		if(isKettleUpdated == false){
			System.out.println(oldKettleName + " not fund in list");
		}
		
		return isKettleUpdated;
	}
	
	public boolean deleteKettle(String kettleName){
		System.out.println("invoked deleteKettle");
		boolean isKettleDeleted = false;
		
		for(int index = 0; index < kettleNames.length ; index++){
			if(kettleNames[index] == kettleName ){
				kettleNames[index] = null;
				isKettleDeleted = true;
			}
		}
		
		if(isKettleDeleted == false){
			System.out.println(kettleName + " deleted");
		}
		 
		 return isKettleDeleted;
	}
	
}