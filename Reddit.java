class Reddit{
	public static void logIn(String username, String password){
		System.out.println("Reddit login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, int recoveryCode){
		System.out.println("Reddit login using mobile and recovery code");
		System.out.println("Mobile: " + mobileNumber);
		System.out.println("Recovery Code: " + recoveryCode);
	}
	
	public static void main(String[] args){
	    logIn("khushishree", "khushi@15");
		logIn(8296897154L, 1234);
	}
}