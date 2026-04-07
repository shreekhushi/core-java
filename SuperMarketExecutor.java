class SuperMarketExecutor{

    public static void main(String[] args) {

        SuperMarket market = new SuperMarket();

        boolean added = market.addProduct("Rice");
        System.out.println(added);
        System.out.println("---------------");

        added = market.addProduct("Wheat");
        System.out.println(added);
        System.out.println("---------------");

        added = market.addProduct("Sugar");
        System.out.println(added);
        System.out.println("---------------");

        added = market.addProduct("Salt");
        System.out.println(added);
        System.out.println("---------------");

        added = market.addProduct("Milk");
        System.out.println(added);
        System.out.println("---------------");

        added = market.addProduct("Curd");
        System.out.println(added);
        System.out.println("---------------");

        added = market.addProduct("Shampoo");
        System.out.println(added);
        System.out.println("---------------");

        added = market.addProduct("Face cream");
        System.out.println(added);
        System.out.println("---------------");

        market.getProducts();
		
		String name = market.getProductByName("Sugar");
		System.out.println(name);
		
		boolean update = market.updateProduct("Milk", "Milk Products");
		System.out.println(update);
		
		market.getProducts();
		
		boolean delete = market.deleteProduct("Curd");
		System.out.println(delete);
		
		market.getProducts();
    }
}