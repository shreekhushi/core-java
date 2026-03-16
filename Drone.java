class Drone{
  static int maxHeight = 100;
  static int minHeight = 0;
  static int currentHeight;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Drone is ON");
    }else{
		isConnected = false;
      System.out.println("Drone is off");
    }
  }

  static int getHeight(){
    return currentHeight;
  }

  static void increaseHeight(){
    if(isConnected){
      if(currentHeight < maxHeight){
        currentHeight = currentHeight + 1;
        System.out.println("Height increased to: " + currentHeight);
      }else{
        System.out.println("Height already at maximum");
      }
    }else{
      System.out.println("Drone is OFF");
    }
  }

  static void decreaseHeight(){
    if(isConnected){
      if(currentHeight > minHeight){
        currentHeight = currentHeight - 1;
        System.out.println("Height decreased to: " + currentHeight);
      }else{
        System.out.println("Height already at minimum");
      }
    }else{
      System.out.println("Drone is OFF");
    }
  }
}