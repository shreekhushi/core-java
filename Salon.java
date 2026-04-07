class Salon{

    String services[] = new String[7];
    int index;

    public boolean addService(String service){
        System.out.println("Invoked addService");
        boolean isServiceAdded = false;

        if (index < services.length){

            if (service != null && !service.isEmpty()){
                services[index++] = service;
                isServiceAdded = true;
            } else  System.out.println("Invalid Service");
            

        } else System.out.println("Cannot add more services");
        

        return isServiceAdded;
    }

    public void getServices(){
        System.out.println("The list of services are:");
        for (String service : services) 
            System.out.println(service);
        
    }
	
	public String getServiceByName(String serviceName){
		System.out.println("invoked getServiceByName");
		String name = null;
		for(String service : services){
			if(service == serviceName){
				name = service;
				break;
			}
		}
		
		if(name == null){
			System.out.println(serviceName +" not found");
		}
		
		return name;
	}
	
	public boolean updateService(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateService");
		boolean isServiceUpdated = false;
		for(int index = 0; index < services.length; index++){
			if(services[index] == oldName){
				services[index] = newName;
				isServiceUpdated = true;
			}
		}
		
		if(isServiceUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isServiceUpdated;
	}
	
	public boolean deleteService(String serviceName){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteService");
		boolean isServiceDeleted = false;
		for(int index = 0; index < services.length; index++){
			if(services[index] == serviceName){
				services[index] = null;
				isServiceDeleted = true;
			}
		}
		
		if(isServiceDeleted == false){
			System.out.println(serviceName + " not found");
		}
		
		return isServiceDeleted;
	}
}