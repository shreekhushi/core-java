class SpotifyExecutor{

    public static void main(String[] args) {

        Spotify spotify = new Spotify();

        boolean added = spotify.addSong("Tum Hi Ho");
        System.out.println(added);
        System.out.println("---------------");

        added = spotify.addSong("Srivalli");
        System.out.println(added);
        System.out.println("---------------");

        added = spotify.addSong("Teri Ore");
        System.out.println(added);
        System.out.println("---------------");

        added = spotify.addSong("Jeene Laga Hoon");
        System.out.println(added);
        System.out.println("---------------");

        added = spotify.addSong("Bol Do Na Zara");
        System.out.println(added);
        System.out.println("---------------");

        added = spotify.addSong("Kala Chashma");
        System.out.println(added);
        System.out.println("---------------");

        added = spotify.addSong("Zara Sa");
        System.out.println(added);
        System.out.println("---------------");

        added = spotify.addSong("Sheila Ki Jawani");
        System.out.println(added);
        System.out.println("---------------");

        added = spotify.addSong("Raataan Lambiyan");
        System.out.println(added);
        System.out.println("---------------");

        added = spotify.addSong("Chogada");
        System.out.println(added);
        System.out.println("---------------");

        spotify.getSongs();
		
		String name = spotify.getSongByName("Teri Ore");
		System.out.println(name);
		
		boolean update = spotify.updateSong("Zara Sa", "Zara Zara");
		System.out.println(update);
		
		spotify.getSongs();
		
		boolean delete = spotify.deleteSong("Chogada");
		System.out.println(delete);
		
		spotify.getSongs();
    }
}