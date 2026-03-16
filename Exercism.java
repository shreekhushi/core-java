class Exercism{
	public static void logIn(String username, String password){
		System.out.println("Exercism login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String verificationCode){
		System.out.println("Exercism login using mobile and verificationCode");
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Verification Code: " + verificationCode);
	}

	public static void main(String[] args){
		logIn("exercism_user","exer@123");
		logIn(8296897154L,"VER789");
	}
}