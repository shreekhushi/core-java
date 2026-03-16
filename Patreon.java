class Patreon{
	public static void logIn(String email, String password){
		System.out.println("Patreon login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int securityKey){
		System.out.println("Patreon login using mobile and securityKey");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Security Key: " + securityKey);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, 4563);
	}
}