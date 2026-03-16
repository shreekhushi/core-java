class WashingMachine{

  static int maxWaterLevel = 5;
  static int minWaterLevel = 0;
  static int currentWaterLevel;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Washing Machine is ON");
    }else{
	  isConnected = false;
      System.out.println("Washing Machine is OFF");
    }
  }

  static int getWaterLevel(){
    return currentWaterLevel;
  }

  static void increaseWaterLevel(){
    if(isConnected){
      if(currentWaterLevel < maxWaterLevel){
        currentWaterLevel = currentWaterLevel + 1;
        System.out.println("Water level increased to: " + currentWaterLevel);
      }else{
        System.out.println("Water level already at maximum");
      }
    }else{
      System.out.println("Machine is OFF");
    }
  }

  static void decreaseWaterLevel(){
    if(isConnected){
      if(currentWaterLevel > minWaterLevel){
        currentWaterLevel = currentWaterLevel - 1;
        System.out.println("Water level decreased to: " + currentWaterLevel);
      }else{
        System.out.println("Water level already at minimum");
      }
    }else{
      System.out.println("Machine is OFF");
    }
  }
}