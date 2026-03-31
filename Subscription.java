class Subscription{

    int subscriptionId;
    String planType;
    double price;
    int validityDays;
    String status;

    public void getSubscriptionDetails() {
        System.out.println("Subscription Details:");
        System.out.println("Subscription Id: " + subscriptionId);
        System.out.println("Plan Type: " + planType);
        System.out.println("Price: " + price);
        System.out.println("Validity Days: " + validityDays);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------");
    }
}