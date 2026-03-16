class AirPurifier{

  static int maxSpeed = 5;
  static int minSpeed = 0;
  static int currentSpeed;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Air Purifier is ON");
    }else{
	  isConnected = false;
      System.out.println("Air Purifier is off");
    }
  }

  static int getSpeed(){
    return currentSpeed;
  }

  static void increaseSpeed(){
    if(isConnected){
      if(currentSpeed < maxSpeed){
        currentSpeed = currentSpeed + 1;
        System.out.println("Fan speed increased to: " + currentSpeed);
      }else{
        System.out.println("Fan speed already at maximum");
      }
    }else{
      System.out.println("Air Purifier is OFF");
    }
  }

  static void decreaseSpeed(){
    if(isConnected){
      if(currentSpeed > minSpeed){
        currentSpeed = currentSpeed - 1;
        System.out.println("Fan speed decreased to: " + currentSpeed);
      }else{
        System.out.println("Fan speed already at minimum");
      }
    }else{
      System.out.println("Air Purifier is OFF");
    }
  }
}