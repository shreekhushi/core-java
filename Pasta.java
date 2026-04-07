class Pasta{
    String pastaNames[] = new String[10];
	int index;
	
	
	public boolean addPasta(String pastaName){
		System.out.println("invoked addPasta");
		boolean isPastaAdded = false;
		if(index < pastaNames.length){
			
		if(pastaName != null && !pastaName.isEmpty()){
			 pastaNames[index++] = pastaName;
			 isPastaAdded = true;
			 System.out.println("added pasta");
			 
		}else System.out.println("no pasta");
		
		
	}else System.out.println("contact later................");
		
		return isPastaAdded;
		
	}
	
	public void getPastas(){
		System.out.println("invoked getPastas");
		for(String pasta : pastaNames)
			System.out.println(pasta);
	}
	
	public String getPastaByName(String pastaName){
		String name = null;
		for(String pasta : pastaNames){
			if(pasta == pastaName){
				name = pasta;
				break;
			}
		}
		if(name == null){
			System.out.println(pastaName + " is not found");
		}
		
		return name;
	}
	
	public boolean updatePasta(String oldPastaName , String newPastaName){
		System.out.println("---------------");
		System.out.println("invoked updatePasta");
		boolean isPastaUpdated = false;
		
		for(int index = 0; index < pastaNames.length ; index++){
			if(pastaNames[index] == oldPastaName){
				pastaNames[index] = newPastaName;
				isPastaUpdated = true;
				break;
			}
		}
		
		if(isPastaUpdated == false){
			System.out.println(oldPastaName + " not fund in list");
		}
		
		return isPastaUpdated;
	}
	
	public boolean deletePasta(String pastaName){
	System.out.println("---------------------");
		System.out.println("invoked deletePasta");
		boolean isPastaDeleted = false;
		
		for(int index = 0; index < pastaNames.length ; index++){
			if(pastaNames[index] == pastaName ){
				pastaNames[index] = null;
				isPastaDeleted = true;
			}
		}
		if(isPastaDeleted == false){
			System.out.println(pastaName + " deleted");
		}
		 return isPastaDeleted;
	}
	
}