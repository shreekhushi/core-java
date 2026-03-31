class RealEstate{

    String companyName;
    String officeLocation;
    int totalAgents;
    long contactNumber;
    String registrationId;

    Property property;

    public void getRealEstateDetails() {
        System.out.println("Real Estate Details:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Office Location: " + officeLocation);
        System.out.println("Total Agents: " + totalAgents);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Registration Id: " + registrationId);
        System.out.println("--------------------------------");

        property.getPropertyDetails();

    }
}