class MaggiExecutor{

    public static void main(String[] args){

        Maggi maggi = new Maggi();

        boolean added = maggi.addIngredient("Noodles");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Water");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Tastemaker Masala");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Salt");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Oil");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Onion");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Tomato");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Green Chilli");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Capsicum");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Carrot");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Peas");
        System.out.println(added);
        System.out.println("---------------");

        added = maggi.addIngredient("Butter");
        System.out.println(added);
        System.out.println("---------------");


        maggi.getIngredients();
		
		String name = maggi.getIngredientByName("Tomato");
		System.out.println(name);
		
		boolean update = maggi.updateIngredient("Oil", "Goldwinner oil");
		System.out.println(update);
		
		maggi.getIngredients();
		
		boolean delete = maggi.deleteIngredient("Peas");
		System.out.println(delete);
		
		maggi.getIngredients();
    }
}