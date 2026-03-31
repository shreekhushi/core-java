class Remote{

    int remoteId;
    String brand;
    String type;
    int batteryLevel;
    String range;

    public void getRemoteDetails() {
        System.out.println("Remote Details:");
        System.out.println("Remote Id: " + remoteId);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Range: " + range);
        System.out.println("-----------------------------");
    }
}