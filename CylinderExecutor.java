class CylinderExecutor{

    public static void main(String[] args){

        Cylinder cylinder = new Cylinder();

        boolean added = cylinder.addCylinder("Indane");
        System.out.println(added);
        System.out.println("---------------");

        added = cylinder.addCylinder("Bharat Gas");
        System.out.println(added);
        System.out.println("---------------");

        added = cylinder.addCylinder("HP Gas");
        System.out.println(added);
        System.out.println("---------------");

        added = cylinder.addCylinder("Total Gas");
        System.out.println(added);
        System.out.println("---------------");

        added = cylinder.addCylinder("Shell Gas");
        System.out.println(added);
        System.out.println("---------------");

        added = cylinder.addCylinder("Reliance Gas");
        System.out.println(added);
        System.out.println("---------------");

        added = cylinder.addCylinder("Adani Gas");
        System.out.println(added);
        System.out.println("---------------");

        added = cylinder.addCylinder("Essar Gas");
        System.out.println(added);
        System.out.println("---------------");

        added = cylinder.addCylinder("Gail Gas");
        System.out.println(added);
        System.out.println("---------------");

        added = cylinder.addCylinder("Go Gas");
        System.out.println(added);
        System.out.println("---------------");

        cylinder.getCylinders();
		
		String name = cylinder.getCylinderByName("HP Gas");
		System.out.println(name + " is available");
		
		boolean update = cylinder.updateCylinder("HP Gas" , "HP Domestic Gas");
		System.out.println(update);
		cylinder.getCylinders();
		
		boolean delete = cylinder.deleteCylinder("HP Domestic Gas");
		System.out.println(delete);
		
		cylinder.getCylinders();
    }
}