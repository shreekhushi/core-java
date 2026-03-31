class Guest{

    int guestId;
    String name;
    String profession;
    int experience;
    String topic;

    public void getGuestDetails() {
        System.out.println("Guest Details:");
        System.out.println("Guest Id: " + guestId);
        System.out.println("Name: " + name);
        System.out.println("Profession: " + profession);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Topic: " + topic);
        System.out.println("-----------------------------");
    }
}