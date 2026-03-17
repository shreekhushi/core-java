class ZebronicsSpeaker {
    public static String getBrand() {
        System.out.println("getBrand invoked");
        return "ZEBRONICS";
    }

    public static int getPower() {
        System.out.println("getPower invoked");
        return 16;
    }

    public static String getConnectivity() {
        System.out.println("getConnectivity invoked");
        return "Bluetooth";
    }

    public static String getAudioMode() {
        System.out.println("getAudioMode invoked");
        return "Stereo";
    }
}