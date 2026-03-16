class GamingConsoleExecutor{

  public static void main(String[] args){

    GamingConsole.power();

    int volume = GamingConsole.getVolume();
    System.out.println("Current Volume: " + volume);

    GamingConsole.increaseVolume();
    GamingConsole.increaseVolume();
	GamingConsole.increaseVolume();
    volume = GamingConsole.getVolume();
    System.out.println("Volume after increase: " + volume);

    GamingConsole.decreaseVolume();
    volume = GamingConsole.getVolume();
    System.out.println("Volume after decrease: " + volume);
  }
}