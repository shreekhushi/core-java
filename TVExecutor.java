class TVExecutor {

    public static void main(String[] args) {

        TV.power(); 

        int currentVolume = TV.getVolume();
        System.out.println("Current Volume: " + currentVolume);

        TV.increaseVolume();
        currentVolume = TV.getVolume();
        System.out.println("Volume after increase: " + currentVolume);
		
		
		TV.increaseVolume();
        currentVolume = TV.getVolume();
        System.out.println("Volume after increase: " + currentVolume);

		

        TV.decreaseVolume();
        currentVolume = TV.getVolume();
        System.out.println("Volume after decrease: " + currentVolume);
    }
}