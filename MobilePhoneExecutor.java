class MobilePhoneExecutor{
  public static void main(String[] args){

    MobilePhone.power();

    int volume = MobilePhone.getVolume();
    System.out.println("Current Volume: " + volume);

    MobilePhone.increaseVolume();
    MobilePhone.increaseVolume();
    volume = MobilePhone.getVolume();
    System.out.println("Volume after increase: " + volume);

    MobilePhone.decreaseVolume();
    volume = MobilePhone.getVolume();
    System.out.println("Volume after decrease: " + volume);
	
	MobilePhone.increaseVolume();
    MobilePhone.increaseVolume();
	MobilePhone.increaseVolume();
    volume = MobilePhone.getVolume();
    System.out.println("Volume after increase: " + volume);
  }
}