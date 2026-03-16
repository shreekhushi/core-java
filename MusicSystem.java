class MusicSystem{

  static int maxBass = 10;
  static int minBass = 0;
  static int currentBass;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Music System is ON");
    }else{
		isConnected = false;
      System.out.println("Music System if off");
    }
  }

  static int getBass(){
    return currentBass;
  }

  static void increaseBass(){
    if(isConnected){
      if(currentBass < maxBass){
        currentBass = currentBass +1;
        System.out.println("Bass increased to: " + currentBass);
      }else{
        System.out.println("Bass already at maximum");
      }
    }else{
      System.out.println("Music System is OFF");
    }
  }

  static void decreaseBass(){
    if(isConnected){
      if(currentBass > minBass){
        currentBass = currentBass - 1;
        System.out.println("Bass decreased to: " + currentBass);
      }else{
        System.out.println("Bass already at minimum");
      }
    }else{
      System.out.println("Music System is OFF");
    }
  }
}