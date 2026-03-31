class Podcast{

    String podcastName;
    String hostName;
    String genre;
    int episodeNumber;
    double duration;

    Guest guest; 
    public void getPodcastDetails() {
        System.out.println("Podcast Details:");
        System.out.println("Podcast Name: " + podcastName);
        System.out.println("Host Name: " + hostName);
        System.out.println("Genre: " + genre);
        System.out.println("Episode Number: " + episodeNumber);
        System.out.println("Duration: " + duration + " mins");
        System.out.println("--------------------------------");

        guest.getGuestDetails();

    }
}