class SingerExecutor{

    public static void main(String[] args){

        Singer singer = new Singer();

        boolean added = singer.addSinger("Arijit Singh");
        System.out.println(added);
        System.out.println("---------------");

        added = singer.addSinger("Shreya Ghoshal");
        System.out.println(added);
        System.out.println("---------------");

        added = singer.addSinger("Sonu Nigam");
        System.out.println(added);
        System.out.println("---------------");

        added = singer.addSinger("Neha Kakkar");
        System.out.println(added);
        System.out.println("---------------");

        added = singer.addSinger("Armaan Malik");
        System.out.println(added);
        System.out.println("---------------");

        added = singer.addSinger("KK");
        System.out.println(added);
        System.out.println("---------------");

        added = singer.addSinger("Sunidhi Chauhan");
        System.out.println(added);
        System.out.println("---------------");

        added = singer.addSinger("Lata Mangeshkar");
        System.out.println(added);
        System.out.println("---------------");

        added = singer.addSinger("Asha Bhosle");
        System.out.println(added);
        System.out.println("---------------");

        added = singer.addSinger("Atif Aslam");
        System.out.println(added);
        System.out.println("---------------");

        singer.getSingers();
		
		String name = singer.getSingerByName("KK");
		System.out.println(name + " is available");
		
		boolean update = singer.updateSinger("KK" , "Krishnakumar Kunnath");
		System.out.println(update);
		singer.getSingers();
		
		boolean delete = singer.deleteSinger("Armaan Malik");
		System.out.println(delete);
		
		singer.getSingers();
    }
}