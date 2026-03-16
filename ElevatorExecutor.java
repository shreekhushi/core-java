class ElevatorExecutor{

  public static void main(String[] args){

    Elevator.power();

    int floor = Elevator.getFloor();
    System.out.println("Current Floor: " + floor);

    Elevator.increaseFloor();
    Elevator.increaseFloor();
    floor = Elevator.getFloor();
    System.out.println("Floor after moving up: " + floor);

    Elevator.decreaseFloor();
    floor = Elevator.getFloor();
    System.out.println("Floor after moving down: " + floor);
  }
}