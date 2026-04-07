class SalonExecutor{

    public static void main(String[] args){

        Salon salon = new Salon();

        boolean added = salon.addService("Hair Cut");
        System.out.println(added);
        System.out.println("---------------");

        added = salon.addService("Hair Wash");
        System.out.println(added);
        System.out.println("---------------");

        added = salon.addService("Hair Styling");
        System.out.println(added);
        System.out.println("---------------");

        added = salon.addService("Beard Trim");
        System.out.println(added);
        System.out.println("---------------");

        added = salon.addService("Facial");
        System.out.println(added);
        System.out.println("---------------");

        added = salon.addService("Hair Coloring");
        System.out.println(added);
        System.out.println("---------------");

        added = salon.addService("Head Massage");
        System.out.println(added);
        System.out.println("---------------");

        salon.getServices();
		
		String name = salon.getServiceByName("Hair Wash");
		System.out.println(name);
		
		boolean update = salon.updateService("Hair Wash", "Head Wash");
		System.out.println(update);
		
		salon.getServices();
		
		boolean delete = salon.deleteService("Facial");
		System.out.println(delete);
		
		salon.getServices();
    }
}