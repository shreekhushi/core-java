class AirPurifierExecutor{

  public static void main(String[] args){

    AirPurifier.power();
	AirPurifier.power();

    int speed = AirPurifier.getSpeed();
    System.out.println("Current Fan Speed: " + speed);

    AirPurifier.increaseSpeed();
    AirPurifier.increaseSpeed();
    speed = AirPurifier.getSpeed();
    System.out.println("Speed after increase: " + speed);

    AirPurifier.decreaseSpeed();
    speed = AirPurifier.getSpeed();
    System.out.println("Speed after decrease: " + speed);
  }
}