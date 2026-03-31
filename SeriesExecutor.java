class SeriesExecutor{

    public static void main(String[] args) {

        Series s1 = new Series();
        s1.seriesName = "Money Heist";
        s1.genre = "Crime";
        s1.totalSeasons = 5;
        s1.platform = "Netflix";
        s1.language = "Spanish";

        Episode e1 = new Episode();
        e1.episodeNumber = 1;
        e1.title = "Pilot";
        e1.duration = 45;
        e1.releaseDate = "2017";
        e1.rating = "8.5";

        s1.episode = e1;
        s1.getSeriesDetails();


        Series s2 = new Series();
        s2.seriesName = "Stranger Things";
        s2.genre = "Sci-Fi";
        s2.totalSeasons = 4;
        s2.platform = "Netflix";
        s2.language = "English";

        Episode e2 = new Episode();
        e2.episodeNumber = 2;
        e2.title = "The Vanishing";
        e2.duration = 50;
        e2.releaseDate = "2016";
        e2.rating = "8.7";

        s2.episode = e2;
        s2.getSeriesDetails();


        Series s3 = new Series();
        s3.seriesName = "Breaking Bad";
        s3.genre = "Drama";
        s3.totalSeasons = 5;
        s3.platform = "AMC";
        s3.language = "English";

        Episode e3 = new Episode();
        e3.episodeNumber = 3;
        e3.title = "Cat's in the Bag";
        e3.duration = 47;
        e3.releaseDate = "2008";
        e3.rating = "9.0";

        s3.episode = e3;
        s3.getSeriesDetails();


        Series s4 = new Series();
        s4.seriesName = "Game of Thrones";
        s4.genre = "Fantasy";
        s4.totalSeasons = 8;
        s4.platform = "HBO";
        s4.language = "English";

        Episode e4 = new Episode();
        e4.episodeNumber = 4;
        e4.title = "Winter Is Coming";
        e4.duration = 60;
        e4.releaseDate = "2011";
        e4.rating = "9.2";

        s4.episode = e4;
        s4.getSeriesDetails();


        Series s5 = new Series();
        s5.seriesName = "Friends";
        s5.genre = "Comedy";
        s5.totalSeasons = 10;
        s5.platform = "NBC";
        s5.language = "English";

        Episode e5 = new Episode();
        e5.episodeNumber = 5;
        e5.title = "The One Where It All Began";
        e5.duration = 22;
        e5.releaseDate = "1994";
        e5.rating = "8.9";

        s5.episode = e5;
        s5.getSeriesDetails();


        Series s6 = new Series();
        s6.seriesName = "The Witcher";
        s6.genre = "Fantasy";
        s6.totalSeasons = 3;
        s6.platform = "Netflix";
        s6.language = "English";

        Episode e6 = new Episode();
        e6.episodeNumber = 6;
        e6.title = "The End's Beginning";
        e6.duration = 61;
        e6.releaseDate = "2019";
        e6.rating = "8.2";

        s6.episode = e6;
        s6.getSeriesDetails();


        Series s7 = new Series();
        s7.seriesName = "Mirzapur";
        s7.genre = "Crime";
        s7.totalSeasons = 2;
        s7.platform = "Amazon Prime";
        s7.language = "Hindi";

        Episode e7 = new Episode();
        e7.episodeNumber = 7;
        e7.title = "Jhandu";
        e7.duration = 45;
        e7.releaseDate = "2018";
        e7.rating = "8.4";

        s7.episode = e7;
        s7.getSeriesDetails();


        Series s8 = new Series();
        s8.seriesName = "Sacred Games";
        s8.genre = "Thriller";
        s8.totalSeasons = 2;
        s8.platform = "Netflix";
        s8.language = "Hindi";

        Episode e8 = new Episode();
        e8.episodeNumber = 8;
        e8.title = "Ashwatthama";
        e8.duration = 50;
        e8.releaseDate = "2018";
        e8.rating = "8.6";

        s8.episode = e8;
        s8.getSeriesDetails();


        Series s9 = new Series();
        s9.seriesName = "Dark";
        s9.genre = "Sci-Fi";
        s9.totalSeasons = 3;
        s9.platform = "Netflix";
        s9.language = "German";

        Episode e9 = new Episode();
        e9.episodeNumber = 9;
        e9.title = "Secrets";
        e9.duration = 52;
        e9.releaseDate = "2017";
        e9.rating = "8.8";

        s9.episode = e9;
        s9.getSeriesDetails();


        Series s10 = new Series();
        s10.seriesName = "Peaky Blinders";
        s10.genre = "Crime";
        s10.totalSeasons = 6;
        s10.platform = "BBC";
        s10.language = "English";

        Episode e10 = new Episode();
        e10.episodeNumber = 10;
        e10.title = "Episode 1";
        e10.duration = 58;
        e10.releaseDate = "2013";
        e10.rating = "8.7";

        s10.episode = e10;
        s10.getSeriesDetails();


        Series s11 = new Series();
        s11.seriesName = "The Office";
        s11.genre = "Comedy";
        s11.totalSeasons = 9;
        s11.platform = "NBC";
        s11.language = "English";

        Episode e11 = new Episode();
        e11.episodeNumber = 11;
        e11.title = "Pilot";
        e11.duration = 22;
        e11.releaseDate = "2005";
        e11.rating = "8.5";

        s11.episode = e11;
        s11.getSeriesDetails();


        Series s12 = new Series();
        s12.seriesName = "Lucifer";
        s12.genre = "Fantasy";
        s12.totalSeasons = 6;
        s12.platform = "Netflix";
        s12.language = "English";

        Episode e12 = new Episode();
        e12.episodeNumber = 12;
        e12.title = "Pilot";
        e12.duration = 45;
        e12.releaseDate = "2016";
        e12.rating = "8.1";

        s12.episode = e12;
        s12.getSeriesDetails();


        Series s13 = new Series();
        s13.seriesName = "Wednesday";
        s13.genre = "Mystery";
        s13.totalSeasons = 1;
        s13.platform = "Netflix";
        s13.language = "English";

        Episode e13 = new Episode();
        e13.episodeNumber = 13;
        e13.title = "Wednesday's Child";
        e13.duration = 50;
        e13.releaseDate = "2022";
        e13.rating = "8.3";

        s13.episode = e13;
        s13.getSeriesDetails();


        Series s14 = new Series();
        s14.seriesName = "House of Dragons";
        s14.genre = "Fantasy";
        s14.totalSeasons = 1;
        s14.platform = "HBO";
        s14.language = "English";

        Episode e14 = new Episode();
        e14.episodeNumber = 14;
        e14.title = "Heirs of the Dragon";
        e14.duration = 60;
        e14.releaseDate = "2022";
        e14.rating = "8.6";

        s14.episode = e14;
        s14.getSeriesDetails();


        Series s15 = new Series();
        s15.seriesName = "Narcos";
        s15.genre = "Crime";
        s15.totalSeasons = 3;
        s15.platform = "Netflix";
        s15.language = "English";

        Episode e15 = new Episode();
        e15.episodeNumber = 15;
        e15.title = "Descenso";
        e15.duration = 49;
        e15.releaseDate = "2015";
        e15.rating = "8.7";

        s15.episode = e15;
        s15.getSeriesDetails();


        Series s16 = new Series();
        s16.seriesName = "Sherlock";
        s16.genre = "Mystery";
        s16.totalSeasons = 4;
        s16.platform = "BBC";
        s16.language = "English";

        Episode e16 = new Episode();
        e16.episodeNumber = 16;
        e16.title = "A Study in Pink";
        e16.duration = 88;
        e16.releaseDate = "2010";
        e16.rating = "9.1";

        s16.episode = e16;
        s16.getSeriesDetails();


        Series s17 = new Series();
        s17.seriesName = "The Boys";
        s17.genre = "Action";
        s17.totalSeasons = 3;
        s17.platform = "Amazon Prime";
        s17.language = "English";

        Episode e17 = new Episode();
        e17.episodeNumber = 17;
        e17.title = "The Name of the Game";
        e17.duration = 60;
        e17.releaseDate = "2019";
        e17.rating = "8.7";

        s17.episode = e17;
        s17.getSeriesDetails();


        Series s18 = new Series();
        s18.seriesName = "Money Heist Korea";
        s18.genre = "Crime";
        s18.totalSeasons = 1;
        s18.platform = "Netflix";
        s18.language = "Korean";

        Episode e18 = new Episode();
        e18.episodeNumber = 18;
        e18.title = "Episode 1";
        e18.duration = 60;
        e18.releaseDate = "2022";
        e18.rating = "7.8";

        s18.episode = e18;
        s18.getSeriesDetails();


        Series s19 = new Series();
        s19.seriesName = "Scam 1992";
        s19.genre = "Drama";
        s19.totalSeasons = 1;
        s19.platform = "SonyLIV";
        s19.language = "Hindi";

        Episode e19 = new Episode();
        e19.episodeNumber = 19;
        e19.title = "Harshad Mehta";
        e19.duration = 54;
        e19.releaseDate = "2020";
        e19.rating = "9.5";

        s19.episode = e19;
        s19.getSeriesDetails();


        Series s20 = new Series();
        s20.seriesName = "Family Man";
        s20.genre = "Action";
        s20.totalSeasons = 2;
        s20.platform = "Amazon Prime";
        s20.language = "Hindi";

        Episode e20 = new Episode();
        e20.episodeNumber = 20;
        e20.title = "Pilot";
        e20.duration = 45;
        e20.releaseDate = "2019";
        e20.rating = "8.6";

        s20.episode = e20;
        s20.getSeriesDetails();
    }
}