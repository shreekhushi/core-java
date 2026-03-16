class RedditGaming{
	public static void logIn(String username, String password){
		System.out.println("RedditGaming login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, String recoveryCode){
		System.out.println("RedditGaming login using mobile and recoveryCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Recovery Code: " + recoveryCode);
	}

	public static void main(String[] args){
		logIn("reddit_user","reddit@123");
		logIn(8296897154L,"REC789");
	}
}