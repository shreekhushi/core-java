class MedicalShop{

    String medicineNames[] = new String[10];
    int index;

    public boolean addMedicine(String medicine) {
        System.out.println("invoked addMedicine");
        boolean isMedicineAdded = false;

        if (index < medicineNames.length) {

            if (medicine != null && !medicine.isEmpty()) {
                medicineNames[index++] = medicine;
                isMedicineAdded = true;
                System.out.println("added medicine");
            } else System.out.println("no medicine");
            

        } else  System.out.println("contact later................");
        

        return isMedicineAdded;
    }

    public void getMedicines() {
        System.out.println("invoked getMedicines");
        for (String medicine : medicineNames) 
            System.out.println(medicine); 
    }
	
	public String getMedicineByName(String nameOfMedicine){
		String name = null;
		for(String medicineName : medicineNames){
			if(medicineName == nameOfMedicine){
				name = medicineName;
				break;
			}
		}
		
		if(name == null){
			System.out.println(nameOfMedicine + " not found");
		}
		return name;
	}
	
	public boolean updateMedicine(String oldName, String newName){
		System.out.println("------------------------------");
		System.out.println("invoked updateMedicine");
		boolean isMedicineUpdated = false;
		for(int index = 0; index < medicineNames.length; index++) {
			if(medicineNames[index] == oldName){
				medicineNames[index] = newName;
				isMedicineUpdated = true;
			}
		}
		
		if(isMedicineUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isMedicineUpdated;
	}
	
	public boolean deleteMedicine(String medicineName){
		System.out.println("------------------------------");
		System.out.println("invoked deleteMedicine");
		boolean isMedicineDeleted = false;
		for(int index = 0; index < medicineNames.length; index++) {
			if(medicineNames[index] == medicineName){
				medicineNames[index] = null;
				isMedicineDeleted = true;
			}
		}
		
		if(isMedicineDeleted == false){
			System.out.println(medicineName + " not found");
		}
		
		return isMedicineDeleted;
	}
}