class LaptopExecutor{

  public static void main(String[] args){

    Laptop.power();

    int brightness = Laptop.getBrightness();
    System.out.println("Current Brightness: " + brightness);

    Laptop.increaseBrightness();
    Laptop.increaseBrightness();
    brightness = Laptop.getBrightness();
    System.out.println("Brightness after increase: " + brightness);

    Laptop.decreaseBrightness();
    brightness = Laptop.getBrightness();
    System.out.println("Brightness after decrease: " + brightness);
  }
}