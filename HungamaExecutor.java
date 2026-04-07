class HungamaExecutor{

    public static void main(String[] args) {

        Hungama hungama = new Hungama();

        boolean added = hungama.addShow("Doraemon");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Shinchan");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Pokemon");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Dragon Ball Z");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Naruto");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Ben 10");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Power Rangers");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Slugterra");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Beyblade");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Chhota Bheem");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Roll No 21");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Motu Patlu");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Oggy and the Cockroaches");
        System.out.println(added);
        System.out.println("---------------");

        added = hungama.addShow("Tom and Jerry");
        System.out.println(added);
        System.out.println("---------------");

        hungama.getShows();
		
		String name = hungama.getShowByName("Motu Patlu");
		System.out.println(name);
		
		boolean update= hungama.updateShowName("Slugterra" , "Mr bean");
		System.out.println(update);
		
		hungama.getShows();
		
		boolean delete = hungama.deleteShowName("Roll No 21");
		System.out.println(delete);
		
		hungama.getShows();
    }
}