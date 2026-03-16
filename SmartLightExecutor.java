class SmartLightExecutor{

  public static void main(String[] args){

    SmartLight.power();

    int brightness = SmartLight.getBrightness();
    System.out.println("Current Brightness: " + brightness);

    SmartLight.increaseBrightness();
    SmartLight.increaseBrightness();
    brightness = SmartLight.getBrightness();
    System.out.println("Brightness after increase: " + brightness);

    SmartLight.decreaseBrightness();
    brightness = SmartLight.getBrightness();
    System.out.println("Brightness after decrease: " + brightness);
  }
}