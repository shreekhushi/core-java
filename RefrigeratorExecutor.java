class RefrigeratorExecutor{

  public static void main(String[] args){

    Refrigerator.power();
	Refrigerator.power();
	Refrigerator.power();

    int level = Refrigerator.getCoolingLevel();
    System.out.println("Current Cooling Level: " + level);

    Refrigerator.increaseCooling();
    Refrigerator.increaseCooling();
    level = Refrigerator.getCoolingLevel();
    System.out.println("Cooling level after increase: " + level);

    Refrigerator.decreaseCooling();
    level = Refrigerator.getCoolingLevel();
    System.out.println("Cooling level after decrease: " + level);
  }
}