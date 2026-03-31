class Series{

    String seriesName;
    String genre;
    int totalSeasons;
    String platform;
    String language;

    Episode episode; 

    public void getSeriesDetails() {
        System.out.println("Series Details:");
        System.out.println("Series Name: " + seriesName);
        System.out.println("Genre: " + genre);
        System.out.println("Total Seasons: " + totalSeasons);
        System.out.println("Platform: " + platform);
        System.out.println("Language: " + language);
        System.out.println("--------------------------------");

        episode.getEpisodeDetails();

    }
}