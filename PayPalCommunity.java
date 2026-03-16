class PayPalCommunity{
	public static void logIn(String username, String password){
		System.out.println("PayPalCommunity login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, int otp){
		System.out.println("PayPalCommunity login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("paypal_user","paypal@123");
		logIn(8296897154L,7890);
	}
}