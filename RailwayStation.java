class RailwayStation{

    String stationName;
    String location;
    int totalPlatforms;
    String stationCode;
    long contactNumber;

    Platform platform; 

    public void getStationDetails() {
        System.out.println("Railway Station Details:");
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
        System.out.println("Total Platforms: " + totalPlatforms);
        System.out.println("Station Code: " + stationCode);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("--------------------------------");

        platform.getPlatformDetails();

    }
}