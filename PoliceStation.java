class PoliceStation{

    String caseNames[] = new String[16];
    int index;

    public boolean addCase(String caseName) {
        System.out.println("invoked addCase");
        boolean isCaseAdded = false;

        if (index < caseNames.length) {

            if (caseName != null && !caseName.isEmpty()) {
                caseNames[index++] = caseName;
                isCaseAdded = true;
                System.out.println("added case");
            } else  System.out.println("no case");
            

        } else System.out.println("contact later................");
        

        return isCaseAdded;
    }

    public void getCases() {
        System.out.println("invoked getCases");
        for (String caseName : caseNames) 
            System.out.println(caseName);
        
    }
	
	public String getCaseByName(String caseName){
		System.out.println("invoked getCaseByName");
		String name = null;
		for(String cases : caseNames){
			if(cases == caseName){
				name = cases;
				break;
			}
		}
		
		if(name == null){
			System.out.println(caseName +" not found");
		}
		
		return name;
	}
	
	public boolean updateCase(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateCase");
		boolean isCaseUpdated = false;
		for(int index = 0; index < caseNames.length; index++){
			if(caseNames[index] == oldName){
				caseNames[index] = newName;
				isCaseUpdated = true;
			}
		}
		
		if(isCaseUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isCaseUpdated;
	}
	
	public boolean deleteCase(String caseName){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteCase");
		boolean isCaseDeleted = false;
		for(int index = 0; index < caseNames.length; index++){
			if(caseNames[index] == caseName){
				caseNames[index] = null;
				isCaseDeleted = true;
			}
		}
		
		if(isCaseDeleted == false){
			System.out.println(caseName + " not found");
		}
		
		return isCaseDeleted;
	}
}