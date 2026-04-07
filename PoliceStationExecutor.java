class PoliceStationExecutor{

    public static void main(String[] args) {

        PoliceStation station = new PoliceStation();

        boolean added = station.addCase("Theft");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Robbery");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Illegal Possession");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Kidnapping");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Hit and Run");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Cyber Crime");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Assault");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Domestic Violence");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Drug Trafficking");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Smuggling");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Extortion");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Vandalism");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Bribery");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Arson");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Fraud");
        System.out.println(added);
        System.out.println("---------------");

        added = station.addCase("Murder");
        System.out.println(added);
        System.out.println("---------------");

        station.getCases();
		
		String name = station.getCaseByName("Extortion");
		System.out.println(name);
		
		boolean update = station.updateCase("Arson", "Arson case");
		System.out.println(update);
		
		station.getCases();
		
		boolean delete = station.deleteCase("Extortion");
		System.out.println(delete);
		
		station.getCases();
    }
}