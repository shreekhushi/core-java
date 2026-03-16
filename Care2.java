class Care2{
	public static void logIn(String username, String password){
		System.out.println("Care2 login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int deviceId){
		System.out.println("Care2 login using mobile and deviceId");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Id: " + deviceId);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, 1234);
	}
}