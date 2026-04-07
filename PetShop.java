class PetShop{

    String accessories[] = new String[16];
    int index;

    public boolean addAccessory(String accessory){
        System.out.println("Invoked addAccessory");
        boolean isAccessoryAdded = false;

        if (index < accessories.length) {
            if (accessory != null && !accessory.isEmpty()){
                accessories[index++] = accessory;
                isAccessoryAdded = true;
            } else  System.out.println("Invalid Accessory");
            
        } else System.out.println("Cannot add more accessories");
        
        return isAccessoryAdded;
    }

    public void getAccessories() {
        System.out.println("The list of accessories are:");
        for (String accessory : accessories) 
            System.out.println(accessory);
        
    }
	
	public String getAccessoryByName(String accessoryName){
		System.out.println("invoked getAccessoryByName");
		String name = null;
		for(String accessorie: accessories){
			if(accessorie == accessoryName){
				name = accessorie;
				break;
			}
		}
		
		if(name == null){
			System.out.println(accessoryName +" not found");
		}
		
		return name;
	}
	
	public boolean updateAccessory(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateAccessory");
		boolean isAccessoryUpdated = false;
		for(int index = 0; index < accessories.length; index++){
			if(accessories[index] == oldName){
				accessories[index] = newName;
				isAccessoryUpdated = true;
			}
		}
		
		if(isAccessoryUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isAccessoryUpdated;
	}
	
	public boolean deleteAccessory(String accessoryName){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteAccessory");
		boolean isAccessoryDeleted = false;
		for(int index = 0; index < accessories.length; index++){
			if(accessories[index] == accessoryName){
				accessories[index] = null;
				isAccessoryDeleted = true;
			}
		}
		
		if(isAccessoryDeleted == false){
			System.out.println(accessoryName + " not found");
		}
		
		return isAccessoryDeleted;
	}
}