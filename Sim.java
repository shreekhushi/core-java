class Sim{

    int simId;
    String provider;
    String networkType;
    long mobileNumber;
    String plan;

    public void getSimDetails() {
        System.out.println("SIM Details:");
        System.out.println("SIM Id: " + simId);
        System.out.println("Provider: " + provider);
        System.out.println("Network Type: " + networkType);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Plan: " + plan);
        System.out.println("---------------------------");
    }
}