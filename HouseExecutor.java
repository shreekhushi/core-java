class HouseExecutor{

    public static void main(String[] args) {

        House house = new House();

        boolean added = house.addIndoorGame("Carrom");
        System.out.println(added);
        System.out.println("---------------");

        added = house.addIndoorGame("Chess");
        System.out.println(added);
        System.out.println("---------------");

        added = house.addIndoorGame("Ludo");
        System.out.println(added);
        System.out.println("---------------");

        added = house.addIndoorGame("Table Tennis");
        System.out.println(added);
        System.out.println("---------------");

        added = house.addIndoorGame("Snakes and Ladders");
        System.out.println(added);
        System.out.println("---------------");

        added = house.addIndoorGame("Cards");
        System.out.println(added);
        System.out.println("---------------");

        house.getIndoorGames();
		
		String name = house.getIndoorGameByName("Ludo");
		System.out.println(name);
		
		boolean update = house.updateGameName("Carrom" , "Carrom board");
		System.out.println(update);
		
		house.getIndoorGames();
		
		boolean delete = house.deleteGameName("Chess");
		System.out.println(delete);
		
		house.getIndoorGames();
    }
}