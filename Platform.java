class Platform{

    int platformNumber;
    String trainName;
    String arrivalTime;
    String departureTime;
    String status;

    public void getPlatformDetails() {
        System.out.println("Platform Details:");
        System.out.println("Platform Number: " + platformNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------");
    }
}