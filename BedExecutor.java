class BedExecutor{

    public static void main(String[] args){

        Bed bed = new Bed();

        boolean added = bed.addBed("Single Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = bed.addBed("Double Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = bed.addBed("Queen Size Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = bed.addBed("King Size Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = bed.addBed("Bunk Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = bed.addBed("Sofa Cum Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = bed.addBed("Folding Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = bed.addBed("Platform Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = bed.addBed("Canopy Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = bed.addBed("Storage Bed");
        System.out.println(added);
        System.out.println("---------------");

        bed.getBeds();
		
		String name = bed.getBedByName("Bunk Bed");
		System.out.println(name + " is available");
		
		boolean update = bed.updateBed("Bunk Bed" , "Kids Bunk Bed");
		System.out.println(update);
		bed.getBeds();
		
		boolean delete = bed.deleteBed("Canopy Bed");
		System.out.println(delete);
		
		bed.getBeds();
    }
}