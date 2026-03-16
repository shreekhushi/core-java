class Projector{

  static int maxBrightness = 10;
  static int minBrightness = 0;
  static int currentBrightness;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Projector is ON");
    }else{
	  isConnected = false;
      System.out.println("Projector is off");
    }
  }

  static int getBrightness(){
    return currentBrightness;
  }

  static void increaseBrightness(){
    if(isConnected){
      if(currentBrightness < maxBrightness){
        currentBrightness = currentBrightness+ 1;
        System.out.println("Brightness increased to: " + currentBrightness);
      }else{
        System.out.println("Brightness already at maximum");
      }
    }else{
      System.out.println("Projector is OFF");
    }
  }

  static void decreaseBrightness(){
    if(isConnected){
      if(currentBrightness > minBrightness){
        currentBrightness = currentBrightness - 1;
        System.out.println("Brightness decreased to: " + currentBrightness);
      }else{
        System.out.println("Brightness already at minimum");
      }
    }else{
      System.out.println("Projector is OFF");
    }
  }
}