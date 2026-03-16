class SpaceXCommunity{
	public static void logIn(String username, String password){
		System.out.println("SpaceXCommunity login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String deviceId){
		System.out.println("SpaceXCommunity login using mobile and deviceId");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Id: " + deviceId);
	}

	public static void main(String[] args){
		logIn("spacex_user","spacex@123");
		logIn(8296897154L,"DEV6789");
	}
}