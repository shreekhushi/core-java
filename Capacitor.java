class Capacitor{

    int capacitorId;
    String brand;
    double capacity;
    String type;
    int voltage;

    public void getCapacitorDetails() {
        System.out.println("Capacitor Id: " + capacitorId);
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + "uF");
        System.out.println("Type: " + type);
        System.out.println("Voltage: " + voltage);
        System.out.println("---------------------------");
    }
}