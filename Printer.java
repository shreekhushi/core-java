class Printer{
  static int maxSpeed = 20;
  static int minSpeed = 0;
  static int currentSpeed;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Printer is ON");
    }else{
		isConnected = false;
      System.out.println("Printer is off");
    }
  }

  static int getSpeed(){
    return currentSpeed;
  }

  static void increaseSpeed(){
    if(isConnected){
      if(currentSpeed < maxSpeed){
        currentSpeed = currentSpeed + 1;
        System.out.println("Print speed increased to: " + currentSpeed);
      }else{
        System.out.println("Print speed already at maximum");
      }
    }else{
      System.out.println("Printer is OFF");
    }
  }

  static void decreaseSpeed(){
    if(isConnected){
      if(currentSpeed > minSpeed){
        currentSpeed = currentSpeed - 1;
        System.out.println("Print speed decreased to: " + currentSpeed);
      }else{
        System.out.println("Print speed already at minimum");
      }
    }else{
      System.out.println("Printer is OFF");
    }
  }
}