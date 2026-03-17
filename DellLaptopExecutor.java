class DellLaptopExecutor {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println("Brand: " + DellLaptop.getBrand());
        System.out.println("Processor: " + DellLaptop.getProcessor());
        System.out.println("RAM: " + DellLaptop.getRAM() + " GB");
        System.out.println("Color: " + DellLaptop.getColor());
        System.out.println("main ended");
    }
}