class InductionStove{
  static int maxHeatLevel = 10;
  static int minHeatLevel = 0;
  static int currentHeatLevel;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Induction Stove is ON");
    }else{
		isConnected = false;
      System.out.println("Induction Stove is off");
    }
  }

  static int getHeatLevel(){
    return currentHeatLevel;
  }

  static void increaseHeat(){
    if(isConnected){
      if(currentHeatLevel < maxHeatLevel){
        currentHeatLevel = currentHeatLevel + 1;
        System.out.println("Heat level increased to: " + currentHeatLevel);
      }else{
        System.out.println("Heat level already at maximum");
      }
    }else{
      System.out.println("Induction Stove is OFF");
    }
  }

  static void decreaseHeat(){
    if(isConnected){
      if(currentHeatLevel > minHeatLevel){
        currentHeatLevel = currentHeatLevel - 1;
        System.out.println("Heat level decreased to: " + currentHeatLevel);
      }else{
        System.out.println("Heat level already at minimum");
      }
    }else{
      System.out.println("Induction Stove is OFF");
    }
  }
}