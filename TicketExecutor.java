class TicketExecutor{

    public static void main(String[] args) {

        Movie movie = new Movie();

        Ticket t1 = new Ticket();
        t1.ticketId = 1;
        t1.ticketName = "Gold";
        t1.movieName = "Leo";
        t1.date = "25-04-2026";
        t1.timings = "10:00 AM";
		
        boolean added = movie.addTicket(t1);
        System.out.println(added);

        Ticket t2 = new Ticket();
        t2.ticketId = 2;
        t2.ticketName = "Silver";
        t2.movieName = "KGF";
        t2.date = "26-04-2026";
        t2.timings = "1:00 PM";
		
        added = movie.addTicket(t2);
        System.out.println(added);

        Ticket t3 = new Ticket();
        t3.ticketId = 3;
        t3.ticketName = "Platinum";
        t3.movieName = "RRR";
        t3.date = "27-04-2026";
        t3.timings = "4:00 PM";
        added = movie.addTicket(t3);
        System.out.println(added);

        Ticket t4 = new Ticket();
        t4.ticketId = 4;
        t4.ticketName = "Balcony";
        t4.movieName = "Pushpa";
        t4.date = "28-04-2026";
        t4.timings = "7:00 PM";
        added = movie.addTicket(t4);
        System.out.println(added);

        Ticket t5 = new Ticket();
        t5.ticketId = 5;
        t5.ticketName = "Regular";
        t5.movieName = "Jawan";
        t5.date = "29-04-2026";
        t5.timings = "9:30 PM";
		
        added = movie.addTicket(t5);
        System.out.println(added);

        movie.getAllTickets();

        movie.searchTicket(3);
		
		System.out.println("------------------");

        boolean update = movie.updateTicket(4,"Regular");
		System.out.println(update);
		
		movie.getAllTickets();
		
		boolean delete = movie.deleteTicket("Jawan");
		System.out.println(delete);
		
		movie.getAllTickets();
    }
}