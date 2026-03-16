class FanExecutor{
	public static void main(String[] args){
		
	Fan.power();

    int speed = Fan.getLevel();
    System.out.println("Current Speed: " + speed);

    Fan.increaseLevel();
    Fan.increaseLevel();
	Fan.increaseLevel();
	Fan.increaseLevel();
	Fan.increaseLevel();
	Fan.increaseLevel();
    speed = Fan.getLevel();
    System.out.println("Speed after increase: " + speed);

    Fan.decreaseLevel();
    speed = Fan.getLevel();
    System.out.println("Speed after decrease: " + speed);
	}
}