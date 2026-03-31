class MovieExecutor{

    public static void main(String[] args) {

        Movie m1 = new Movie();
        m1.movieName = "KGF";
        m1.director = "Prashanth Neel";
        m1.genre = "Action";
        m1.budget = 80000000;
        m1.duration = 150;

        Actor a1 = new Actor();
        a1.actorId = 1;
        a1.name = "Yash";
        a1.age = 38;
        a1.role = "Hero";
        a1.salary = 20000000;

        m1.actor = a1;
        m1.getMovieDetails();


        Movie m2 = new Movie();
        m2.movieName = "Pushpa";
        m2.director = "Sukumar";
        m2.genre = "Action";
        m2.budget = 100000000;
        m2.duration = 170;

        Actor a2 = new Actor();
        a2.actorId = 2;
        a2.name = "Allu Arjun";
        a2.age = 41;
        a2.role = "Hero";
        a2.salary = 25000000;

        m2.actor = a2;
        m2.getMovieDetails();


        Movie m3 = new Movie();
        m3.movieName = "RRR";
        m3.director = "S. S. Rajamouli";
        m3.genre = "Historical";
        m3.budget = 200000000;
        m3.duration = 180;

        Actor a3 = new Actor();
        a3.actorId = 3;
        a3.name = "Ram Charan";
        a3.age = 39;
        a3.role = "Hero";
        a3.salary = 30000000;

        m3.actor = a3;
        m3.getMovieDetails();


        Movie m4 = new Movie();
        m4.movieName = "Jawan";
        m4.director = "Atlee";
        m4.genre = "Action";
        m4.budget = 150000000;
        m4.duration = 160;

        Actor a4 = new Actor();
        a4.actorId = 4;
        a4.name = "Shah Rukh Khan";
        a4.age = 58;
        a4.role = "Hero";
        a4.salary = 40000000;

        m4.actor = a4;
        m4.getMovieDetails();

        Movie m5 = new Movie();
        m5.movieName = "Animal";
        m5.director = "Sandeep Reddy Vanga";
        m5.genre = "Drama";
        m5.budget = 120000000;
        m5.duration = 165;

        Actor a5 = new Actor();
        a5.actorId = 5;
        a5.name = "Ranbir Kapoor";
        a5.age = 42;
        a5.role = "Hero";
        a5.salary = 22000000;

        m5.actor = a5;
        m5.getMovieDetails();


        Movie m6 = new Movie();
        m6.movieName = "Leo";
        m6.director = "Lokesh Kanagaraj";
        m6.genre = "Action";
        m6.budget = 130000000;
        m6.duration = 158;

        Actor a6 = new Actor();
        a6.actorId = 6;
        a6.name = "Vijay";
        a6.age = 49;
        a6.role = "Hero";
        a6.salary = 30000000;

        m6.actor = a6;
        m6.getMovieDetails();


        Movie m7 = new Movie();
        m7.movieName = "Salaar";
        m7.director = "Prashanth Neel";
        m7.genre = "Action";
        m7.budget = 180000000;
        m7.duration = 175;

        Actor a7 = new Actor();
        a7.actorId = 7;
        a7.name = "Prabhas";
        a7.age = 45;
        a7.role = "Hero";
        a7.salary = 35000000;

        m7.actor = a7;
        m7.getMovieDetails();


        Movie m8 = new Movie();
        m8.movieName = "Master";
        m8.director = "Lokesh Kanagaraj";
        m8.genre = "Action";
        m8.budget = 90000000;
        m8.duration = 150;

        Actor a8 = new Actor();
        a8.actorId = 8;
        a8.name = "Vijay Sethupathi";
        a8.age = 46;
        a8.role = "Villain";
        a8.salary = 15000000;

        m8.actor = a8;
        m8.getMovieDetails();


        Movie m9 = new Movie();
        m9.movieName = "Pathaan";
        m9.director = "Siddharth Anand";
        m9.genre = "Action";
        m9.budget = 140000000;
        m9.duration = 146;

        Actor a9 = new Actor();
        a9.actorId = 9;
        a9.name = "Deepika Padukone";
        a9.age = 38;
        a9.role = "Heroine";
        a9.salary = 12000000;

        m9.actor = a9;
        m9.getMovieDetails();


        Movie m10 = new Movie();
        m10.movieName = "Bahubali";
        m10.director = "S. S. Rajamouli";
        m10.genre = "Historical";
        m10.budget = 250000000;
        m10.duration = 170;

        Actor a10 = new Actor();
        a10.actorId = 10;
        a10.name = "Anushka Shetty";
        a10.age = 42;
        a10.role = "Queen";
        a10.salary = 10000000;

        m10.actor = a10;
        m10.getMovieDetails();


        Movie m11 = new Movie();
        m11.movieName = "Don";
        m11.director = "Farhan Akhtar";
        m11.genre = "Action";
        m11.budget = 110000000;
        m11.duration = 155;

        Actor a11 = new Actor();
        a11.actorId = 11;
        a11.name = "Priyanka Chopra";
        a11.age = 41;
        a11.role = "Heroine";
        a11.salary = 15000000;

        m11.actor = a11;
        m11.getMovieDetails();


        Movie m12 = new Movie();
        m12.movieName = "War";
        m12.director = "Siddharth Anand";
        m12.genre = "Action";
        m12.budget = 170000000;
        m12.duration = 154;

        Actor a12 = new Actor();
        a12.actorId = 12;
        a12.name = "Hrithik Roshan";
        a12.age = 50;
        a12.role = "Hero";
        a12.salary = 35000000;

        m12.actor = a12;
        m12.getMovieDetails();


        Movie m13 = new Movie();
        m13.movieName = "Dangal";
        m13.director = "Nitesh Tiwari";
        m13.genre = "Drama";
        m13.budget = 70000000;
        m13.duration = 161;

        Actor a13 = new Actor();
        a13.actorId = 13;
        a13.name = "Aamir Khan";
        a13.age = 59;
        a13.role = "Coach";
        a13.salary = 25000000;

        m13.actor = a13;
        m13.getMovieDetails();


        Movie m14 = new Movie();
        m14.movieName = "Kabir Singh";
        m14.director = "Sandeep Reddy Vanga";
        m14.genre = "Romance";
        m14.budget = 60000000;
        m14.duration = 155;

        Actor a14 = new Actor();
        a14.actorId = 14;
        a14.name = "Shahid Kapoor";
        a14.age = 43;
        a14.role = "Hero";
        a14.salary = 20000000;

        m14.actor = a14;
        m14.getMovieDetails();


        Movie m15 = new Movie();
        m15.movieName = "Sita Ramam";
        m15.director = "Hanu Raghavapudi";
        m15.genre = "Romance";
        m15.budget = 50000000;
        m15.duration = 158;

        Actor a15 = new Actor();
        a15.actorId = 15;
        a15.name = "Dulquer Salmaan";
        a15.age = 38;
        a15.role = "Hero";
        a15.salary = 18000000;

        m15.actor = a15;
        m15.getMovieDetails();


        Movie m16 = new Movie();
        m16.movieName = "Eega";
        m16.director = "S. S. Rajamouli";
        m16.genre = "Fantasy";
        m16.budget = 40000000;
        m16.duration = 145;

        Actor a16 = new Actor();
        a16.actorId = 16;
        a16.name = "Nani";
        a16.age = 40;
        a16.role = "Hero";
        a16.salary = 12000000;

        m16.actor = a16;
        m16.getMovieDetails();


        Movie m17 = new Movie();
        m17.movieName = "KGF 2";
        m17.director = "Prashanth Neel";
        m17.genre = "Action";
        m17.budget = 120000000;
        m17.duration = 168;

        Actor a17 = new Actor();
        a17.actorId = 17;
        a17.name = "Sanjay Dutt";
        a17.age = 65;
        a17.role = "Villain";
        a17.salary = 18000000;

        m17.actor = a17;
        m17.getMovieDetails();


        Movie m18 = new Movie();
        m18.movieName = "Pushpa 2";
        m18.director = "Sukumar";
        m18.genre = "Action";
        m18.budget = 200000000;
        m18.duration = 175;

        Actor a18 = new Actor();
        a18.actorId = 18;
        a18.name = "Rashmika";
        a18.age = 29;
        a18.role = "Heroine";
        a18.salary = 10000000;

        m18.actor = a18;
        m18.getMovieDetails();


        Movie m19 = new Movie();
        m19.movieName = "Jailer";
        m19.director = "Nelson";
        m19.genre = "Action";
        m19.budget = 90000000;
        m19.duration = 150;

        Actor a19 = new Actor();
        a19.actorId = 19;
        a19.name = "Rajinikanth";
        a19.age = 73;
        a19.role = "Hero";
        a19.salary = 35000000;

        m19.actor = a19;
        m19.getMovieDetails();


        Movie m20 = new Movie();
        m20.movieName = "Vikram";
        m20.director = "Lokesh Kanagaraj";
        m20.genre = "Action";
        m20.budget = 110000000;
        m20.duration = 160;

        Actor a20 = new Actor();
        a20.actorId = 20;
        a20.name = "Kamal Haasan";
        a20.age = 69;
        a20.role = "Hero";
        a20.salary = 30000000;

        m20.actor = a20;
        m20.getMovieDetails();
    }
}