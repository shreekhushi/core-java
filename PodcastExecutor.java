class PodcastExecutor{

    public static void main(String[] args) {

        Podcast p1 = new Podcast();
        p1.podcastName = "Tech Talks";
        p1.hostName = "Ankit";
        p1.genre = "Technology";
        p1.episodeNumber = 1;
        p1.duration = 45;

        Guest g1 = new Guest();
        g1.guestId = 1;
        g1.name = "Ravi";
        g1.profession = "Software Engineer";
        g1.experience = 5;
        g1.topic = "AI Trends";

        p1.guest = g1;
        p1.getPodcastDetails();


        Podcast p2 = new Podcast();
        p2.podcastName = "Health Hub";
        p2.hostName = "Sneha";
        p2.genre = "Health";
        p2.episodeNumber = 2;
        p2.duration = 40;

        Guest g2 = new Guest();
        g2.guestId = 2;
        g2.name = "Dr. Meena";
        g2.profession = "Doctor";
        g2.experience = 10;
        g2.topic = "Nutrition";

        p2.guest = g2;
        p2.getPodcastDetails();


        Podcast p3 = new Podcast();
        p3.podcastName = "Startup Stories";
        p3.hostName = "Rahul";
        p3.genre = "Business";
        p3.episodeNumber = 3;
        p3.duration = 50;

        Guest g3 = new Guest();
        g3.guestId = 3;
        g3.name = "Arjun";
        g3.profession = "Entrepreneur";
        g3.experience = 8;
        g3.topic = "Startups";

        p3.guest = g3;
        p3.getPodcastDetails();


        Podcast p4 = new Podcast();
        p4.podcastName = "Movie Buzz";
        p4.hostName = "Priya";
        p4.genre = "Entertainment";
        p4.episodeNumber = 4;
        p4.duration = 35;

        Guest g4 = new Guest();
        g4.guestId = 4;
        g4.name = "Karan";
        g4.profession = "Actor";
        g4.experience = 12;
        g4.topic = "Cinema";

        p4.guest = g4;
        p4.getPodcastDetails();


        Podcast p5 = new Podcast();
        p5.podcastName = "Fitness Freak";
        p5.hostName = "Kiran";
        p5.genre = "Fitness";
        p5.episodeNumber = 5;
        p5.duration = 30;

        Guest g5 = new Guest();
        g5.guestId = 5;
        g5.name = "Rohit";
        g5.profession = "Trainer";
        g5.experience = 6;
        g5.topic = "Workout";

        p5.guest = g5;
        p5.getPodcastDetails();


        Podcast p6 = new Podcast();
        p6.podcastName = "Finance Talk";
        p6.hostName = "Deepak";
        p6.genre = "Finance";
        p6.episodeNumber = 6;
        p6.duration = 55;

        Guest g6 = new Guest();
        g6.guestId = 6;
        g6.name = "Anil";
        g6.profession = "Investor";
        g6.experience = 15;
        g6.topic = "Stock Market";

        p6.guest = g6;
        p6.getPodcastDetails();


        Podcast p7 = new Podcast();
        p7.podcastName = "Travel Diaries";
        p7.hostName = "Divya";
        p7.genre = "Travel";
        p7.episodeNumber = 7;
        p7.duration = 42;

        Guest g7 = new Guest();
        g7.guestId = 7;
        g7.name = "Neha";
        g7.profession = "Travel Blogger";
        g7.experience = 7;
        g7.topic = "Europe Trip";

        p7.guest = g7;
        p7.getPodcastDetails();


        Podcast p8 = new Podcast();
        p8.podcastName = "Education Edge";
        p8.hostName = "Amit";
        p8.genre = "Education";
        p8.episodeNumber = 8;
        p8.duration = 38;

        Guest g8 = new Guest();
        g8.guestId = 8;
        g8.name = "Pooja";
        g8.profession = "Teacher";
        g8.experience = 9;
        g8.topic = "Learning Skills";

        p8.guest = g8;
        p8.getPodcastDetails();

        Podcast p9 = new Podcast();
        p9.podcastName = "Gaming Zone";
        p9.hostName = "Vikram";
        p9.genre = "Gaming";
        p9.episodeNumber = 9;
        p9.duration = 48;

        Guest g9 = new Guest();
        g9.guestId = 9;
        g9.name = "Suresh";
        g9.profession = "Gamer";
        g9.experience = 5;
        g9.topic = "Esports";

        p9.guest = g9;
        p9.getPodcastDetails();

        Podcast p10 = new Podcast();
        p10.podcastName = "Food Talks";
        p10.hostName = "Sunita";
        p10.genre = "Food";
        p10.episodeNumber = 10;
        p10.duration = 36;

        Guest g10 = new Guest();
        g10.guestId = 10;
        g10.name = "Chef Arjun";
        g10.profession = "Chef";
        g10.experience = 11;
        g10.topic = "Cooking Tips";

        p10.guest = g10;
        p10.getPodcastDetails();


        Podcast p11 = new Podcast();
        p11.podcastName = "Mind Matters";
        p11.hostName = "Kavya";
        p11.genre = "Psychology";
        p11.episodeNumber = 11;
        p11.duration = 44;

        Guest g11 = new Guest();
        g11.guestId = 11;
        g11.name = "Dr. Raj";
        g11.profession = "Psychologist";
        g11.experience = 14;
        g11.topic = "Mental Health";

        p11.guest = g11;
        p11.getPodcastDetails();


        Podcast p12 = new Podcast();
        p12.podcastName = "Coding Bytes";
        p12.hostName = "Nithin";
        p12.genre = "Technology";
        p12.episodeNumber = 12;
        p12.duration = 41;

        Guest g12 = new Guest();
        g12.guestId = 12;
        g12.name = "Akash";
        g12.profession = "Developer";
        g12.experience = 6;
        g12.topic = "Java";

        p12.guest = g12;
        p12.getPodcastDetails();


        Podcast p13 = new Podcast();
        p13.podcastName = "Career Guide";
        p13.hostName = "Divakar";
        p13.genre = "Career";
        p13.episodeNumber = 13;
        p13.duration = 39;

        Guest g13 = new Guest();
        g13.guestId = 13;
        g13.name = "Manoj";
        g13.profession = "HR";
        g13.experience = 10;
        g13.topic = "Interviews";

        p13.guest = g13;
        p13.getPodcastDetails();


        Podcast p14 = new Podcast();
        p14.podcastName = "Sports Talk";
        p14.hostName = "Rohit";
        p14.genre = "Sports";
        p14.episodeNumber = 14;
        p14.duration = 46;

        Guest g14 = new Guest();
        g14.guestId = 14;
        g14.name = "Virat";
        g14.profession = "Cricketer";
        g14.experience = 15;
        g14.topic = "Cricket";

        p14.guest = g14;
        p14.getPodcastDetails();


        Podcast p15 = new Podcast();
        p15.podcastName = "Music Vibes";
        p15.hostName = "Neha";
        p15.genre = "Music";
        p15.episodeNumber = 15;
        p15.duration = 37;

        Guest g15 = new Guest();
        g15.guestId = 15;
        g15.name = "Armaan";
        g15.profession = "Singer";
        g15.experience = 8;
        g15.topic = "Bollywood Music";

        p15.guest = g15;
        p15.getPodcastDetails();


        Podcast p16 = new Podcast();
        p16.podcastName = "History Hub";
        p16.hostName = "Amit";
        p16.genre = "History";
        p16.episodeNumber = 16;
        p16.duration = 52;

        Guest g16 = new Guest();
        g16.guestId = 16;
        g16.name = "Dr. Sharma";
        g16.profession = "Historian";
        g16.experience = 20;
        g16.topic = "Ancient India";

        p16.guest = g16;
        p16.getPodcastDetails();


        Podcast p17 = new Podcast();
        p17.podcastName = "Startup Cafe";
        p17.hostName = "Rahul";
        p17.genre = "Business";
        p17.episodeNumber = 17;
        p17.duration = 49;

        Guest g17 = new Guest();
        g17.guestId = 17;
        g17.name = "Naveen";
        g17.profession = "Founder";
        g17.experience = 9;
        g17.topic = "Funding";

        p17.guest = g17;
        p17.getPodcastDetails();


        Podcast p18 = new Podcast();
        p18.podcastName = "Art & Culture";
        p18.hostName = "Priya";
        p18.genre = "Art";
        p18.episodeNumber = 18;
        p18.duration = 33;

        Guest g18 = new Guest();
        g18.guestId = 18;
        g18.name = "Sunil";
        g18.profession = "Artist";
        g18.experience = 12;
        g18.topic = "Painting";

        p18.guest = g18;
        p18.getPodcastDetails();


        Podcast p19 = new Podcast();
        p19.podcastName = "Daily News";
        p19.hostName = "Kiran";
        p19.genre = "News";
        p19.episodeNumber = 19;
        p19.duration = 25;

        Guest g19 = new Guest();
        g19.guestId = 19;
        g19.name = "Reporter Anu";
        g19.profession = "Journalist";
        g19.experience = 7;
        g19.topic = "Current Affairs";

        p19.guest = g19;
        p19.getPodcastDetails();


        Podcast p20 = new Podcast();
        p20.podcastName = "Life Talks";
        p20.hostName = "Sneha";
        p20.genre = "Motivation";
        p20.episodeNumber = 20;
        p20.duration = 40;

        Guest g20 = new Guest();
        g20.guestId = 20;
        g20.name = "Sandeep";
        g20.profession = "Motivational Speaker";
        g20.experience = 18;
        g20.topic = "Success";

        p20.guest = g20;
        p20.getPodcastDetails();
    }
}