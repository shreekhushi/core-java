class MovieExecutor{

    public static void main(String[] args) {

        Movie movie = new Movie();

        boolean added = movie.addCast("Prabhas");
        System.out.println(added);
        System.out.println("---------------");

        added = movie.addCast("Anushka Shetty");
        System.out.println(added);
        System.out.println("---------------");

        added = movie.addCast("Rana Daggubati");
        System.out.println(added);
        System.out.println("---------------");

        added = movie.addCast("Tamannaah");
        System.out.println(added);
        System.out.println("---------------");

        added = movie.addCast("Ramya Krishnan");
        System.out.println(added);
        System.out.println("---------------");

        added = movie.addCast("C");
        System.out.println(added);
        System.out.println("---------------");

        added = movie.addCast("Sathyaraj");
        System.out.println(added);
        System.out.println("---------------");

        added = movie.addCast("Subbaraju");
        System.out.println(added);
        System.out.println("---------------");

        added = movie.addCast("Adivi Sesh");
        System.out.println(added);
        System.out.println("---------------");

        movie.getCasts();
		
		String name = movie.getCastsByName("Tamannaah");
		System.out.println(name + " is available");
		
		boolean update = movie.updateCast("Anushka Shetty", "Anushka");
		System.out.println(update);
		
		movie.getCasts();
		
		boolean delete = movie.deleteCast("Tamannaah");
		System.out.println(delete);
		
		movie.getCasts();
    }
}