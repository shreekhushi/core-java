class Xiaohongshu{
	public static void logIn(String username, String password){
		System.out.println("Xiaohongshu login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	public static void logIn(long mobileNumber, int verificationCode){
		System.out.println("Xiaohongshu login using mobile and verificationCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Verification Code: " + verificationCode);
	}
	
	public static void main(String[] args){
	    logIn("khushi", "khushi@15");
		logIn(8296897154L, 1234);
	}
}