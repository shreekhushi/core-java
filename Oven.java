class Oven {

    static String brand = "butterfly";
    static int capacity = 30;
    static String color = "Silver";
    static String controlType = "touch";
    static String specialFeature ;

    public static void main(String[] args) {

        String brand = "Samsung";
        int capacity = 28;
        String color = "Black";
        String controlType = "Touch";
        String specialFeature = "Convection, Grill";

        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Color: " + color);
        System.out.println("Control Type: " + controlType);
        System.out.println("Special Feature: " + specialFeature);
		
		
		System.out.println("Brand: " + Oven.brand);
        System.out.println("Capacity: " + Oven.capacity + " Litres");
        System.out.println("Color: " + Oven.color);
        System.out.println("Control Type: " + Oven.controlType);
        System.out.println("Special Feature: " + Oven.specialFeature);
    }
}
