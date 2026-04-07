class SouthIndiaExecutor{

    public static void main(String[] args) {

        SouthIndia south = new SouthIndia();

        boolean added = south.addAirport("Kempegowda International Airport");
        System.out.println(added);
        System.out.println("---------------");

        added = south.addAirport("Chennai International Airport");
        System.out.println(added);
        System.out.println("---------------");

        added = south.addAirport("Rajiv Gandhi International Airport");
        System.out.println(added);
        System.out.println("---------------");

        added = south.addAirport("Cochin International Airport");
        System.out.println(added);
        System.out.println("---------------");

        added = south.addAirport("Trivandrum International Airport");
        System.out.println(added);
        System.out.println("---------------");

        added = south.addAirport("Calicut International Airport");
        System.out.println(added);
        System.out.println("---------------");

        added = south.addAirport("Madurai Airport");
        System.out.println(added);
        System.out.println("---------------");

        added = south.addAirport("Mangalore International Airport");
        System.out.println(added);
        System.out.println("---------------");

        added = south.addAirport("Coimbatore International Airport");
        System.out.println(added);
        System.out.println("---------------");

        added = south.addAirport("Mysore Airport");
        System.out.println(added);
        System.out.println("---------------");

        south.getAirports();
		
		String name = south.getAirportByName("Madurai Airport");
		System.out.println(name);
		
		boolean update = south.updateAirport("Kempegowda International Airport", "Banglore Airport");
		System.out.println(update);
		
		south.getAirports();
		
		boolean delete = south.deleteAirport("Mysore Airport");
		System.out.println(delete);
		
		south.getAirports();
    }
}