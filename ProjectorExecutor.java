class ProjectorExecutor{

  public static void main(String[] args){

    Projector.power();

    int brightness = Projector.getBrightness();
    System.out.println("Current Brightness: " + brightness);

    Projector.increaseBrightness();
    Projector.increaseBrightness();
    brightness = Projector.getBrightness();
    System.out.println("Brightness after increase: " + brightness);

    Projector.decreaseBrightness();
    brightness = Projector.getBrightness();
    System.out.println("Brightness after decrease: " + brightness);
  }
}