class TripExecutor{

    public static void main(String[] args) {

        Trip trip = new Trip();

        boolean added = trip.addPlace("Paris");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Switzerland");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Dubai");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Laos");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Gujurat");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Kerala");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Jaipur");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Manali");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Agra");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Darjeeling");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Ladakh");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Rishikesh");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Andaman");
        System.out.println(added);
        System.out.println("---------------");

        added = trip.addPlace("Kodaikanal");
        System.out.println(added);
        System.out.println("---------------");

        trip.getPlaces();
		
		String name = trip.getPlaceByName("Jaipur");
		System.out.println(name);
		
		boolean update = trip.updatePlace("Ladakh", "Leh ladakh");
		System.out.println(update);
		
		trip.getPlaces();
		
		boolean delete = trip.deletePlace("Rishikesh");
		System.out.println(delete);
		
		trip.getPlaces();
    }
}