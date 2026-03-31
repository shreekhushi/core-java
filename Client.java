class Client{

    int clientId;
    String name;
    String company;
    double projectBudget;
    String projectType;

    public void getClientDetails() {
        System.out.println("Client Details:");
        System.out.println("Client Id: " + clientId);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println("Project Budget: " + projectBudget);
        System.out.println("Project Type: " + projectType);
        System.out.println("-----------------------------");
    }
}