class ZebronicsSpeakerExecutor {
    public static void main(String[] args) {
        System.out.println("Main Started");
        System.out.println("Brand: " + ZebronicsSpeaker.getBrand());
        System.out.println("Power: " + ZebronicsSpeaker.getPower() + " Watts");
        System.out.println("Connectivity: " + ZebronicsSpeaker.getConnectivity());
        System.out.println("Audio Mode: " + ZebronicsSpeaker.getAudioMode());
        System.out.println("Main Ended");
    }
}