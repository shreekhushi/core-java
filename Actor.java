class Actor{

    int actorId;
    String name;
    int age;
    String role;
    double salary;

    public void getActorDetails() {
        System.out.println("Actor Details:");
        System.out.println("Actor Id: " + actorId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println("-----------------------------");
    }
}