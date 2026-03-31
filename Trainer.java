class Trainer{

    int trainerId;
    String name;
    String specialization;
    int experience;
    double salary;

    public void getTrainerDetails() {
        System.out.println("Trainer Details:");
        System.out.println("Trainer Id: " + trainerId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: " + salary);
        System.out.println("-----------------------------");
    }
}