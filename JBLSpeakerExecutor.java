class JBLSpeakerExecutor {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println("Brand: " + JBLSpeaker.getBrand());
        System.out.println("Power: " + JBLSpeaker.getPower() + " Watts");
        System.out.println("Connectivity: " + JBLSpeaker.getConnectivity());
        System.out.println("Color: " + JBLSpeaker.getColor());
        System.out.println("main ended");
    }
}