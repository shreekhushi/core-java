class Bluesky{
	public static void logIn(String username, String password){
		System.out.println("Bluesky login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String deviceId){
		System.out.println("Bluesky login using mobile and deviceId");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Id: " + deviceId);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, "shre123");
	}
}