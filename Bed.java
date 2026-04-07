class Bed{
    String bedTypes[] = new String[10];
	int index;
	
	
	public boolean addBed(String bedType){
		System.out.println("invoked addBed");
		boolean isBedAdded = false;
		if(index < bedTypes.length){
			
		if(bedType != null && !bedType.isEmpty()){
			 bedTypes[index++] = bedType;
			 isBedAdded = true;
			 System.out.println("added bed");
			 
		}else System.out.println("no bed");
		
		
	}else System.out.println("contact later................");
		
		return isBedAdded;
		
	}
	
	public void getBeds(){
		System.out.println("invoked getBeds");
		for(String bed : bedTypes)
			System.out.println(bed);
	}
	
	public String getBedByName(String bedType){
		String name = null;
		
		for(String bed : bedTypes){
			if(bed == bedType){
				name = bed;
				break;
			}
		}
		if(name == null){
			System.out.println(bedType + " is not found");
		}
		
		return name;
	}
	
	public boolean updateBed(String oldBedType , String newBedType){
		System.out.println("---------------");
		System.out.println("invoked updateBed");
		boolean isBedUpdated = false;
		
		for(int index = 0; index < bedTypes.length ; index++){
			if(bedTypes[index] == oldBedType){
				bedTypes[index] = newBedType;
				isBedUpdated = true;
				break;
			}
		}
		
		if(isBedUpdated == false){
			System.out.println(oldBedType + " not fund in list");
		}
		
		return isBedUpdated;
	}
	
	public boolean deleteBed(String bedType){
		System.out.println("invoked deleteBed");
		boolean isBedDeleted = false;
		
		for(int index = 0; index < bedTypes.length ; index++){
			if(bedTypes[index] == bedType ){
				bedTypes[index] = null;
				isBedDeleted = true;
			}
		}
		
		if(isBedDeleted == false){
			System.out.println(bedType + " deleted");
		}
		 return isBedDeleted;
	}
	
}