class Spotify{

    String songNames[] = new String[10];
    int index;

    public boolean addSong(String song) {
        System.out.println("invoked addSong");
        boolean isSongAdded = false;

        if (index < songNames.length) {

            if (song != null && !song.isEmpty()) {
                songNames[index++] = song;
                isSongAdded = true;
                System.out.println("added song");
            } else  System.out.println("no song");
            

        } else  System.out.println("contact later................");
        

        return isSongAdded;
    }

    public void getSongs() {
        System.out.println("invoked getSongs");
        for (String song : songNames) 
            System.out.println(song);
        
    }
	
	public String getSongByName(String nameOfSong){
		System.out.println("invoked getSongByName");
		String name = null;
		for(String songName : songNames){
			if(songName == nameOfSong){
				name = songName;
				break;
			}
		}
		
		if(name == null){
			System.out.println(nameOfSong +" not found");
		}
		
		return name;
	}
	
	public boolean updateSong(String oldName, String newName){
		System.out.println("-----------------------------");
		System.out.println("invoked updateSong");
		boolean isSongUpdated = false;
		for(int index = 0; index < songNames.length; index++){
			if(songNames[index] == oldName){
				songNames[index] = newName;
				isSongUpdated = true;
			}
		}
		
		if(isSongUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isSongUpdated;
	}
	
	public boolean deleteSong(String nameOfSong){
		System.out.println("-----------------------------");
		System.out.println("invoked deleteSong");
		boolean isSongDeleted = false;
		for(int index = 0; index < songNames.length; index++){
			if(songNames[index] == nameOfSong){
				songNames[index] = null;
				isSongDeleted = true;
			}
		}
		
		if(isSongDeleted == false){
			System.out.println(nameOfSong + " not found");
		}
		
		return isSongDeleted;
	}
}