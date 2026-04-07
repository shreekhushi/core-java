class PetroleumExecutor{

    public static void main(String[] args){

        Petroleum petroleum = new Petroleum();

        boolean added = petroleum.addPetroleum("Petrol");
        System.out.println(added);
        System.out.println("---------------");

        added = petroleum.addPetroleum("Diesel");
        System.out.println(added);
        System.out.println("---------------");

        added = petroleum.addPetroleum("Kerosene");
        System.out.println(added);
        System.out.println("---------------");

        added = petroleum.addPetroleum("LPG");
        System.out.println(added);
        System.out.println("---------------");

        added = petroleum.addPetroleum("CNG");
        System.out.println(added);
        System.out.println("---------------");

        added = petroleum.addPetroleum("Aviation Fuel");
        System.out.println(added);
        System.out.println("---------------");

        added = petroleum.addPetroleum("Bitumen");
        System.out.println(added);
        System.out.println("---------------");

        added = petroleum.addPetroleum("Lubricating Oil");
        System.out.println(added);
        System.out.println("---------------");

        added = petroleum.addPetroleum("Paraffin Wax");
        System.out.println(added);
        System.out.println("---------------");

        added = petroleum.addPetroleum("Naphtha");
        System.out.println(added);
        System.out.println("---------------");

        petroleum.getPetroleums();
		
		String name = petroleum.getPetroleumByName("Diesel");
		System.out.println(name + " is available");
		
		boolean update = petroleum.updatePetroleum("Diesel" , "Bio Diesel");
		System.out.println(update);
		petroleum.getPetroleums();
		
		boolean delete = petroleum.deletePetroleum("Bio Diesel");
		System.out.println(delete);
		
		petroleum.getPetroleums();
    }
}