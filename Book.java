class Book {
	static int price = 500;
    static String title = "Can we be strangers again" ;
    static String author ="khushi" ;
    static String publisher ;
    static String publicationDate = "15 july 2020";
    static String language = "English";
    static String printLength="500 pages";
    static String isbn10 = "00044455V";
    static String isbn13 ;
    static String itemWeight="100gm";
    static String dimensions ;
    static String countryOfOrigin = "India";
    static String genericName;
	
  public static void main(String[] args) {

    // price = 408;
	// title = "A Knight of the Seven Kingdoms";
	// author = "George R. R. Martin";
	// publisher = "HarperVoyager";
	// language = "English";
	// publicationDate = "1 June 2017";
	// printLength = "368 pages";
	// isbn10 = "000823809X";
	// isbn13 = "978-0008238094";
	// itemWeight = "294 g";
	// dimensions = "12.9 x 2.34 x 19.81 cm";
	// countryOfOrigin = "United Kingdom";
	// genericName = "Book";
	
	
    int price = 408;
    String title = "A Knight of the Seven Kingdoms";
    String author = "George R. R. Martin";
    String publisher = "HarperVoyager";
    String publicationDate = "1 June 2017";
    String language = "English";
    String printLength = "368 pages";
    String isbn10 = "000823809X";
    String isbn13 = "978-0008238094";
    String itemWeight = "294 g";
    String dimensions = "12.9 x 2.34 x 19.81 cm";
    String countryOfOrigin = "United Kingdom";
    String genericName = "Book";

    System.out.println("The price is : " + price);
    System.out.println("The book title is : " + title);
    System.out.println("The author is : " + author);
    System.out.println("The publisher is : " + publisher);
    System.out.println("The publication date is : " + publicationDate);
    System.out.println("The language is : " + language);
    System.out.println("The print length is : " + printLength);
    System.out.println("The ISBN-10 is : " + isbn10);
    System.out.println("The ISBN-13 is : " + isbn13);
    System.out.println("The item weight is : " + itemWeight);
    System.out.println("The dimensions are : " + dimensions);
    System.out.println("The country of origin is : " + countryOfOrigin);
    System.out.println("The generic name is : " + genericName);
	
	
	System.out.println("The price is : " + Book.price);
    System.out.println("The book title is : " + Book.title);
    System.out.println("The author is : " + Book.author);
    System.out.println("The publisher is : " + Book.publisher);
    System.out.println("The publication date is : " + Book.publicationDate);
    System.out.println("The language is : " + Book.language);
    System.out.println("The print length is : " + Book.printLength);
    System.out.println("The ISBN-10 is : " + Book.isbn10);
    System.out.println("The ISBN-13 is : " + Book.isbn13);
    System.out.println("The item weight is : " + Book.itemWeight);
    System.out.println("The dimensions are : " + Book.dimensions);
    System.out.println("The country of origin is : " + Book.countryOfOrigin);
    System.out.println("The generic name is : " + Book.genericName);
  }
}
