class WashingMachineExecutor{

  public static void main(String[] args){

    WashingMachine.power();
    WashingMachine.power();
    int level = WashingMachine.getWaterLevel();
    System.out.println("Current Water Level: " + level);

    WashingMachine.increaseWaterLevel();
    WashingMachine.increaseWaterLevel();
    WashingMachine.increaseWaterLevel();
    level = WashingMachine.getWaterLevel();
    System.out.println("Water level after increase: " + level);

    WashingMachine.decreaseWaterLevel();
    level = WashingMachine.getWaterLevel();
    System.out.println("Water level after decrease: " + level);
  }
}