class Ticket{
	
	int ticketId;
	String ticketName;
	String movieName;
	String date;
	String timings;
	
	public void getTicketDetails(){
		System.out.println("the id of ticket is: " +ticketId);
		System.out.println("the name of ticket is: " +ticketName);
		System.out.println("the movie name is: " +movieName);
		System.out.println("the date is: " +date);
		System.out.println("the timings is: " +timings);
	}
}