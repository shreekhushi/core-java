class CoffeeMachineExecutor{

  public static void main(String[] args){

    CoffeeMachine.power();

    int temp = CoffeeMachine.getTemperature();
    System.out.println("Current Temperature: " + temp);

    CoffeeMachine.increaseTemperature();
    CoffeeMachine.increaseTemperature();
	CoffeeMachine.increaseTemperature();
    CoffeeMachine.increaseTemperature();
    temp = CoffeeMachine.getTemperature();
    System.out.println("Temperature after increase: " + temp);

    CoffeeMachine.decreaseTemperature();
    temp = CoffeeMachine.getTemperature();
    System.out.println("Temperature after decrease: " + temp);
  }
}