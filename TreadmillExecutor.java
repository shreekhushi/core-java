class TreadmillExecutor{

  public static void main(String[] args){

    Treadmill.power();

    int speed = Treadmill.getSpeed();
    System.out.println("Current Speed: " + speed);

    Treadmill.increaseSpeed();
    speed = Treadmill.getSpeed();
    System.out.println("Speed after increase: " + speed);

    Treadmill.decreaseSpeed();
    speed = Treadmill.getSpeed();
    System.out.println("Speed after decrease: " + speed);
  }
}