class Library{

    String bookNames[] = new String[13];
    int index;

    public boolean addBook(String book) {
        System.out.println("invoked addBook");
        boolean isBookAdded = false;

        if (index < bookNames.length) {

            if (book != null && !book.isEmpty()) {
                bookNames[index++] = book;
                isBookAdded = true;
                System.out.println("added book");
            } else System.out.println("no book");
            

        } else System.out.println("contact later................");
        

        return isBookAdded;
    }

    public void getBooks() {
        System.out.println("invoked getBooks");
        for (String book : bookNames) 
            System.out.println(book);
    }
	
	public String getBookByName(String bookName){
		String name = null;
		for(String book : bookNames){
			if(book == bookName){
				name = book;
				break;
			}
		}
		if(name == null){
			System.out.println(bookName + " is not found");
		}
		
		return name;
	}
	
	public boolean updateBookName(String oldBookName , String newBookName){
		System.out.println("---------------");
		System.out.println("invoked updateBookName");
		boolean isBookUpdated = false;
		
		for(int index = 0; index < bookNames.length ; index++){
			if(bookNames[index] == oldBookName){
				bookNames[index] = newBookName;
				isBookUpdated = true;
				break;
			}
		}
		
		if(isBookUpdated == false){
			System.out.println(oldBookName + " not fund in list");
		}
		
		return isBookUpdated;
	}
	
	public boolean deleteBookName(String bookName){
		System.out.println("invoked deleteBookName");
		boolean isBookDeleted = false;
		
		for(int index = 0; index < bookNames.length ; index++){
			if(bookNames[index] == bookName ){
				bookNames[index] = null;
				isBookDeleted = true;
			}
		}
		
		if(isBookDeleted == false){
			System.out.println(bookName + " deleted");
		}
		 
		 
		 return isBookDeleted;
	}
}