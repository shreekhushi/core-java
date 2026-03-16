class WooCommerceCommunity{
	public static void logIn(String username, String password){
		System.out.println("WooCommerceCommunity login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String verificationToken){
		System.out.println("WooCommerceCommunity login using mobile and verificationToken");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Verification Token: " + verificationToken);
	}

	public static void main(String[] args){
		logIn("woo_user","woo@123");
		logIn(8296897154L,"TOKEN456");
	}
}