class SamsungRefrigerator {

    static int capacity  = 750;
    static String brand = "Samsung" ;
    static String model;
    static String color = "Black";
    static String energyConsumption = "700 KWh per year";
    static String freezerCapacity = "300 Litres";
    static String specialFeature ;
    static String installationType;
    static String formFactor = "Side by Side";

    public static void main(String[] args) {

        
        int capacity = 653;
        String brand = "Samsung";
        String model = "RS76CG8003S9HL";
        String color = "Silver";
        String energyConsumption = "547 KWh per year";
        String freezerCapacity = "244 Litres";
        String specialFeature = "Inverter Compressor, Frost Free";
        String installationType = "Freestanding";
        String formFactor = "Side by Side";

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Color: " + color);
        System.out.println("Energy Consumption: " + energyConsumption);
        System.out.println("Freezer Capacity: " + freezerCapacity);
        System.out.println("Special Features: " + specialFeature);
        System.out.println("Installation Type: " + installationType);
        System.out.println("Form Factor: " + formFactor);
		
		System.out.println("Brand: " + SamsungRefrigerator.brand);
        System.out.println("Model: " + SamsungRefrigerator.model);
        System.out.println("Capacity: " + SamsungRefrigerator.capacity + " Litres");
        System.out.println("Color: " + SamsungRefrigerator.color);
        System.out.println("Energy Consumption: " + SamsungRefrigerator.energyConsumption);
        System.out.println("Freezer Capacity: " + SamsungRefrigerator.freezerCapacity);
        System.out.println("Special Features: " + SamsungRefrigerator.specialFeature);
        System.out.println("Installation Type: " + SamsungRefrigerator.installationType);
        System.out.println("Form Factor: " + SamsungRefrigerator.formFactor);
    }
}
