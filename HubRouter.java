class HubRouter{
    static void sortToZipCode(String productName){
        System.out.println("Sorting package to correct zipcode");
        DispatchVehicle.outOfDelivery(productName);
    }
}