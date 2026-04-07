class ShowRoom{

    String managerNames[] = new String[8];
    int index;

    public boolean addManager(String manager){
        System.out.println("Invoked addManager");
        boolean isManagerAdded = false;

        if(index < managerNames.length){

            if(manager != null && !manager.isEmpty()){
                managerNames[index++] = manager;
                isManagerAdded = true;
            } else System.out.println("Invalid Manager Name");
            

        } else System.out.println("Cannot add more managers");
        

        return isManagerAdded;
    }

    public void getManagers() {
        System.out.println("The list of manager names are:");
        for (String manager : managerNames) 
            System.out.println(manager);
    }
	
	public String getManagerByName(String nameOfManager){
		System.out.println("invoked getManagerByName");
		String name = null;
		for(String managerName : managerNames){
			if(managerName == nameOfManager){
				name = managerName;
				break;
			}
		}
		
		if(name == null){
			System.out.println(nameOfManager +" not found");
		}
		
		return name;
	}
	
	public boolean updateManager(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateManager");
		boolean isManagerUpdated = false;
		for(int index = 0; index < managerNames.length; index++){
			if(managerNames[index] == oldName){
				managerNames[index] = newName;
				isManagerUpdated = true;
			}
		}
		
		if(isManagerUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isManagerUpdated;
	}
	
	public boolean deleteManager(String nameOfManager){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteManager");
		boolean isManagerDeleted = false;
		for(int index = 0; index < managerNames.length; index++){
			if(managerNames[index] == nameOfManager){
				managerNames[index] = null;
				isManagerDeleted = true;
			}
		}
		
		if(isManagerDeleted == false){
			System.out.println(nameOfManager + " not found");
		}
		
		return isManagerDeleted;
	}
}