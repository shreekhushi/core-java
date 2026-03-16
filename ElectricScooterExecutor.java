class ElectricScooterExecutor{

  public static void main(String[] args){

    ElectricScooter.power();

    int speed = ElectricScooter.getSpeed();
    System.out.println("Current Speed: " + speed);

    ElectricScooter.increaseSpeed();
    ElectricScooter.increaseSpeed();
    ElectricScooter.increaseSpeed();
    speed = ElectricScooter.getSpeed();
    System.out.println("Speed after increase: " + speed);

    ElectricScooter.decreaseSpeed();

    speed = ElectricScooter.getSpeed();
    System.out.println("Speed after decrease: " + speed);
  }
}