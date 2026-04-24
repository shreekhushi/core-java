class Movie{
     
	Ticket tickets[] = new Ticket[5];
	int index;
	
	public boolean addTicket(Ticket ticket){
		boolean isAdded = false;
		
		boolean isTicketIdValid =false;
		boolean isTicketNameValid =false;
		boolean isMovieNameValid =false;
		boolean isDateValid =false;
		boolean isTimingsValid =false;
		
		if(ticket.ticketId > 0){
			isTicketIdValid = true;
		} else System.out.println("id not valid");
		
		if(ticket.ticketName != null && !ticket.ticketName.isEmpty()){
			isTicketNameValid = true;
		} else System.out.println("name not valid");
		
		if(ticket.movieName!= null && !ticket.movieName.isEmpty()){
			isMovieNameValid = true;
	    } else System.out.println("movie name not found");
		
		if(ticket.date != null && !ticket.date.isEmpty()){
			isDateValid = true;
		} else System.out.println("date not valid");
		
		if(ticket.timings != null && !ticket.timings.isEmpty()){
			isTimingsValid = true;
		} else System.out.println("time not valid");
		
		if(isTicketIdValid && isTicketNameValid && isMovieNameValid && isDateValid && isTimingsValid){
			tickets[index++] = ticket;
			isAdded = true;
		}
		return isAdded;
	}
	
	public void getAllTickets() {
        for (Ticket ticket : tickets){
		if (ticket != null){
        System.out.println("the id of ticket is: " +ticket.ticketId);
		System.out.println("the name of ticket is: " +ticket.ticketName);
		System.out.println("the movie name is: " +ticket.movieName);
		System.out.println("the date is: " +ticket.date);
		System.out.println("the timings is: " +ticket.timings);
		System.out.println("---------------------------");
         }
        }
	}
    
	 public void searchTicket(int ticketId) {
		System.out.println("search invoked");
        boolean isSearched = false;

        for (Ticket ticket : tickets) {
            if (ticket.ticketId == ticketId) {
                ticket.getTicketDetails();
                isSearched = true;
                break;
            }
        }

        if (isSearched == false) {
            System.out.println("Ticket not found");
        }
    }
	
	public boolean updateTicket(int ticketId, String newTicketName){
	System.out.println("updateTicket invoked");
    boolean isUpdated = false;

    for (int i = 0; i < tickets.length; i++) {
        if (tickets[i] != null && tickets[i].ticketId == ticketId) {
            tickets[i].ticketName = newTicketName;
            isUpdated = true;
            break;
        }
    }

    if (!isUpdated){
        System.out.println("Id not found");
    }
    return isUpdated;
  }
	
	public boolean deleteTicket(String movieName) {
		System.out.println("deleteTicket invoked");
        boolean isDeleted = false;

        for (int index = 0; index < tickets.length; index++) {
            if (tickets[index] != null && tickets[index].movieName.equals(movieName)) {
                tickets[index] = null;
                isDeleted = true;
                break;
            }
        }
		
		if(isDeleted == false){
			System.out.println("name not found");
		}
		return isDeleted;
	}


}
