class Turbine{
    String turbineNames[] = new String[10];
	int index;
	
	
	public boolean addTurbine(String turbineName){
		System.out.println("invoked addTurbine");
		boolean isTurbineAdded = false;
		if(index < turbineNames.length){
			
		if(turbineName != null && !turbineName.isEmpty()){
			 turbineNames[index++] = turbineName;
			 isTurbineAdded = true;
			 System.out.println("added turbine");
			 
		}else System.out.println("no turbine");
		
		
	}else System.out.println("contact later................");
		
		return isTurbineAdded;
		
	}
	
	public void getTurbines(){
		System.out.println("invoked getTurbines");
		for(String turbine : turbineNames)
			System.out.println(turbine);
	}
	
	public String getTurbineByName(String turbineName){
		String name = null;
		
		for(String turbine : turbineNames){
			if(turbine == turbineName){
				name = turbine;
				break;
			}
		}
		if(name == null){
			System.out.println(turbineName + " is not found");
		}
		
		return name;
	}
	
	public boolean updateTurbine(String oldTurbineName , String newTurbineName){
		System.out.println("---------------");
		System.out.println("invoked updateTurbine");
		boolean isTurbineUpdated = false;
		
		for(int index = 0; index < turbineNames.length ; index++){
			if(turbineNames[index] == oldTurbineName){
				turbineNames[index] = newTurbineName;
				isTurbineUpdated = true;
				break;
			}
		}
		if(isTurbineUpdated == false){
			System.out.println(oldTurbineName + " not fund in list");
		}
		
		return isTurbineUpdated;
	}
	
	public boolean deleteTurbine(String turbineName){
		System.out.println("invoked deleteTurbine");
		boolean isTurbineDeleted = false;
		
		for(int index = 0; index < turbineNames.length ; index++){
			if(turbineNames[index] == turbineName ){
				turbineNames[index] = null;
				isTurbineDeleted = true;
			}
		}
		
		if(isTurbineDeleted == false){
			System.out.println(turbineName + " deleted");
		}
		 
		 return isTurbineDeleted;
	}
	
}