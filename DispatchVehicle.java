class DispatchVehicle{
    static void outOfDelivery(String productName){
        System.out.println(" Package out for delivery");
        DeliveryAgent.reachDoorStep(productName);
    }
}