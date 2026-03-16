class LeetCode{
	public static void logIn(String username, String password){
		System.out.println("LeetCode login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int otp){
		System.out.println("LeetCode login using mobile and OTP");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("OTP: " + otp);
	}

	public static void main(String[] args){
		logIn("leetcode_user","leetcode@123");
		logIn(8296897154L,2345);
	}
}