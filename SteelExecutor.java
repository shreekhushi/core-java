class SteelExecutor{

    public static void main(String[] args){

        Steel steel = new Steel();

        boolean added = steel.addSteel("Carbon Steel");
        System.out.println(added);
        System.out.println("---------------");

        added = steel.addSteel("Alloy Steel");
        System.out.println(added);
        System.out.println("---------------");

        added = steel.addSteel("Stainless Steel");
        System.out.println(added);
        System.out.println("---------------");

        added = steel.addSteel("Tool Steel");
        System.out.println(added);
        System.out.println("---------------");

        added = steel.addSteel("Mild Steel");
        System.out.println(added);
        System.out.println("---------------");

        added = steel.addSteel("High Speed Steel");
        System.out.println(added);
        System.out.println("---------------");

        added = steel.addSteel("Spring Steel");
        System.out.println(added);
        System.out.println("---------------");

        added = steel.addSteel("Galvanized Steel");
        System.out.println(added);
        System.out.println("---------------");

        added = steel.addSteel("Structural Steel");
        System.out.println(added);
        System.out.println("---------------");

        added = steel.addSteel("Weathering Steel");
        System.out.println(added);
        System.out.println("---------------");

        steel.getSteels();
		
		String name = steel.getSteelByName("Mild Steel");
		System.out.println(name + " is available");
		
		boolean update = steel.updateSteel("Mild Steel" , "Low Carbon Steel");
		System.out.println(update);
		steel.getSteels();
		
		boolean delete = steel.deleteSteel("Low Carbon Steel");
		System.out.println(delete);
		
		steel.getSteels();
    }
}