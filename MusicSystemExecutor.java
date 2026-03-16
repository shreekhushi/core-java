class MusicSystemExecutor{

  public static void main(String[] args){

    MusicSystem.power();

    int bass = MusicSystem.getBass();
    System.out.println("Current Bass Level: " + bass);

    MusicSystem.increaseBass();
    MusicSystem.increaseBass();
    bass = MusicSystem.getBass();
    System.out.println("Bass after increase: " + bass);

    MusicSystem.decreaseBass();
    bass = MusicSystem.getBass();
    System.out.println("Bass after decrease: " + bass);
  }
}