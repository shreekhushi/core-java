class AdityaBirlaGroup{

    String chairman;
    String headquarters;
    int totalCompanies;
    String industry;
    double revenue;

    RCB rcb; 

    public void getGroupDetails() {
        System.out.println("Aditya Birla Group Details:");
        System.out.println("Chairman: " + chairman);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Total Companies: " + totalCompanies);
        System.out.println("Industry: " + industry);
        System.out.println("Revenue: " + revenue);
        System.out.println("--------------------------------");

        rcb.getRCBDetails();

    }
}