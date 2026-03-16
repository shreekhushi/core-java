class Elevator{

  static int maxFloor = 20;
  static int minFloor = 0;
  static int currentFloor;
  static boolean isConnected;

  static void power(){
    if(isConnected == false){
      isConnected = true;
      System.out.println("Elevator is ON");
    }else{
		isConnected = false;
      System.out.println("Elevator is off");
    }
  }

  static int getFloor(){
    return currentFloor;
  }

  static void increaseFloor(){
    if(isConnected){
      if(currentFloor < maxFloor){
        currentFloor = currentFloor + 1;
        System.out.println("Elevator moved to floor: " + currentFloor);
      }else{
        System.out.println("Already at top floor");
      }
    }else{
      System.out.println("Elevator is OFF");
    }
  }

  static void decreaseFloor(){
    if(isConnected){
      if(currentFloor > minFloor){
        currentFloor = currentFloor - 1;
        System.out.println("Elevator moved to floor: " + currentFloor);
      }else{
        System.out.println("Already at ground floor");
      }
    }else{
      System.out.println("Elevator is OFF");
    }
  }
}