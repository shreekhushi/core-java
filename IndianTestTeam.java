class IndianTestTeam{

    String playerNames[] = new String[11];
    int index;

    public boolean addPlayer(String player){
        System.out.println("Invoked addPlayer");
        boolean isPlayerAdded = false;

        if (index < playerNames.length){

            if (player != null && !player.isEmpty()){
                playerNames[index++] = player;
                isPlayerAdded = true;
            } else System.out.println("Invalid Player Name");
            

        } else System.out.println("Cannot add more players");
        

        return isPlayerAdded;
    }

    public void getPlayers(){
        System.out.println("The list of player names are:");
        for (String player : playerNames) 
            System.out.println(player);
        
    }
	
	public String getPlayerByName(String nameOfPlayer){
		String name = null;
		for(String playerName : playerNames){
			if(playerName == nameOfPlayer){
				name = playerName ;
			}
		}
		
		if(name == null){
			System.out.println(nameOfPlayer + " not found");
		}
		
		return name;
	}
	
	public boolean updatePlayerName(String oldName, String newName){
		System.out.println("-------------------------");
		boolean isPlayerUpdated = false;
		for(int index = 0; index < playerNames.length; index++){
			if(playerNames[index] == oldName){
				playerNames[index] = newName;
				isPlayerUpdated = true;
			}
		}
		
		if(isPlayerUpdated == false){
			System.out.println(oldName + " not found");
		}
		
		return isPlayerUpdated;
	}
	
	public boolean deletePlayerName(String playerName){
		System.out.println("-------------------------");
		boolean isPlayerDeleted = false;
		for(int index = 0 ; index < playerNames.length; index++){
			if(playerNames[index] == playerName){
				playerNames[index] = null;
				isPlayerDeleted = true;
			}
		}
		
		if(isPlayerDeleted == false){
			System.out.println(playerName + " not found");
		}
		return isPlayerDeleted;
	}
}