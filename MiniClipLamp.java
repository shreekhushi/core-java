class MiniClipLamp {

    static String brand;
    static String lampType;
    static String lightSource;
    static String color;
    static String specialFeature;
    static int weight;
    static String roomType;

    public static void main(String[] args) {

        brand = "One94Store";
        lampType = "Desk Lamp";
        lightSource = "LED";
        color = "Black";
        specialFeature = "Adjustable Arm, Dimmable";
        weight = 100;
        roomType = "Study Room";

        System.out.println("Brand: " + brand);
        System.out.println("Lamp Type: " + lampType);
        System.out.println("Light Source: " + lightSource);
        System.out.println("Color: " + color);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Room Type: " + roomType);
    }
}
