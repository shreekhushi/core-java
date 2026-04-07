class IndianTestTeamExecutor{

    public static void main(String[] args) {

        IndianTestTeam team = new IndianTestTeam();

        boolean added = team.addPlayer("Rohit Sharma");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("Yashasvi Jaiswal");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("Shubman Gill");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("Virat Kohli");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("KL Rahul");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("Rishabh Pant");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("Ravindra Jadeja");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("Ravichandran Ashwin");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("Jasprit Bumrah");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("Mohammed Siraj");
        System.out.println(added);
        System.out.println("---------------");

        added = team.addPlayer("Kuldeep Yadav");
        System.out.println(added);
        System.out.println("---------------");

       
        team.getPlayers();
		
		String name = team.getPlayerByName("KL Rahul");
		System.out.println(name);
		
		boolean update = team.updatePlayerName("Shubman Gill", "Gill");
		System.out.println(update);
		
		team.getPlayers();
		
		boolean delete = team.deletePlayerName("Mohammed Siraj");
		System.out.println(delete);
		
		team.getPlayers();
    }
}