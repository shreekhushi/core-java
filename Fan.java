class Fan{

    String brand;
    String color;
    int price;
    int wings;
    String type;

    Capacitor capacitor;

    public void getFanDetails() {
        System.out.println("Fan Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Wings: " + wings);
        System.out.println("Type: " + type);
        System.out.println("----------------------");

        capacitor.getCapacitorDetails();

         }
}