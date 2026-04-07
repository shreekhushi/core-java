class UniverseExecutor{

    public static void main(String[] args) {

        Universe universe = new Universe();

        boolean added = universe.addGalaxy("Milky Way");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Andromeda");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Triangulum");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Whirlpool");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Sombrero");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Pinwheel");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Cartwheel");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Black Eye");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Cigar Galaxy");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Sunflower Galaxy");
        System.out.println(added);
        System.out.println("---------------");

        added = universe.addGalaxy("Tadpole Galaxy");
        System.out.println(added);
        System.out.println("---------------");

        universe.getGalaxies();
		
		String name = universe.getGalaxysByName("Pinwheel");
		System.out.println(name);
		
		boolean update = universe.updateGalaxy("Cigar Galaxy", "Cigar");
		System.out.println(update);
		
		universe.getGalaxies();
		
		boolean delete = universe.deleteGalaxy("Cartwheel");
		System.out.println(delete);
		
		universe.getGalaxies();
    }
}