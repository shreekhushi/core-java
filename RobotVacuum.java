class RobotVacuum {

    static String brand = "dyson";
    static String model = "ABC160";
    static String cleaningType = "vacuum , mop";
    static String batteryLife = "120 mins";
    static String suctionPower;
    static String controlMethod;
    static String color ="white";
    static String countryOfOrigin;

    public static void main(String[] args) {

        String brand = "Eureka";
        String model = "NER710";
        String cleaningType = "Vacuum, Sweep, Mop";
        String batteryLife = "180 Minutes";
        String suctionPower = "8000 Pa";
        String controlMethod = "App, Voice";
        String color = "Black";
        String countryOfOrigin = "China";

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Cleaning Type: " + cleaningType);
        System.out.println("Battery Life: " + batteryLife);
        System.out.println("Suction Power: " + suctionPower);
        System.out.println("Control Method: " + controlMethod);
        System.out.println("Color: " + color);
        System.out.println("Country of Origin: " + countryOfOrigin);
		
		System.out.println("Brand: " + RobotVacuum.brand);
        System.out.println("Model: " + RobotVacuum.model);
        System.out.println("Cleaning Type: " + RobotVacuum.cleaningType);
        System.out.println("Battery Life: " + RobotVacuum.batteryLife);
        System.out.println("Suction Power: " + RobotVacuum.suctionPower);
        System.out.println("Control Method: " + RobotVacuum.controlMethod);
        System.out.println("Color: " + RobotVacuum.color);
        System.out.println("Country of Origin: " + RobotVacuum.countryOfOrigin);
    }
}
