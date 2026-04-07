class PetShopExecutor{

    public static void main(String[] args) {

        PetShop shop = new PetShop();

        boolean added = shop.addAccessory("Dog Collar");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Leash");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Food Bowl");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Water Dispenser");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Pet Bed");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Pet Shampoo");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Brush");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Nail Clipper");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Pet Toys");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Cat Litter Box");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Scratching Post");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Pet Carrier");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Training Pads");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Pet Clothes");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Tick Collar");
        System.out.println(added);
        System.out.println("---------------");

        added = shop.addAccessory("Food Storage Container");
        System.out.println(added);
        System.out.println("---------------");

        shop.getAccessories();
		
		String name = shop.getAccessoryByName("Pet Toys");
		System.out.println(name);
		
		boolean update = shop.updateAccessory("Pet Toys", "Toys");
		System.out.println(update);
		
		shop.getAccessories();
		
		boolean delete = shop.deleteAccessory("Training Pads");
		System.out.println(delete);
		
		shop.getAccessories();
    }
}