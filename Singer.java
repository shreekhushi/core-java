class Singer{
    String singerNames[] = new String[10];
	int index;
	
	
	public boolean addSinger(String singerName){
		System.out.println("invoked addSinger");
		boolean isSingerAdded = false;
		if(index < singerNames.length){
			
		if(singerName != null && !singerName.isEmpty()){
			 singerNames[index++] = singerName;
			 isSingerAdded = true;
			 System.out.println("added singer");
			 
		}else System.out.println("no singer");
		
		
	}else System.out.println("contact later................");
		
		return isSingerAdded;
		
	}
	
	public void getSingers(){
		System.out.println("invoked getSingers");
		for(String singer : singerNames)
			System.out.println(singer);
	}
	
	public String getSingerByName(String singerName){
		String name = null;
		
		for(String singer : singerNames){
			if(singer == singerName){
				name = singer;
				break;
			}
		}
		if(name == null){
			System.out.println(singerName + " is not found");
		}
		
		return name;
	}
	
	public boolean updateSinger(String oldSingerName , String newSingerName){
		System.out.println("---------------");
		System.out.println("invoked updateSinger");
		boolean isSingerUpdated = false;
		
		for(int index = 0; index < singerNames.length ; index++){
			if(singerNames[index] == oldSingerName){
				singerNames[index] = newSingerName;
				isSingerUpdated = true;
				break;
			}
		}
		if(isSingerUpdated == false){
			System.out.println(oldSingerName + " not fund in list");
		}
		
		return isSingerUpdated;
	}
	
	public boolean deleteSinger(String singerName){
		System.out.println("invoked deleteSinger");
		boolean isSingerDeleted = false;
		
		for(int index = 0; index < singerNames.length ; index++){
			if(singerNames[index] == singerName ){
				singerNames[index] = null;
				isSingerDeleted = true;
			}
		}
		
		if(isSingerDeleted == false){
			System.out.println(singerName + " deleted");
		}
		 
		 return isSingerDeleted;
	}
	
}