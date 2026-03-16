class StorageRack {

    static String brand= "flipkart basics";
    static String material = "fiber";
    static String color = "half white";
    static int numberOfShelves = 6;
    static String roomType;
    static String shape;

    public static void main(String[] args) {

        String brand = "Amazon Basics";
        String material = "Plastic";
        String color = "Black";
        int numberOfShelves = 5;
        String roomType = "Kitchen";
        String shape = "Rectangular";

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Number of Shelves: " + numberOfShelves);
        System.out.println("Room Type: " + roomType);
        System.out.println("Shape: " + shape);
		
		System.out.println("Brand: " + StorageRack.brand);
        System.out.println("Material: " + StorageRack.material);
        System.out.println("Color: " + StorageRack.color);
        System.out.println("Number of Shelves: " + StorageRack.numberOfShelves);
        System.out.println("Room Type: " + StorageRack.roomType);
        System.out.println("Shape: " + StorageRack.shape);
    }
}
