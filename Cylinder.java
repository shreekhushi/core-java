class Cylinder{
    String cylinderNames[] = new String[10];
	int index;
	
	
	public boolean addCylinder(String cylinderName){
		System.out.println("invoked addCylinder");
		boolean isCylinderAdded = false;
		if(index < cylinderNames.length){
			
		if(cylinderName != null && !cylinderName.isEmpty()){
			 cylinderNames[index++] = cylinderName;
			 isCylinderAdded = true;
			 System.out.println("added cylinder");
			 
		}else System.out.println("no cylinder");
		
		
	}else System.out.println("contact later................");
		
		return isCylinderAdded;
		
	}
	
	public void getCylinders(){
		System.out.println("invoked getCylinders");
		for(String cylinder : cylinderNames)
			System.out.println(cylinder);
	}
	
	public String getCylinderByName(String cylinderName){
		String name = null;
		
		for(String cylinder : cylinderNames){
			if(cylinder == cylinderName){
				name = cylinder;
				break;
			}
		}
		if(name == null){
			System.out.println(cylinderName + " is not found");
		}
		
		return name;
	}
	
	public boolean updateCylinder(String oldCylinderName , String newCylinderName){
		System.out.println("---------------");
		System.out.println("invoked updateCylinder");
		boolean isCylinderUpdated = false;
		
		for(int index = 0; index < cylinderNames.length ; index++){
			if(cylinderNames[index] == oldCylinderName){
				cylinderNames[index] = newCylinderName;
				isCylinderUpdated = true;
				break;
			}
		}
		
		
		if(isCylinderUpdated == false){
			System.out.println(oldCylinderName + " not fund in list");
		}
		
		return isCylinderUpdated;
	}
	
	public boolean deleteCylinder(String cylinderName){
		System.out.println("invoked deleteCylinder");
		boolean isCylinderDeleted = false;
		
		for(int index = 0; index < cylinderNames.length ; index++){
			if(cylinderNames[index] == cylinderName ){
				cylinderNames[index] = null;
				isCylinderDeleted = true;
			}
		}
		
		if(isCylinderDeleted == false){
			System.out.println(cylinderName + " deleted");
		}
		 
		 
		 return isCylinderDeleted;
	}
	
}