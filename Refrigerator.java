class Refrigerator{

  static int maxCoolingLevel = 10;
  static int minCoolingLevel = 0;
  static int currentCoolingLevel;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Refrigerator is ON");
    }else{
	  isConnected = false;
      System.out.println("Refrigerator is OFF");
    }
  }

  static int getCoolingLevel(){
    return currentCoolingLevel;
  }

  static void increaseCooling(){
    if(isConnected){
      if(currentCoolingLevel < maxCoolingLevel){
        currentCoolingLevel = currentCoolingLevel + 1;
        System.out.println("Cooling level increased to: " + currentCoolingLevel);
      }else{
        System.out.println("Cooling level already at maximum");
      }
    }else{
      System.out.println("Refrigerator is OFF");
    }
  }

  static void decreaseCooling(){
    if(isConnected){
      if(currentCoolingLevel > minCoolingLevel){
        currentCoolingLevel = currentCoolingLevel - 1;
        System.out.println("Cooling level decreased to: " + currentCoolingLevel);
      }else{
        System.out.println("Cooling level already at minimum");
      }
    }else{
      System.out.println("Refrigerator is OFF");
    }
  }
}