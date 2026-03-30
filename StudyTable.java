class StudyTable {

    String materialType;
    String color;
    String brand;
    String shape;
    String storageType;
    String usage;
    String roomType;
    String finishType;
    boolean foldable;
    double price;
	
	StudyTable(String mt, String c, String b, String s, String st, String u, String  rt, String ft, boolean f, double p){
		materialType = mt;
		color = c;
		brand = b;
		shape = s;
		storageType = st;
		usage = u;
		roomType = rt;
		finishType = ft;
		foldable = f;
		price = p;
	}
	
	public void displayDetails(){
		System.out.println("The Material Type of Table is " + materialType);
        System.out.println("The Color of Table is " + color);
        System.out.println("The Brand of Table is " + brand);
        System.out.println("The Shape of Table is " + shape);
        System.out.println("The Storage Type of Table is " + storageType);
        System.out.println("The Usage of Table is " + usage);
        System.out.println("The Roomedicine Type of Table is " + roomType);
        System.out.println("The Finish Type of Table is " + finishType);
        System.out.println("Is Table Foldable? " + foldable);
        System.out.println("The Price of Table is " + price);
	}

}