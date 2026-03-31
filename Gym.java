class Gym{

    String gymName;
    String location;
    int totalMembers;
    double monthlyFee;
    String gymType;

    Trainer trainer;

    public void getGymDetails() {
        System.out.println("Gym Details:");
        System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Total Members: " + totalMembers);
        System.out.println("Monthly Fee: " + monthlyFee);
        System.out.println("Gym Type: " + gymType);
        System.out.println("--------------------------------");

        trainer.getTrainerDetails();

    }
}