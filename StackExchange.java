class StackExchange{
	public static void logIn(String username, String password){
		System.out.println("StackExchange login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int otp){
		System.out.println("StackExchange login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}
	
	public static void main(String[] args){
	    logIn("khushi", "khushi@15");
		logIn(8296897154L, 1234);
	}
}