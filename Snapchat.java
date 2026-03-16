class Snapchat{
	public static void logIn(String email, String password){
		System.out.println("Snapchat login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String deviceId){
		System.out.println("Snapchat login using mobile and deviceId");
		System.out.println("Mobile: " + mobileNumber);
		System.out.println("DeviceId: " + deviceId);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, "khushi123");
	}
}