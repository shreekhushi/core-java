class WeChat{
	public static void logIn(String username, String password){
		System.out.println("WeChat login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String securityKey){
		System.out.println("WeChat login using mobile and securityKey");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Security Key: " + securityKey);
	}

	public static void main(String[] args){
		logIn("wechat_user","wechat@123");
		logIn(8296897154L,"SEC999");
	}
}