class InductionStoveExecutor{
  public static void main(String[] args){

    InductionStove.power();

    int heat = InductionStove.getHeatLevel();
    System.out.println("Current Heat Level: " + heat);

    InductionStove.increaseHeat();
    InductionStove.increaseHeat();
    heat = InductionStove.getHeatLevel();
    System.out.println("Heat level after increase: " + heat);

    InductionStove.decreaseHeat();
    heat = InductionStove.getHeatLevel();
    System.out.println("Heat level after decrease: " + heat);
  }
}