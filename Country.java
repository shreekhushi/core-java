class Country{
    String states[] = new String[29];
	int index;
	
	
	public boolean addState(String state){
		System.out.println("invoked addState");
		boolean isStateAdded = false;
		if(index < states.length){
			
		if(state != null && !state.isEmpty()){
			 states[index++] = state;
			 isStateAdded = true;
			 System.out.println("added state");
			 
		}else System.out.println("no state");
		
		
	}else System.out.println("contact later................");
		
		return isStateAdded;
		
	}
	
	public void getStates(){
		System.out.println("invoked getStates");
		for(String state : states)
			System.out.println(state);
	}
	
	public String getStatesByName(String stateName){
		String name = null;
		for(String state : states){
			if(state == stateName){
				name = state;
				break;
			}
		}
		
		if(name==null){
			System.out.println(stateName + " not found");
		}
		
		return name;
	}
	
	
	public boolean updateState(String oldStateName, String newStateName){
		System.out.println("-------------------");
		boolean isStateUpdated = false;
		for(int index=0 ; index < states.length ; index++){
			if(states[index] == oldStateName){
				states[index] = newStateName;
				isStateUpdated = true;
			}
		}
		
		if(isStateUpdated == false){
			System.out.println(oldStateName + " not found");
		}
		
		return isStateUpdated;
	}
	
	public boolean deleteState(String stateName){
		System.out.println("--------------------");
		System.out.println("invoked deleteState");
		boolean isStateDeleted = false;
		for(int index = 0; index < states.length; index++){
			if(states[index] == stateName){
				states[index] = null;
				isStateDeleted =true;
			}
		}
		
		if(isStateDeleted == false){
			System.out.println(stateName + " not found");
		}
		
		return isStateDeleted;
	}
	
	
}