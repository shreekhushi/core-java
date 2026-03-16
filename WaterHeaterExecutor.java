class WaterHeaterExecutor{

  public static void main(String[] args){

    WaterHeater.power();

    int temp = WaterHeater.getTemperature();
    System.out.println("Current Temperature: " + temp);

    WaterHeater.increaseTemperature();
    WaterHeater.increaseTemperature();
    temp = WaterHeater.getTemperature();
    System.out.println("Temperature after increase: " + temp);

    WaterHeater.decreaseTemperature();
    WaterHeater.decreaseTemperature();
    temp = WaterHeater.getTemperature();
    System.out.println("Temperature after decrease: " + temp);
  }
}


