class AmazonExecutor{

    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        boolean added = amazon.addCategory("Electronics");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Clothing");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Home Appliances");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Books");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Toys");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Groceries");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Beauty");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Sports");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Furniture");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Footwear");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Jewelry");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Watches");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Automotive");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Baby Products");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Pet Supplies");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Office Supplies");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Garden");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Health");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Music");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Movies");
        System.out.println(added);
        System.out.println("---------------");

        added = amazon.addCategory("Software");
        System.out.println(added);
        System.out.println("---------------");
		
        added = amazon.addCategory("Stationery");
        System.out.println(added);
        System.out.println("---------------");

        amazon.getCategories();
		
		String category = amazon.getCategoryByName("Software");
		System.out.println(category + " is available");
		
		boolean update = amazon.updateCategory("Software" , "Technology Items");
		System.out.println(update);
		amazon.getCategories();
		
		boolean delete = amazon.deleteCategory("Technology Items");
		System.out.println(delete);
		
		amazon.getCategories();
    }
}