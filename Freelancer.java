class Freelancer{

    String freelancerName;
    String skill;
    int experience;
    double hourlyRate;
    String platform;

    Client client;

    public void getFreelancerDetails() {
        System.out.println("Freelancer Details:");
        System.out.println("Name: " + freelancerName);
        System.out.println("Skill: " + skill);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Platform: " + platform);
        System.out.println("--------------------------------");

        client.getClientDetails();

    }
}