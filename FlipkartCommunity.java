class FlipkartCommunity{
	public static void logIn(String username, String password){
		System.out.println("FlipkartCommunity login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String verificationCode){
		System.out.println("FlipkartCommunity login using mobile and verificationCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Verification Code: " + verificationCode);
	}

	public static void main(String[] args){
		logIn("flipkart_user","flipkart@123");
		logIn(8296897154L,"VER123");
	}
}