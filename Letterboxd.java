class Letterboxd{
	public static void logIn(String username, String password){
		System.out.println("Letterboxd login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int securityKey){
		System.out.println("Letterboxd login using mobile and securityKey");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Security Key: " + securityKey);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, 125);
	}
}