class FigmaCommunity{
	public static void logIn(String username, String password){
		System.out.println("FigmaCommunity login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String deviceId){
		System.out.println("FigmaCommunity login using mobile and deviceId");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Device Id: " + deviceId);
	}

	public static void main(String[] args){
		logIn("figma_user","figma@123");
		logIn(8296897154L,"DEV12345");
	}
}	