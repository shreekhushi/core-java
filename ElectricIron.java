class ElectricIron{

  static int maxTemperature = 200;
  static int minTemperature = 0;
  static int currentTemperature;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Electric Iron is ON");
    }else{
		isConnected = false;
      System.out.println("Electric Iron is off");
    }
  }

  static int getTemperature(){
    return currentTemperature;
  }

  static void increaseTemperature(){
    if(isConnected){
      if(currentTemperature < maxTemperature){
        currentTemperature = currentTemperature + 1;
        System.out.println("Temperature increased to: " + currentTemperature);
      }else{
        System.out.println("Temperature already at maximum");
      }
    }else{
      System.out.println("Electric Iron is OFF");
    }
  }

  static void decreaseTemperature(){
    if(isConnected){
      if(currentTemperature > minTemperature){
        currentTemperature = currentTemperature - 1;
        System.out.println("Temperature decreased to: " + currentTemperature);
      }else{
        System.out.println("Temperature already at minimum");
      }
    }else{
      System.out.println("Electric Iron is OFF");
    }
  }
}