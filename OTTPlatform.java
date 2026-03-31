class OTTPlatform{

    String platformName;
    String owner;
    int totalUsers;
    String contentType;
    String region;

    Subscription subscription; 

    public void getPlatformDetails() {
        System.out.println("OTT Platform Details:");
        System.out.println("Platform Name: " + platformName);
        System.out.println("Owner: " + owner);
        System.out.println("Total Users: " + totalUsers);
        System.out.println("Content Type: " + contentType);
        System.out.println("Region: " + region);
        System.out.println("--------------------------------");

        subscription.getSubscriptionDetails();

    }
}