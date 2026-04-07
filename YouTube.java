class YouTube{

    String videoTitleNames[] = new String[15];
    int index;

    public boolean addVideoTitle(String title){
        System.out.println("Invoked addVideoTitle");
        boolean isVideoAdded = false;

        if (index < videoTitleNames.length){
            if (title != null && !title.isEmpty()){
                videoTitleNames[index++] = title;
                isVideoAdded = true;
            } else System.out.println("Invalid Title");
            
        } else System.out.println("Cannot add more video titles");
        
        return isVideoAdded;
    }

    public void getVideoTitles() {
        System.out.println("The list of video titles are:");
        for (String title : videoTitleNames) 
            System.out.println(title);
        
    }
	
	public String getTitleByName(String titleName){
		System.out.println("invoked getTitleByName");
		String name = null;
		for(String videoTitleName : videoTitleNames){
			if(videoTitleName == titleName){
				name = videoTitleName;
				break;
			}
		}
		
		if(name == null){
			System.out.println(titleName +" not found");
		}
		
		return name;
	}
	
	public boolean updateTitle(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateTitle");
		boolean isTitleUpdated = false;
		for(int index = 0; index < videoTitleNames.length; index++){
			if(videoTitleNames[index] == oldName){
				videoTitleNames[index] = newName;
				isTitleUpdated = true;
			}
		}
		
		if(isTitleUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isTitleUpdated;
	}
	
	public boolean deleteTitle(String titleName){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteTitle");
		boolean isTitleDeleted = false;
		for(int index = 0; index < videoTitleNames.length; index++){
			if(videoTitleNames[index] == titleName){	
				videoTitleNames[index] = null;
				isTitleDeleted = true;
			}
		}
		
		if(isTitleDeleted == false){
			System.out.println(titleName + " not found");
		}
		
		return isTitleDeleted;
	}
}