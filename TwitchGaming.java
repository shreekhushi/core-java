class TwitchGaming{
	public static void logIn(String username, String password){
		System.out.println("TwitchGaming login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int otp){
		System.out.println("TwitchGaming login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("twitch_user","twitch@123");
		logIn(8296897154L,3456);
	}
}