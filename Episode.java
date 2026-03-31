class Episode{

    int episodeNumber;
    String title;
    double duration;
    String releaseDate;
    String rating;

    public void getEpisodeDetails() {
        System.out.println("Episode Details:");
        System.out.println("Episode Number: " + episodeNumber);
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Rating: " + rating);
        System.out.println("-----------------------------");
    }
}