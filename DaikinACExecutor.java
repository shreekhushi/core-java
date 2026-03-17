class DaikinACExecutor {
    public static void main(String[] args) {
        System.out.println("Main Started");
        String brand = DaikinAC.getBrand();
        System.out.println("Brand: " + brand);
        String model = DaikinAC.getModel();
        System.out.println("Model: " + model);
        String energy = DaikinAC.getEnergyEfficiency();
        System.out.println("Energy: " + energy);
        double capacity = DaikinAC.getCapacity();
        System.out.println("Capacity: " + capacity + " Tons");
        System.out.println("Main Ended");
    }
}