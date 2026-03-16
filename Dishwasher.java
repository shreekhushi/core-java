class Dishwasher{

  static int maxPressure = 10;
  static int minPressure = 0;
  static int currentPressure;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Dishwasher is ON");
    }else{
		isConnected = false;
      System.out.println("Dishwasher is off");
    }
  }

  static int getPressure(){
    return currentPressure;
  }

  static void increasePressure(){
    if(isConnected){
      if(currentPressure < maxPressure){
        currentPressure = currentPressure + 1;
        System.out.println("Water pressure increased to: " + currentPressure);
      }else{
        System.out.println("Pressure already at maximum");
      }
    }else{
      System.out.println("Dishwasher is OFF");
    }
  }

  static void decreasePressure(){
    if(isConnected){
      if(currentPressure > minPressure){
        currentPressure = currentPressure - 1;
        System.out.println("Water pressure decreased to: " + currentPressure);
      }else{
        System.out.println("Pressure already at minimum");
      }
    }else{
      System.out.println("Dishwasher is OFF");
    }
  }
}