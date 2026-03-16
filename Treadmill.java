class Treadmill{
  static int maxSpeed = 12;
  static int minSpeed = 0;
  static int currentSpeed;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Treadmill is ON");
    }else{
	  isConnected = false;
      System.out.println("Treadmill is OFF");
    }
  }

  static int getSpeed(){
    return currentSpeed;
  }

  static void increaseSpeed(){
    if(isConnected){
      if(currentSpeed < maxSpeed){
        currentSpeed = currentSpeed + 1;
        System.out.println("Speed increased to: " + currentSpeed);
      }else{
        System.out.println("Speed already at maximum");
      }
    }else{
      System.out.println("Treadmill is OFF");
    }
  }

  static void decreaseSpeed(){
    if(isConnected){
      if(currentSpeed > minSpeed){
        currentSpeed = currentSpeed - 1;
        System.out.println("Speed decreased to: " + currentSpeed);
      }else{
        System.out.println("Speed already at minimum");
      }
    }else{
      System.out.println("Treadmill is OFF");
    }
  }
}