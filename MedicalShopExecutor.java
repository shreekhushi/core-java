class MedicalShopExecutor{

    public static void main(String[] args) {

        MedicalShop shop = new MedicalShop();

        boolean added = shop.addMedicine("Paracetamol");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addMedicine("Ibuprofen");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addMedicine("Aspirin");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addMedicine("Cetirizine");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addMedicine("Amoxicillin");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addMedicine("Metformin");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addMedicine("Atorvastatin");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addMedicine("Omeprazole");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addMedicine("Azithromycin");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addMedicine("Insulin");
        System.out.println(added);
        System.out.println("---------------");

        shop.getMedicines();
		
		String name = shop.getMedicineByName("Amoxicillin");
		System.out.println(name + " is available");
		
		boolean update = shop.updateMedicine("Insulin", "Insulin aspart");
		System.out.println(update);
		
		shop.getMedicines();
		
		boolean delete = shop.deleteMedicine("Cetirizine");
		System.out.println(delete);
		
		shop.getMedicines();
    }
}