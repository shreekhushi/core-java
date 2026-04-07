class Hungama{

    String showNames[] = new String[14];
    int index;

    public boolean addShow(String show){
        System.out.println("Invoked addShow");
        boolean isShowAdded = false;

        if (index < showNames.length){

            if (show != null && !show.isEmpty()){
                showNames[index++] = show;
                isShowAdded = true;
            } else System.out.println("Invalid Show Name");
            

        } else System.out.println("Cannot add more shows");
        

        return isShowAdded;
    }

    public void getShows() {
        System.out.println("The list of show names are:");
        for (String show : showNames) 
            System.out.println(show);
        
    }
	
	public String getShowByName(String nameOfTheShow){
		String name = null;
		for(String showName : showNames){
			if(showName == nameOfTheShow){
				name = showName;
			}
		}
		
		if(name == null){
			System.out.println(nameOfTheShow + " not found");
		}
		
		return name;
	}
	
	public boolean updateShowName(String oldName, String newName){
		System.out.println("-------------------");
		boolean isShowUpdated = false;
		for(int index=0; index<showNames.length; index++){
			if(showNames[index] == oldName){
				showNames[index] = newName;
				isShowUpdated = true;
			}
		}
		
		if(isShowUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isShowUpdated;
	}
	
	public boolean deleteShowName(String nameOfTheShow){
		System.out.println("-------------------");
		boolean isShowDeleted = false;
		for(int index=0; index<showNames.length; index++){
			if(showNames[index] == nameOfTheShow){
				showNames[index] = null;
				isShowDeleted = true;
			}
		}
		
		if(isShowDeleted == false){
			System.out.println(nameOfTheShow + " not found");
		}
		
		return isShowDeleted;
	}
}






