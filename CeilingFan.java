class CeilingFan {

    static String brand = "Usha";
    static String color= "black";
    static int bladeCount= 5;
    static String powerSource = "electric";
    static String specialFeature = "faster than others";

    public static void main(String[] args) {

        // brand = "Crompton";
        // color = "Brown";
        // bladeCount = 3;
        // powerSource = "Electric";
        // specialFeature = "High Speed";
		
		String brand = "Crompton";
        String color = "Brown";
        int bladeCount = 3;
        String powerSource = "Electric";
        String specialFeature = "High Speed";

        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Blade Count: " + bladeCount);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Special Feature: " + specialFeature);
		
		System.out.println("Brand: " + CeilingFan.brand);
        System.out.println("Color: " + CeilingFan.color);
        System.out.println("Blade Count: " + CeilingFan.bladeCount);
        System.out.println("Power Source: " + CeilingFan.powerSource);
        System.out.println("Special Feature: " + CeilingFan.specialFeature);
    }
}
