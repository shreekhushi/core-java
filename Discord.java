class Discord{
	public static void logIn(String email, String password){
		System.out.println("Discord login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String authToken){
		System.out.println("Discord login using mobile and authToken");
		System.out.println("Mobile: " + mobileNumber);
		System.out.println("AuthToken: " + authToken);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, "qwjikts1jdhb");
	}
}