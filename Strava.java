class Strava{
	public static void logIn(String email, String password){
		System.out.println("Strava login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int otp){
		System.out.println("Strava login using mobile and deviceFingerprint");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Fingerprint: " + otp);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, 1234);
	}
}
