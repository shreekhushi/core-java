class PastaExecutor{

    public static void main(String[] args) {

        Pasta pasta = new Pasta();

        boolean added = pasta.addPasta("Penne");
        System.out.println(added);
        System.out.println("---------------");

        added = pasta.addPasta("Spaghetti");
        System.out.println(added);
        System.out.println("---------------");

        added = pasta.addPasta("Fusilli");
        System.out.println(added);
        System.out.println("---------------");

        added = pasta.addPasta("Macaroni");
        System.out.println(added);
        System.out.println("---------------");

        added = pasta.addPasta("Lasagna");
        System.out.println(added);
        System.out.println("---------------");

        added = pasta.addPasta("Ravioli");
        System.out.println(added);
        System.out.println("---------------");

        added = pasta.addPasta("Fettuccine");
        System.out.println(added);
        System.out.println("---------------");

        added = pasta.addPasta("Linguine");
        System.out.println(added);
        System.out.println("---------------");

        added = pasta.addPasta("Rigatoni");
        System.out.println(added);
        System.out.println("---------------");

        added = pasta.addPasta("Tortellini");
        System.out.println(added);
        System.out.println("---------------");

        pasta.getPastas();
		
		String name = pasta.getPastaByName("Macaroni");
		System.out.println(name + " is available");
		
		boolean update = pasta.updatePasta("Macaroni" , "Cheese Macaroni");
		System.out.println(update);
		pasta.getPastas();
		
		boolean delete = pasta.deletePasta("Ravioli");
		System.out.println(delete);
		
		pasta.getPastas();
    }
}