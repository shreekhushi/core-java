class Property{

    int propertyId;
    String propertyType;
    String location;
    double price;
    String status;

    public void getPropertyDetails() {
        System.out.println("Property Details:");
        System.out.println("Property Id: " + propertyId);
        System.out.println("Property Type: " + propertyType);
        System.out.println("Location: " + location);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------");
    }
}