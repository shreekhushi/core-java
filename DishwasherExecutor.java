class DishwasherExecutor{

  public static void main(String[] args){

    Dishwasher.power();

    int pressure = Dishwasher.getPressure();
    System.out.println("Current Water Pressure: " + pressure);

    Dishwasher.increasePressure();
    Dishwasher.increasePressure();
    pressure = Dishwasher.getPressure();
    System.out.println("Pressure after increase: " + pressure);

    Dishwasher.decreasePressure();
	Dishwasher.decreasePressure();
	Dishwasher.decreasePressure();
    pressure = Dishwasher.getPressure();
    System.out.println("Pressure after decrease: " + pressure);
  }
}