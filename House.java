class House{

    String indoorGames[] = new String[6];
    int index;

    public boolean addIndoorGame(String game){
        System.out.println("Invoked addIndoorGame");
        boolean isGameAdded = false;

        if (index < indoorGames.length) {

            if (game != null && !game.isEmpty()){
                indoorGames[index++] = game;
                isGameAdded = true;
            } else System.out.println("Invalid Game");
            

        } else  System.out.println("Cannot add more indoor games");

        return isGameAdded;
    }

    public void getIndoorGames(){
        System.out.println("The list of indoor games are:");
        for (String game : indoorGames)
            System.out.println(game);
        
    }
	
	public String getIndoorGameByName(String gameName){
		String name = null;
		for(String indoorGame : indoorGames){
			if(indoorGame == gameName){
				name = indoorGame;
			}
		}
		
		if(name == null){
			System.out.println(gameName + " not found");
		}
		
		return name;
	}
	
	public boolean updateGameName(String oldGame, String newGame){
		System.out.println("-------------------------");
		boolean isGameUpdated = false;
		for(int index=0; index<indoorGames.length; index++){
			if(indoorGames[index] == oldGame){
				indoorGames[index] = newGame;
				isGameUpdated = true;
			}
		}
		
		if(isGameUpdated == false){
			System.out.println(oldGame + " not found");
		}
		
		return isGameUpdated;
	}
	
	public boolean deleteGameName(String gameName){
		System.out.println("-----------------------");
		boolean isGameDeleted = false;
		for(int index=0 ;  index<indoorGames.length; index++){
			if(indoorGames[index] == gameName){
				indoorGames[index] = null;
				isGameDeleted = true;
			}
		}
		
		if(isGameDeleted == false){
			System.out.println(gameName + " not found");
		}
		
		return isGameDeleted;
	}
}