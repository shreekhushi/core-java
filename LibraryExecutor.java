class LibraryExecutor{

    public static void main(String[] args) {

        Library library = new Library();

        boolean added = library.addBook("Java");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("Python");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("C Programming");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("Data Structures");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("Operating System");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("DBMS");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("Computer Networks");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("AI");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("Machine Learning");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("Cyber Security");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("Cloud Computing");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("Software Engineering");
        System.out.println(added);
        System.out.println("---------------");

        added = library.addBook("Web Development");
        System.out.println(added);
        System.out.println("---------------");


        library.getBooks();
		
		String name = library.getBookByName("DBMS");
		System.out.println(name);
		
		boolean update = library.updateBookName("DBMS", "Database management system");
		System.out.println(update);
		
		library.getBooks();
		
		boolean delete = library.deleteBookName("Cloud computing");
		System.out.println(delete);
		
		library.getBooks();
    }
}