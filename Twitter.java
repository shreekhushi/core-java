class Twitter{
	public static void logIn(String username, String password){
		System.out.println("Twitter login using username and password");
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}

	public static void logIn(long mobileNumber, int securityCode){
		System.out.println("Twitter login using mobile and security code");
		System.out.println("Mobile: " + mobileNumber);
		System.out.println("Security Code: " + securityCode);
	}
	
	public static void main(String[] args){
	    logIn("khushi_04", "khushi@15");
		logIn(8296897154L, 1245);
	}
}