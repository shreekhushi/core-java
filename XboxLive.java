class XboxLive{
	public static void logIn(String username, String password){
		System.out.println("XboxLive login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String securityCode){
		System.out.println("XboxLive login using mobile and securityCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Security Code: " + securityCode);
	}

	public static void main(String[] args){
		logIn("xbox_user","xbox@123");
		logIn(8296897154L,"SEC456");
	}
}