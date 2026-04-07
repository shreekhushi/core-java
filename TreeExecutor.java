class TreeExecutor{

    public static void main(String[] args){

        Tree tree = new Tree();

        boolean added = tree.addTree("Neem");
        System.out.println(added);
        System.out.println("---------------");

        added = tree.addTree("Banyan");
        System.out.println(added);
        System.out.println("---------------");

        added = tree.addTree("Peepal");
        System.out.println(added);
        System.out.println("---------------");

        added = tree.addTree("Mango");
        System.out.println(added);
        System.out.println("---------------");

        added = tree.addTree("Coconut");
        System.out.println(added);
        System.out.println("---------------");

        added = tree.addTree("Teak");
        System.out.println(added);
        System.out.println("---------------");

        added = tree.addTree("Sandalwood");
        System.out.println(added);
        System.out.println("---------------");

        added = tree.addTree("Pine");
        System.out.println(added);
        System.out.println("---------------");

        added = tree.addTree("Oak");
        System.out.println(added);
        System.out.println("---------------");

        added = tree.addTree("Eucalyptus");
        System.out.println(added);
        System.out.println("---------------");

        tree.getTrees();
		
		String name = tree.getTreeByName("Mango");
		System.out.println(name + " is available");
		
		boolean update = tree.updateTree("Mango" , "Alphonso Mango Tree");
		System.out.println(update);
		tree.getTrees();
		
		boolean delete = tree.deleteTree("Alphonso Mango Tree");
		System.out.println(delete);
		
		tree.getTrees();
    }
}