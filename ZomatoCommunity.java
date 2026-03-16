class ZomatoCommunity{
	public static void logIn(String username, String password){
		System.out.println("ZomatoCommunity login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String deviceId){
		System.out.println("ZomatoCommunity login using mobile and deviceId");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Id: " + deviceId);
	}

	public static void main(String[] args){
		logIn("zomato_user","zomato@123");
		logIn(8296897154L,"DEV2345");
	}
}