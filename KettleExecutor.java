class KettleExecutor{

    public static void main(String[] args) {

        Kettle kettle = new Kettle();

        boolean added = kettle.addKettle("Electric Kettle");
        System.out.println(added);
        System.out.println("---------------");

        added = kettle.addKettle("Stainless Steel Kettle");
        System.out.println(added);
        System.out.println("---------------");

        added = kettle.addKettle("Glass Kettle");
        System.out.println(added);
        System.out.println("---------------");

        added = kettle.addKettle("Travel Kettle");
        System.out.println(added);
        System.out.println("---------------");

        added = kettle.addKettle("Cordless Kettle");
        System.out.println(added);
        System.out.println("---------------");

        added = kettle.addKettle("Tea Kettle");
        System.out.println(added);
        System.out.println("---------------");

        added = kettle.addKettle("Whistling Kettle");
        System.out.println(added);
        System.out.println("---------------");

        added = kettle.addKettle("Smart Kettle");
        System.out.println(added);
        System.out.println("---------------");

        added = kettle.addKettle("Mini Kettle");
        System.out.println(added);
        System.out.println("---------------");

        added = kettle.addKettle("Induction Kettle");
        System.out.println(added);
        System.out.println("---------------");

        kettle.getKettles();
		
		String name = kettle.getKettleByName("Tea Kettle");
		System.out.println(name + " is available");
		
		boolean update = kettle.updateKettle("Tea Kettle" , "Classic Tea Kettle");
		System.out.println(update);
		kettle.getKettles();
		
		boolean delete = kettle.deleteKettle("Classic Tea Kettle");
		System.out.println(delete);
		
		kettle.getKettles();
    }
}