class Mobile{

    String brand;
    String model;
    int price;
    int storage;
    String color;

    Sim sim; 

    public void getMobileDetails() {
        System.out.println("Mobile Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Color: " + color);
        System.out.println("--------------------------------");

        sim.getSimDetails();
    }
}