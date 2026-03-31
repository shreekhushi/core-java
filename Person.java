class Person{

    String name;
    int age;
    String gender;
    String address;
    long contactNumber;

    GovernmentIdentification governmentId; 
	
    public void getPersonDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("--------------------------------");

        governmentId.getIdDetails();

    }
}