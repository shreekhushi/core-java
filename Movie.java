class Movie{

    String movieName;
    String director;
    String genre;
    double budget;
    int duration;

    Actor actor;

    public void getMovieDetails() {
        System.out.println("Movie Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Budget: " + budget);
        System.out.println("Duration: " + duration + " mins");
        System.out.println("--------------------------------");

        actor.getActorDetails();

    }
}