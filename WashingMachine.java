class WashingMachine {

    static String brand= "samsung";
    static int capacity = 8;
    static String type = "manual and automatic";
    static String color = "black";
    static String specialFeature = "Inverter Motor";

    public static void main(String[] args) {

        String brand = "LG";
        int capacity = 7;
        String type = "Fully Automatic";
        String color = "White";
        String specialFeature = "Inverter Motor";

        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + " Kg");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Special Feature: " + specialFeature);
		
		System.out.println("Brand: " + WashingMachine.brand);
        System.out.println("Capacity: " + WashingMachine.capacity + " Kg");
        System.out.println("Type: " + WashingMachine.type);
        System.out.println("Color: " + WashingMachine.color);
        System.out.println("Special Feature: " + WashingMachine.specialFeature);
    }
}
