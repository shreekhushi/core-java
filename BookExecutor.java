class BookExecutor{

   public static void main(String[] args){
   
    Book bk1 = new Book();
    Book bk2 = new Book("Java Basics");
    Book bk3 = new Book("DSA", "Author A");
    Book bk4 = new Book("OOP", "Author B", 250);
    Book bk5 = new Book("AI", "Author C", 300, "Tech");
    Book bk6 = new Book("ML", "Author D", 350, "Science", 599);

    bk1.display();
	bk2.display();
	bk3.display();
    bk4.display();
	bk5.display();
	bk6.display();
	
   }
}