class SpeakerExecutor{

  public static void main(String[] args){

    Speaker.power();

    int volume = Speaker.getVolume();
    System.out.println("Current Volume: " + volume);

    Speaker.increaseVolume();
    Speaker.increaseVolume();
    volume = Speaker.getVolume();
    System.out.println("Volume after increase: " + volume);

    Speaker.decreaseVolume();
	Speaker.decreaseVolume();
    volume = Speaker.getVolume();
    System.out.println("Volume after decrease: " + volume);
  }
}