class RTO{
	
	DrivingLicence drivingLicence;
	DrivingLicence licence[] = new DrivingLicence[13];
	int index;
	
	public boolean createLicence(DrivingLicence drivingLicence){
		
		boolean isLicenceAdded = false;
		
		boolean isLicenceId = false;
		boolean isHolderNameValid = false;
		boolean isLicenceTypeValid = false;
		boolean isIssueDateValid = false;
		boolean isExpiryDateValid = false;
		boolean isVehicleTypeValid = false;
		
		if(drivingLicence.licenceId > 0){
			isLicenceId = true;
		} else System.out.println(drivingLicence.licenceId + " not valid");
		
		if(drivingLicence.holderName != null && !drivingLicence.holderName.isEmpty()){
			isHolderNameValid = true;
		} else System.out.println(drivingLicence.holderName + " not valid");
		
		if(drivingLicence.licenceType != null && !drivingLicence.licenceType.isEmpty()){
			isLicenceTypeValid = true;
		} else System.out.println(drivingLicence.licenceType + " not valid");
		
		if(drivingLicence.issueDate != null && !drivingLicence.issueDate.isEmpty()){
			isIssueDateValid = true;
		} else System.out.println(drivingLicence.issueDate + " not valid");
		
		if(drivingLicence.expiryDate != null && !drivingLicence.expiryDate.isEmpty()){
			isExpiryDateValid = true;
		} else System.out.println(drivingLicence.expiryDate + " not valid");
		
		if(drivingLicence.vehicleTypes != null && drivingLicence.vehicleTypes.length > 0){
			isVehicleTypeValid = true;
		} else System.out.println(drivingLicence.vehicleTypes + " not valid");

		if(isLicenceId && isHolderNameValid && isIssueDateValid && isExpiryDateValid && isLicenceTypeValid && isVehicleTypeValid){
			licence[index++] = drivingLicence;
			isLicenceAdded = true;
		}
		
		return isLicenceAdded;
	}
	
	public void getLicences(){
		for(DrivingLicence drivingLicence : licence){
			System.out.println("-----------------------------------");
			System.out.println("the licence id is: " + drivingLicence.licenceId);
			System.out.println("the licence holder name is: " + drivingLicence.holderName);
			System.out.println("the licence start date is: " + drivingLicence.issueDate);
			System.out.println("the licence end date is: " + drivingLicence.expiryDate);
			System.out.println("the licence type is: " + drivingLicence.licenceType);
			System.out.println("the licence vehicle type are: ");
			for(String vehicle : drivingLicence.vehicleTypes){
				System.out.println(vehicle);
			}
			
		}
	}
}
