class OppoCommunity{
	public static void logIn(String username, String password){
		System.out.println("OppoCommunity login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int otp){
		System.out.println("OppoCommunity login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("oppo_user","oppo@123");
		logIn(8296897154L,3456);
	}
}