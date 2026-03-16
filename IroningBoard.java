class IroningBoard {

    static String brand ;
    static String material ="cotton";
    static String frameMaterial ="Stainless steel";
    static String color = "white";
    static String mountingType;
    static int weight = 4000;
    static String modelNumber;

    public static void main(String[] args) {

        String brand = "Happer";
        String material = "Cotton, Plastic";
        String frameMaterial = "Stainless Steel";
        String color = "Silver";
        String mountingType = "Floor Mount";
        int weight = 4700;
        String modelNumber = "DeluxePlus-15";

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Frame Material: " + frameMaterial);
        System.out.println("Color: " + color);
        System.out.println("Mounting Type: " + mountingType);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Model Number: " + modelNumber);
		
		System.out.println("Brand: " + IroningBoard.brand);
        System.out.println("Material: " + IroningBoard.material);
        System.out.println("Frame Material: " + IroningBoard.frameMaterial);
        System.out.println("Color: " + IroningBoard.color);
        System.out.println("Mounting Type: " + IroningBoard.mountingType);
        System.out.println("Weight: " + IroningBoard.weight + " grams");
        System.out.println("Model Number: " + IroningBoard.modelNumber);
    }
}
