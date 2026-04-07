class OlympicExecutor{

    public static void main(String[] args) {

        Olympic olympic = new Olympic();

        boolean added = olympic.addSport("Athletics");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Swimming");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Gymnastics");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Boxing");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Wrestling");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Hockey");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Badminton");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Tennis");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Football");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Basketball");
        System.out.println(added);
        System.out.println("---------------");

        added = olympic.addSport("Volleyball");
        System.out.println(added);
        System.out.println("---------------");

        olympic.getSports();
		
		String name = olympic.getSportByName("Tennis");
		System.out.println(name);
		
		boolean update = olympic.updateSport("Tennis" ,  "Table tennis");
		System.out.println(update);
		
		olympic.getSports();
		
		boolean delete = olympic.deleteSport("Football");
		System.out.println(delete);
		
		olympic.getSports();
    }
}