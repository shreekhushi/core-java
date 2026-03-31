class Factory{

    String factoryName;
    String location;
    int totalWorkers;
    String industryType;
    double productionCapacity;

    Machine machine; 

    public void getFactoryDetails() {
        System.out.println("Factory Details:");
        System.out.println("Factory Name: " + factoryName);
        System.out.println("Location: " + location);
        System.out.println("Total Workers: " + totalWorkers);
        System.out.println("Industry Type: " + industryType);
        System.out.println("Production Capacity: " + productionCapacity);
        System.out.println("--------------------------------");

        machine.getMachineDetails();

    }
}