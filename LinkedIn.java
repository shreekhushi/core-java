class LinkedIn{
	public static void logIn(String email, String password){
		System.out.println("LinkedIn login using email and password");
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, String verificationCode){
		System.out.println("LinkedIn login using mobile and verification code");
		System.out.println("Mobile: " + mobileNumber);
		System.out.println("Code: " + verificationCode);
	}
	
	public static void main(String[] args){
	    logIn("khushi@gmail.com", "khushi@15");
		logIn(8296897154L, "1234");
	}
}