class BluetoothHeadphones{

  static int maxVolume = 15;
  static int minVolume = 0;
  static int currentVolume;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Bluetooth Headphones are ON");
    }else{
		isConnected = false;
      System.out.println("Bluetooth Headphones is off");
    }
  }

  static int getVolume(){
    return currentVolume;
  }

  static void increaseVolume(){
    if(isConnected){
      if(currentVolume < maxVolume){
        currentVolume = currentVolume + 1;
        System.out.println("Volume increased to: " + currentVolume);
      }else{
        System.out.println("Volume already at maximum");
      }
    }else{
      System.out.println("Headphones are OFF");
    }
  }

  static void decreaseVolume(){
    if(isConnected){
      if(currentVolume > minVolume){
        currentVolume = currentVolume - 1;
        System.out.println("Volume decreased to: " + currentVolume);
      }else{
        System.out.println("Volume already at minimum");
      }
    }else{
      System.out.println("Headphones are OFF");
    }
  }
}