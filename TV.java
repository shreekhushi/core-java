class TV{

    String brand;
    String model;
    int screenSize;
    double price;
    String displayType;

    Remote remote; 

    public void getTVDetails() {
        System.out.println("TV Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Price: " + price);
        System.out.println("Display Type: " + displayType);
        System.out.println("--------------------------------");

        remote.getRemoteDetails();

    }
}