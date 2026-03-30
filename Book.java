class Book{
    String title;
    String author;
    int pages;
    String genre;
    int price;

    Book() {
        System.out.println("Book default constructor");
    }

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Book(String title, String author, int pages, String genre) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    Book(String title, String author, int pages, String genre, int price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
        this.price = price;
    }

    void display() {
        System.out.println(title + " " + author + " " + pages + " " + genre + " " + price);
    }
}