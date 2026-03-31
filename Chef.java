class Chef{

    int chefId;
    String name;
    String specialization;
    int experience;
    double salary;

    public void getChefDetails() {
        System.out.println("Chef Details:");
        System.out.println("Chef Id: " + chefId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: " + salary);
        System.out.println("-----------------------------");
    }
}