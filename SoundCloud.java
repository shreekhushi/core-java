class SoundCloud{
	public static void logIn(String username, String password){
		System.out.println("SoundCloud login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int securityCode){
		System.out.println("SoundCloud login using mobile and securityCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Security Code: " + securityCode);
	}
	
	public static void main(String[] args){
	    logIn("khushi", "khushi@15");
		logIn(8296897154L, 8526);
	}
}