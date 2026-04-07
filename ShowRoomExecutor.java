class ShowRoomExecutor{

    public static void main(String[] args){

        ShowRoom showroom = new ShowRoom();

        boolean added = showroom.addManager("Ramesh");
        System.out.println(added);
        System.out.println("---------------");

        added = showroom.addManager("Suresh");
        System.out.println(added);
        System.out.println("---------------");

        added = showroom.addManager("Mahesh");
        System.out.println(added);
        System.out.println("---------------");

        added = showroom.addManager("Ganesh");
        System.out.println(added);
        System.out.println("---------------");

        added = showroom.addManager("Rajesh");
        System.out.println(added);
        System.out.println("---------------");

        added = showroom.addManager("Naresh");
        System.out.println(added);
        System.out.println("---------------");

        added = showroom.addManager("Lokesh");
        System.out.println(added);
        System.out.println("---------------");

        added = showroom.addManager("Dinesh");
        System.out.println(added);
        System.out.println("---------------");

        showroom.getManagers();
		
		String name = showroom.getManagerByName("Suresh");
		System.out.println(name);
		
		boolean update = showroom.updateManager("Suresh", "Suresh Reddy");
		System.out.println(update);
		
		showroom.getManagers();
		
		boolean delete = showroom.deleteManager("Rajesh");
		System.out.println(delete);
		
		showroom.getManagers();
    }
}