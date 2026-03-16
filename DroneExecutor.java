class DroneExecutor{

  public static void main(String[] args){

    Drone.power();

    int height = Drone.getHeight();
    System.out.println("Current Height: " + height);

    Drone.increaseHeight();
    Drone.increaseHeight();
	Drone.increaseHeight();
	Drone.increaseHeight();
	Drone.increaseHeight();
	Drone.increaseHeight();
	Drone.increaseHeight();
    height = Drone.getHeight();
    System.out.println("Height after increase: " + height);

    Drone.decreaseHeight();
	Drone.decreaseHeight();
	Drone.decreaseHeight();
	Drone.decreaseHeight();
    height = Drone.getHeight();
    System.out.println("Height after decrease: " + height);
  }
}