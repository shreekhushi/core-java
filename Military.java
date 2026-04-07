class Military{

    String weaponNames[] = new String[21];
    int index;

    public boolean addWeapon(String weapon){
        System.out.println("Invoked addWeapon");
        boolean isWeaponAdded = false;

        if (index < weaponNames.length) {

            if (weapon != null && !weapon.isEmpty()){
                weaponNames[index++] = weapon;
                isWeaponAdded = true;
            } else System.out.println("Invalid Weapon Name");
            

        } else System.out.println("Cannot add more weapons");
        

        return isWeaponAdded;
    }

    public void getWeapons() {
        System.out.println("The list of weapon names are:");
        for (String weapon : weaponNames) 
            System.out.println(weapon);
        
    }
	
	public String getWeaponByName(String nameOfWeapon){
		String name = null;
		for(String weaponName : weaponNames){
			if(weaponName == nameOfWeapon){
				name = weaponName;
				break;
			}
		}
		
		if(name == null){
			System.out.println(nameOfWeapon + " not found");
		}
		return name;
	}
	
	public boolean updateWeapon(String oldName, String newName){
		System.out.println("------------------------------");
		System.out.println("invoked updateWeapon");
		boolean isWeaponUpdated = false;
		for(int index = 0; index < weaponNames.length; index++) {
			if(weaponNames[index] == oldName){
				weaponNames[index] = newName;
				isWeaponUpdated = true;
			}
		}
		
		if(isWeaponUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isWeaponUpdated;
	}
	
	public boolean deleteWeapon(String nameOfWeapon){
		System.out.println("------------------------------");
		System.out.println("invoked deleteWeapon");
		boolean isWeaponDeleted = false;
		for(int index = 0; index < weaponNames.length; index++) {
			if(weaponNames[index] == nameOfWeapon){
				weaponNames[index] = null;
				isWeaponDeleted = true;
			}
		}
		
		if(isWeaponDeleted == false){
			System.out.println(nameOfWeapon + " not found");
		}
		
		return isWeaponDeleted;
	}
}