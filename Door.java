class Door{

    String doorMaterial;
    String color;
    double height;
    double width;
    String location;

    Lock lock; 

    public void getDoorDetails() {
        System.out.println("Door Details:");
        System.out.println("Material: " + doorMaterial);
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Location: " + location);
        System.out.println("--------------------------------");

        lock.getLockDetails();

    }
}