class Camera{
  static int maxZoom = 10;
  static int minZoom = 0;
  static int currentZoom;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Camera is ON");
    }else{
		isConnected = false;
      System.out.println("Camera is off");
    }
  }

  static int getZoom(){
    return currentZoom;
  }

  static void zoomIn(){
    if(isConnected){
      if(currentZoom < maxZoom){
        currentZoom = currentZoom + 1;
        System.out.println("Zoom increased to: " + currentZoom);
      }else{
        System.out.println("Zoom already at maximum");
      }
    }else{
      System.out.println("Camera is OFF");
    }
  }

  static void zoomOut(){
    if(isConnected){
      if(currentZoom > minZoom){
        currentZoom = currentZoom - 1;
        System.out.println("Zoom decreased to: " + currentZoom);
      }else{
        System.out.println("Zoom already at minimum");
      }
    }else{
      System.out.println("Camera is OFF");
    }
  }
}