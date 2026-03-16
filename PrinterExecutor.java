class PrinterExecutor{

  public static void main(String[] args){

    Printer.power();

    int speed = Printer.getSpeed();
    System.out.println("Current Print Speed: " + speed);

    Printer.increaseSpeed();
    Printer.increaseSpeed();
    speed = Printer.getSpeed();
    System.out.println("Speed after increase: " + speed);

    Printer.decreaseSpeed();
	Printer.decreaseSpeed();
    speed = Printer.getSpeed();
    System.out.println("Speed after decrease: " + speed);
  }
}