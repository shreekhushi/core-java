class SmartBulb {

    static String brand = "Crompton";
    static String bulbBase = "D45";
    static String lightType = "LED";
    static String color = "white";
    static String specialFeature;
    static int weight = 300;
    static String powerSource;

    public static void main(String[] args) {

        String brand = "One94Store";
        String bulbBase = "E26";
        String lightType = "LED";
        String color = "Warm White";
        String specialFeature = "Motion Sensor, Dimmable, Waterproof";
        int weight = 200;
        String powerSource = "Corded Electric";

        System.out.println("Brand: " + brand);
        System.out.println("Bulb Base: " + bulbBase);
        System.out.println("Light Type: " + lightType);
        System.out.println("Color: " + color);
        System.out.println("Special Feature: " + specialFeature);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Power Source: " + powerSource);
		
		System.out.println("Brand: " + SmartBulb.brand);
        System.out.println("Bulb Base: " + SmartBulb.bulbBase);
        System.out.println("Light Type: " + SmartBulb.lightType);
        System.out.println("Color: " + SmartBulb.color);
        System.out.println("Special Feature: " + SmartBulb.specialFeature);
        System.out.println("Weight: " + SmartBulb.weight + " grams");
        System.out.println("Power Source: " + SmartBulb.powerSource);
    }
}
