class Threads{
	public static void logIn(String username, String password){
		System.out.println("Threads login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, int sessionId){
		System.out.println("Threads login using mobile and sessionId");
		System.out.println("Mobile: " + mobileNumber);
		System.out.println("SessionId: " + sessionId);
	}
	
	public static void main(String[] args){
	    logIn("khushim", "khushi@15");
		logIn(8296897154L, 1234);
	}
}