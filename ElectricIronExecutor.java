class ElectricIronExecutor{

  public static void main(String[] args){

    ElectricIron.power();

    int temp = ElectricIron.getTemperature();
    System.out.println("Current Temperature: " + temp);

    ElectricIron.increaseTemperature();
    ElectricIron.increaseTemperature();
    temp = ElectricIron.getTemperature();
    System.out.println("Temperature after increase: " + temp);

    ElectricIron.decreaseTemperature();
    temp = ElectricIron.getTemperature();
    System.out.println("Temperature after decrease: " + temp);
  }
}