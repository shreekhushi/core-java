class BluetoothHeadphonesExecutor{

  public static void main(String[] args){

    BluetoothHeadphones.power();

    int volume = BluetoothHeadphones.getVolume();
    System.out.println("Current Volume: " + volume);

    BluetoothHeadphones.increaseVolume();
    BluetoothHeadphones.increaseVolume();
	BluetoothHeadphones.increaseVolume();
    volume = BluetoothHeadphones.getVolume();
    System.out.println("Volume after increase: " + volume);

    BluetoothHeadphones.decreaseVolume();
    volume = BluetoothHeadphones.getVolume();
    System.out.println("Volume after decrease: " + volume);
  }
}