class Diaspora{
	public static void logIn(String username, String password){
		System.out.println("Diaspora login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int deviceId){
		System.out.println("Diaspora login using mobile and deviceFingerprint");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Fingerprint: " + deviceId);
	}
	
	public static void main(String[] args){
	    logIn("khushi", "khushi@15");
		logIn(8296897154L, 1234);
	}
}