class PendantLamp {

    static String brand = "Alex";
    static String color = "white";
    static String material="fiber";
    static String style;
    static String roomType ="bedroom";
    static String powerSource = "electric";
    static String finishType;
    static int weight = 100;

    public static void main(String[] args) {

        String brand = "ExclusiveLane";
        String color = "Metallic Brown";
        String material = "Powder Coated Iron";
        String style = "Modern";
        String roomType = "Bedroom, Living Room";
        String powerSource = "Electric";
        String finishType = "Powder Coated";
        int weight = 374;

        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Style: " + style);
        System.out.println("Room Type: " + roomType);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Weight: " + weight + " grams");
		
		System.out.println("Brand: " + PendantLamp.brand);
        System.out.println("Color: " + PendantLamp.color);
        System.out.println("Material: " + PendantLamp.material);
        System.out.println("Style: " + PendantLamp.style);
        System.out.println("Room Type: " + PendantLamp.roomType);
        System.out.println("Power Source: " + PendantLamp.powerSource);
        System.out.println("Finish Type: " + PendantLamp.finishType);
        System.out.println("Weight: " + PendantLamp.weight + " grams");
    }
}
